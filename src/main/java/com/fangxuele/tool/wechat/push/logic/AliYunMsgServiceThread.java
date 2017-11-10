package com.fangxuele.tool.wechat.push.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.sms.model.v20160927.SingleSendSmsRequest;
import com.aliyuncs.sms.model.v20160927.SingleSendSmsResponse;

import com.fangxuele.tool.wechat.push.ui.Init;
import com.fangxuele.tool.wechat.push.ui.MainWindow;

/**
 * 阿里模板短信发送服务线程
 * Created by rememberber(https://github.com/rememberber) on 2017/3/29.
 */
public class AliYunMsgServiceThread extends BaseMsgServiceThread {

    /**
     * 构造函数
     *
     * @param pageFrom 起始页
     * @param pageTo   截止页
     * @param pageSize 页大小
     */
    public AliYunMsgServiceThread(int pageFrom, int pageTo, int pageSize) {
        super(pageFrom, pageTo, pageSize);
    }

    @Override
    public void run() {

        // 初始化当前线程
        initCurrentThread();
        IAcsClient client = null;
        try {
            IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", Init.configer.getAliYunKey(), Init.configer.getAliYunSecret());
            DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Sms", "sms.aliyuncs.com");
            client = new DefaultAcsClient(profile);
        } catch (ServerException e) {

            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }

        SingleSendSmsRequest singleSendSmsRequest = PushManage.makeAliYunMessage();

        for (int i = 0; i < list.size(); i++) {
            if (!PushData.running) {
                // 停止
                PushData.increaseStopedThread();
                return;
            }

            String telNum = list.get(i);
            try {

                singleSendSmsRequest.setRecNum(telNum);
                // 空跑控制
                if (!MainWindow.mainWindow.getDryRunCheckBox().isSelected()) {

                    SingleSendSmsResponse httpResponse = client.getAcsResponse(singleSendSmsRequest);

                    // 总发送成功+1
                    PushData.increaseSuccess();
                    MainWindow.mainWindow.getPushSuccessCount().setText(String.valueOf(PushData.successRecords));

                    // 当前线程发送成功+1
                    currentThreadSuccessCount++;
                    tableModel.setValueAt(currentThreadSuccessCount, tableRow, 2);

                    // 保存发送成功
                    PushData.sendSuccessList.add(telNum);
                } else {
                    // 总发送成功+1
                    PushData.increaseSuccess();
                    MainWindow.mainWindow.getPushSuccessCount().setText(String.valueOf(PushData.successRecords));

                    // 当前线程发送成功+1
                    currentThreadSuccessCount++;
                    tableModel.setValueAt(currentThreadSuccessCount, tableRow, 2);

                    // 保存发送成功
                    PushData.sendSuccessList.add(telNum);
                }

                PushManage.console(new StringBuffer().append("发送成功,手机号:").append(telNum).toString());

            } catch (Exception e) {
                // 总发送失败+1
                PushData.increaseFail();
                MainWindow.mainWindow.getPushFailCount().setText(String.valueOf(PushData.failRecords));

                // 保存发送失败
                PushData.sendFailList.add(telNum);

                // 失败异常信息输出控制台
                PushManage.console(new StringBuffer().append("发送失败:").append(e.getMessage()).append(";telNum:").append(telNum).toString());

                // 当前线程发送失败+1
                currentThreadFailCount++;
                tableModel.setValueAt(currentThreadFailCount, tableRow, 3);
            }
            // 当前线程进度条
            tableModel.setValueAt((int) ((double) (i + 1) / list.size() * 100), tableRow, 5);

            // 总进度条
            MainWindow.mainWindow.getPushTotalProgressBar().setValue((int) (PushData.successRecords + PushData.failRecords));
        }

        // 当前线程结束
        currentThreadFinish();
    }



}
