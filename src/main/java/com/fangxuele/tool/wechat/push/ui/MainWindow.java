package com.fangxuele.tool.wechat.push.ui;

import com.fangxuele.tool.wechat.push.ui.listener.AboutListener;
import com.fangxuele.tool.wechat.push.ui.listener.FramListener;
import com.fangxuele.tool.wechat.push.ui.listener.MemberListener;
import com.fangxuele.tool.wechat.push.ui.listener.MsgListener;
import com.fangxuele.tool.wechat.push.ui.listener.PushListener;
import com.fangxuele.tool.wechat.push.ui.listener.ScheduleListener;
import com.fangxuele.tool.wechat.push.ui.listener.SettingListener;
import com.fangxuele.tool.wechat.push.ui.listener.TabListener;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.xiaoleilu.hutool.log.Log;
import com.xiaoleilu.hutool.log.LogFactory;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by rememberber(https://github.com/rememberber) on 2017/6/7.
 */
public class MainWindow {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JPanel aboutPanel;
    private JPanel messagePanel;
    private JPanel memberPanel;
    private JPanel pushPanel;
    private JPanel reportPanel;
    private JPanel settingPanel;
    private JLabel companyLabel;
    private JLabel versionLabel;
    private JComboBox msgTypeComboBox;
    private JLabel msgTypeLabel;
    private JPanel templateMsgPanel;
    private JPanel kefuMsgPanel;
    private JTextField previewUserField;
    private JButton previewMsgButton;
    private JLabel previewMemberLabel;
    private JTextField msgTemplateIdTextField;
    private JTextField msgTemplateUrlTextField;
    private JPanel templateMsgDataPanel;
    private JLabel templateIdLabel;
    private JLabel templateUrlLabel;
    private JTextField templateDataNameTextField;
    private JTextField templateDataValueTextField;
    private JTextField templateDataColorTextField;
    private JButton templateMsgDataAddButton;
    private JTable templateMsgDataTable;
    private JLabel templateMsgNameLabel;
    private JLabel templateMsgValueLabel;
    private JLabel templateMsgColorLabel;
    private JComboBox msgKefuMsgTypeComboBox;
    private JTextField msgKefuMsgTitleTextField;
    private JTextField msgKefuPicUrlTextField;
    private JTextField msgKefuDescTextField;
    private JTextField msgKefuUrlTextField;
    private JLabel kefuMsgTypeLabel;
    private JLabel kefuMsgTitleLabel;
    private JLabel kefuMsgPicUrlLabel;
    private JLabel kefuMsgDescLabel;
    private JLabel kefuMsgUrlLabel;
    private JProgressBar memberTabImportProgressBar;
    private JTextArea importFromSqlTextArea;
    private JButton importFromSqlButton;
    private JTextField memberFilePathField;
    private JButton importFromFileButton;
    private JPanel memberTabUpPanel;
    private JPanel memberTabDownPanel;
    private JPanel memberTabCenterPanel;
    private JLabel memberTabCountLabel;
    private JLabel memberTabImportProgressLabel;
    private JLabel importFromFileLabel;
    private JProgressBar pushTotalProgressBar;
    private JTextField pushPageSizeTextField;
    private JTextField pushPagePerThreadTextField;
    private JTextArea pushConsoleTextArea;
    private JTable pushThreadTable;
    private JButton ScheduleRunButton;
    private JLabel pushSuccessCount;
    private JLabel pushFailCount;
    private JButton pushStopButton;
    private JButton pushStartButton;
    private JTextField msgNameField;
    private JComboBox msgHistoryComboBox;
    private JButton msgSaveButton;
    private JLabel msgHistoryLabel;
    private JLabel msgNameLabel;
    private JPanel pushUpPanel;
    private JPanel pushDownPanel;
    private JPanel pushCenterPanel;
    private JPanel pushControlPanel;
    private JLabel pushTotalCountLabel;
    private JLabel pushTotalPageLabel;
    private JLabel pushTotalThreadLabel;
    private JLabel pushTotalProgressLabel;
    private JRadioButton runAtThisTimeRadioButton;
    private JTextField startAtThisTimeTextField;
    private JPanel schedulePanel;
    private JRadioButton runPerDayRadioButton;
    private JTextField startPerDayTextField;
    private JRadioButton runPerWeekRadioButton;
    private JButton scheduleSaveButton;
    private JComboBox schedulePerWeekComboBox;
    private JTextField startPerWeekTextField;
    private JTextField wechatAppIdTextField;
    private JPasswordField wechatAppSecretPasswordField;
    private JPasswordField wechatTokenPasswordField;
    private JPasswordField wechatAesKeyPasswordField;
    private JButton settingMpInfoSaveButton;
    private JTextField aliServerUrlTextField;
    private JPasswordField aliAppKeyPasswordField;
    private JTextField aliSignTextField;
    private JButton settingAliInfoSaveButton;
    private JTextField mysqlUrlTextField;
    private JTextField mysqlDatabaseTextField;
    private JTextField mysqlUserTextField;
    private JPasswordField mysqlPasswordField;
    private JButton settingTestDbLinkButton;
    private JButton settingDbInfoSaveButton;
    private JTable msgHistable;
    private JCheckBox dryRunCheckBox;
    private JLabel sloganLabel;
    private JLabel checkUpdateLabel;
    private JButton createMsgButton;
    private JButton memberImportAllButton;
    private JComboBox settingThemeComboBox;
    private JComboBox settingFontNameComboBox;
    private JComboBox settingFontSizeComboBox;
    private JButton settingAppearanceSaveButton;
    private JLabel pushLastTimeLabel;
    private JLabel pushLeftTimeLabel;
    private JLabel pushMsgName;
    private JScrollPane settingScrollPane;
    private JPasswordField aliAppSecretPasswordField;
    private JButton clearImportButton;
    private JComboBox memberHisComboBox;
    private JButton importFromHisButton;
    private JTable importHisTable;
    private JPanel memberHisManagePanel;
    private JButton msgHisTableSelectAllButton;
    private JButton msgHisTableDeleteButton;
    private JButton importHisTableSelectAllButton;
    private JButton importHisTableDeleteButton;
    private JButton msgHisTableUnselectAllButton;
    private JButton importHisTableUnselectAllButton;
    private JLabel scheduleDetailLabel;

    public JPasswordField getAliyunSmsAppKey() {
        return aliyunSmsAppKey;
    }

    public void setAliyunSmsAppKey(String str) {
        this.aliyunSmsAppKey.setText(str);
    }

    private JPasswordField aliyunSmsAppKey;

    public JPasswordField getAliyunSmsAppSecret() {
        return aliyunSmsAppSecret;
    }

    public void setAliyunSmsAppSecret(String str) {
        this.aliyunSmsAppSecret.setText(str);
    }

    private JPasswordField aliyunSmsAppSecret;

    public JTextField getAliyunSmsSign() {
        return aliyunSmsSign;
    }

    public void setAliyunSmsSign(String str) {
        this.aliyunSmsSign.setText(str);
    }


    private JTextField aliyunSmsSign;

    public JButton getSettingAliyunSms() {
        return settingAliyunSms;
    }

    public void setSettingAliyunSms(JButton settingAliyunSms) {
        this.settingAliyunSms = settingAliyunSms;
    }

    private JButton settingAliyunSms;
    public static JFrame frame;

    public static MainWindow mainWindow;
    private static Log logger = LogFactory.get();

    public MainWindow() {

    }

    public static void main(String[] args) {
        logger.info("main start");

        Init.initTheme();
        Init.initGlobalFont();  //统一设置字体

        frame = new JFrame(ConstantsUI.APP_NAME);
        frame.setIconImage(ConstantsUI.IMAGE_ICON);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //得到屏幕的尺寸
        frame.setBounds((int) (screenSize.width * 0.1), (int) (screenSize.height * 0.08), (int) (screenSize.width * 0.8),
                (int) (screenSize.height * 0.8));

        Dimension preferSize = new Dimension((int) (screenSize.width * 0.8),
                (int) (screenSize.height * 0.8));
        frame.setPreferredSize(preferSize);

        mainWindow = new MainWindow();

        frame.setContentPane(mainWindow.mainPanel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Init.initOthers();
        Init.initAllTab();

        // 添加事件监听

        SettingListener.addListeners();
        MsgListener.addListeners();
        MemberListener.addListeners();
        PushListener.addListeners();
        ScheduleListener.addListeners();
        TabListener.addListeners();
        FramListener.addListeners();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }

    public JPanel getAboutPanel() {
        return aboutPanel;
    }

    public void setAboutPanel(JPanel aboutPanel) {
        this.aboutPanel = aboutPanel;
    }

    public JPanel getMessagePanel() {
        return messagePanel;
    }

    public void setMessagePanel(JPanel messagePanel) {
        this.messagePanel = messagePanel;
    }

    public JPanel getMemberPanel() {
        return memberPanel;
    }

    public void setMemberPanel(JPanel memberPanel) {
        this.memberPanel = memberPanel;
    }

    public JPanel getPushPanel() {
        return pushPanel;
    }

    public void setPushPanel(JPanel pushPanel) {
        this.pushPanel = pushPanel;
    }

    public JPanel getReportPanel() {
        return reportPanel;
    }

    public void setReportPanel(JPanel reportPanel) {
        this.reportPanel = reportPanel;
    }

    public JPanel getSettingPanel() {
        return settingPanel;
    }

    public void setSettingPanel(JPanel settingPanel) {
        this.settingPanel = settingPanel;
    }

    public JLabel getCompanyLabel() {
        return companyLabel;
    }

    public void setCompanyLabel(JLabel companyLabel) {
        this.companyLabel = companyLabel;
    }

    public JLabel getVersionLabel() {
        return versionLabel;
    }

    public void setVersionLabel(JLabel versionLabel) {
        this.versionLabel = versionLabel;
    }

    public JComboBox getMsgTypeComboBox() {
        return msgTypeComboBox;
    }

    public void setMsgTypeComboBox(String msgType) {
        this.msgTypeComboBox.setSelectedItem(msgType);
    }

    public JLabel getMsgTypeLabel() {
        return msgTypeLabel;
    }

    public void setMsgTypeLabel(JLabel msgTypeLabel) {
        this.msgTypeLabel = msgTypeLabel;
    }

    public JPanel getTemplateMsgPanel() {
        return templateMsgPanel;
    }

    public void setTemplateMsgPanel(JPanel templateMsgPanel) {
        this.templateMsgPanel = templateMsgPanel;
    }

    public JPanel getKefuMsgPanel() {
        return kefuMsgPanel;
    }

    public void setKefuMsgPanel(JPanel kefuMsgPanel) {
        this.kefuMsgPanel = kefuMsgPanel;
    }

    public JTextField getPreviewUserField() {
        return previewUserField;
    }

    public void setPreviewUserField(String previewUser) {
        this.previewUserField.setText(previewUser);
    }

    public JButton getPreviewMsgButton() {
        return previewMsgButton;
    }

    public void setPreviewMsgButton(JButton previewMsgButton) {
        this.previewMsgButton = previewMsgButton;
    }

    public JLabel getPreviewMemberLabel() {
        return previewMemberLabel;
    }

    public void setPreviewMemberLabel(JLabel previewMemberLabel) {
        this.previewMemberLabel = previewMemberLabel;
    }

    public JTextField getMsgTemplateIdTextField() {
        return msgTemplateIdTextField;
    }

    public void setMsgTemplateIdTextField(String msgTemplateIdTextField) {
        this.msgTemplateIdTextField.setText(msgTemplateIdTextField);
    }

    public JTextField getMsgTemplateUrlTextField() {
        return msgTemplateUrlTextField;
    }

    public void setMsgTemplateUrlTextField(String msgTemplateUrlTextField) {
        this.msgTemplateUrlTextField.setText(msgTemplateUrlTextField);
    }

    public JPanel getTemplateMsgDataPanel() {
        return templateMsgDataPanel;
    }

    public void setTemplateMsgDataPanel(JPanel templateMsgDataPanel) {
        this.templateMsgDataPanel = templateMsgDataPanel;
    }

    public JLabel getTemplateIdLabel() {
        return templateIdLabel;
    }

    public void setTemplateIdLabel(JLabel templateIdLabel) {
        this.templateIdLabel = templateIdLabel;
    }

    public JLabel getTemplateUrlLabel() {
        return templateUrlLabel;
    }

    public void setTemplateUrlLabel(JLabel templateUrlLabel) {
        this.templateUrlLabel = templateUrlLabel;
    }

    public JTextField getTemplateDataNameTextField() {
        return templateDataNameTextField;
    }

    public void setTemplateDataNameTextField(JTextField templateDataNameTextField) {
        this.templateDataNameTextField = templateDataNameTextField;
    }

    public JTextField getTemplateDataValueTextField() {
        return templateDataValueTextField;
    }

    public void setTemplateDataValueTextField(JTextField templateDataValueTextField) {
        this.templateDataValueTextField = templateDataValueTextField;
    }

    public JTextField getTemplateDataColorTextField() {
        return templateDataColorTextField;
    }

    public void setTemplateDataColorTextField(JTextField templateDataColorTextField) {
        this.templateDataColorTextField = templateDataColorTextField;
    }

    public JButton getTemplateMsgDataAddButton() {
        return templateMsgDataAddButton;
    }

    public void setTemplateMsgDataAddButton(JButton templateMsgDataAddButton) {
        this.templateMsgDataAddButton = templateMsgDataAddButton;
    }

    public JTable getTemplateMsgDataTable() {
        return templateMsgDataTable;
    }

    public void setTemplateMsgDataTable(JTable templateMsgDataTable) {
        this.templateMsgDataTable = templateMsgDataTable;
    }

    public JLabel getTemplateMsgNameLabel() {
        return templateMsgNameLabel;
    }

    public void setTemplateMsgNameLabel(JLabel templateMsgNameLabel) {
        this.templateMsgNameLabel = templateMsgNameLabel;
    }

    public JLabel getTemplateMsgValueLabel() {
        return templateMsgValueLabel;
    }

    public void setTemplateMsgValueLabel(JLabel templateMsgValueLabel) {
        this.templateMsgValueLabel = templateMsgValueLabel;
    }

    public JLabel getTemplateMsgColorLabel() {
        return templateMsgColorLabel;
    }

    public void setTemplateMsgColorLabel(JLabel templateMsgColorLabel) {
        this.templateMsgColorLabel = templateMsgColorLabel;
    }

    public JComboBox getMsgKefuMsgTypeComboBox() {
        return msgKefuMsgTypeComboBox;
    }

    public void setMsgKefuMsgTypeComboBox(String msgKefuMsgTypeComboBox) {
        this.msgKefuMsgTypeComboBox.setSelectedItem(msgKefuMsgTypeComboBox);
    }

    public JTextField getMsgKefuMsgTitleTextField() {
        return msgKefuMsgTitleTextField;
    }

    public void setMsgKefuMsgTitleTextField(String msgKefuMsgTitleTextField) {
        this.msgKefuMsgTitleTextField.setText(msgKefuMsgTitleTextField);
    }

    public JTextField getMsgKefuPicUrlTextField() {
        return msgKefuPicUrlTextField;
    }

    public void setMsgKefuPicUrlTextField(String msgKefuPicUrlTextField) {
        this.msgKefuPicUrlTextField.setText(msgKefuPicUrlTextField);
    }

    public JTextField getMsgKefuDescTextField() {
        return msgKefuDescTextField;
    }

    public void setMsgKefuDescTextField(String msgKefuDescTextField) {
        this.msgKefuDescTextField.setText(msgKefuDescTextField);
    }

    public JTextField getMsgKefuUrlTextField() {
        return msgKefuUrlTextField;
    }

    public void setMsgKefuUrlTextField(String msgKefuUrlTextField) {
        this.msgKefuUrlTextField.setText(msgKefuUrlTextField);
    }

    public JLabel getKefuMsgTypeLabel() {
        return kefuMsgTypeLabel;
    }

    public void setKefuMsgTypeLabel(JLabel kefuMsgTypeLabel) {
        this.kefuMsgTypeLabel = kefuMsgTypeLabel;
    }

    public JLabel getKefuMsgTitleLabel() {
        return kefuMsgTitleLabel;
    }

    public void setKefuMsgTitleLabel(JLabel kefuMsgTitleLabel) {
        this.kefuMsgTitleLabel = kefuMsgTitleLabel;
    }

    public JLabel getKefuMsgPicUrlLabel() {
        return kefuMsgPicUrlLabel;
    }

    public void setKefuMsgPicUrlLabel(JLabel kefuMsgPicUrlLabel) {
        this.kefuMsgPicUrlLabel = kefuMsgPicUrlLabel;
    }

    public JLabel getKefuMsgDescLabel() {
        return kefuMsgDescLabel;
    }

    public void setKefuMsgDescLabel(JLabel kefuMsgDescLabel) {
        this.kefuMsgDescLabel = kefuMsgDescLabel;
    }

    public JLabel getKefuMsgUrlLabel() {
        return kefuMsgUrlLabel;
    }

    public void setKefuMsgUrlLabel(JLabel kefuMsgUrlLabel) {
        this.kefuMsgUrlLabel = kefuMsgUrlLabel;
    }

    public JProgressBar getMemberTabImportProgressBar() {
        return memberTabImportProgressBar;
    }

    public void setMemberTabImportProgressBar(JProgressBar memberTabImportProgressBar) {
        this.memberTabImportProgressBar = memberTabImportProgressBar;
    }

    public JTextArea getImportFromSqlTextArea() {
        return importFromSqlTextArea;
    }

    public void setImportFromSqlTextArea(String importFromSql) {
        this.importFromSqlTextArea.setText(importFromSql);
    }

    public JButton getImportFromSqlButton() {
        return importFromSqlButton;
    }

    public void setImportFromSqlButton(JButton importFromSqlButton) {
        this.importFromSqlButton = importFromSqlButton;
    }

    public JTextField getMemberFilePathField() {
        return memberFilePathField;
    }

    public void setMemberFilePathField(String memberFilePath) {
        this.memberFilePathField.setText(memberFilePath);
    }

    public JButton getImportFromFileButton() {
        return importFromFileButton;
    }

    public void setImportFromFileButton(JButton importFromFileButton) {
        this.importFromFileButton = importFromFileButton;
    }

    public JPanel getMemberTabUpPanel() {
        return memberTabUpPanel;
    }

    public void setMemberTabUpPanel(JPanel memberTabUpPanel) {
        this.memberTabUpPanel = memberTabUpPanel;
    }

    public JPanel getMemberTabDownPanel() {
        return memberTabDownPanel;
    }

    public void setMemberTabDownPanel(JPanel memberTabDownPanel) {
        this.memberTabDownPanel = memberTabDownPanel;
    }

    public JPanel getMemberTabCenterPanel() {
        return memberTabCenterPanel;
    }

    public void setMemberTabCenterPanel(JPanel memberTabCenterPanel) {
        this.memberTabCenterPanel = memberTabCenterPanel;
    }

    public JLabel getMemberTabCountLabel() {
        return memberTabCountLabel;
    }

    public void setMemberTabCountLabel(int memberTabCount) {
        this.memberTabCountLabel.setText(String.valueOf(memberTabCount));
    }

    public JLabel getMemberTabImportProgressLabel() {
        return memberTabImportProgressLabel;
    }

    public void setMemberTabImportProgressLabel(JLabel memberTabImportProgressLabel) {
        this.memberTabImportProgressLabel = memberTabImportProgressLabel;
    }

    public JLabel getImportFromFileLabel() {
        return importFromFileLabel;
    }

    public void setImportFromFileLabel(JLabel importFromFileLabel) {
        this.importFromFileLabel = importFromFileLabel;
    }

    public JProgressBar getPushTotalProgressBar() {
        return pushTotalProgressBar;
    }

    public void setPushTotalProgressBar(JProgressBar pushTotalProgressBar) {
        this.pushTotalProgressBar = pushTotalProgressBar;
    }

    public JTextField getPushPageSizeTextField() {
        return pushPageSizeTextField;
    }

    public void setPushPageSizeTextField(int pushPageSize) {
        this.pushPageSizeTextField.setText(String.valueOf(pushPageSize));
    }

    public JTextField getPushPagePerThreadTextField() {
        return pushPagePerThreadTextField;
    }

    public void setPushPagePerThreadTextField(int pushPagePerThread) {
        this.pushPagePerThreadTextField.setText(String.valueOf(pushPagePerThread));
    }

    public JTextArea getPushConsoleTextArea() {
        return pushConsoleTextArea;
    }

    public void setPushConsoleTextArea(JTextArea pushConsoleTextArea) {
        this.pushConsoleTextArea = pushConsoleTextArea;
    }

    public JTable getPushThreadTable() {
        return pushThreadTable;
    }

    public void setPushThreadTable(JTable pushThreadTable) {
        this.pushThreadTable = pushThreadTable;
    }

    public JButton getScheduleRunButton() {
        return ScheduleRunButton;
    }

    public void setScheduleRunButton(JButton scheduleRunButton) {
        ScheduleRunButton = scheduleRunButton;
    }

    public JLabel getPushSuccessCount() {
        return pushSuccessCount;
    }

    public void setPushSuccessCount(JLabel pushSuccessCount) {
        this.pushSuccessCount = pushSuccessCount;
    }

    public JLabel getPushFailCount() {
        return pushFailCount;
    }

    public void setPushFailCount(JLabel pushFailCount) {
        this.pushFailCount = pushFailCount;
    }

    public JButton getPushStopButton() {
        return pushStopButton;
    }

    public void setPushStopButton(JButton pushStopButton) {
        this.pushStopButton = pushStopButton;
    }

    public JButton getPushStartButton() {
        return pushStartButton;
    }

    public void setPushStartButton(JButton pushStartButton) {
        this.pushStartButton = pushStartButton;
    }

    public JTextField getMsgNameField() {
        return msgNameField;
    }

    public void setMsgNameField(String msgName) {
        this.msgNameField.setText(msgName);
    }

    public JComboBox getMsgHistoryComboBox() {
        return msgHistoryComboBox;
    }

    public void setMsgHistoryComboBox(JComboBox msgHistoryComboBox) {
        this.msgHistoryComboBox = msgHistoryComboBox;
    }

    public JButton getMsgSaveButton() {
        return msgSaveButton;
    }

    public void setMsgSaveButton(JButton msgSaveButton) {
        this.msgSaveButton = msgSaveButton;
    }

    public JLabel getMsgHistoryLabel() {
        return msgHistoryLabel;
    }

    public void setMsgHistoryLabel(JLabel msgHistoryLabel) {
        this.msgHistoryLabel = msgHistoryLabel;
    }

    public JLabel getMsgNameLabel() {
        return msgNameLabel;
    }

    public void setMsgNameLabel(JLabel msgNameLabel) {
        this.msgNameLabel = msgNameLabel;
    }

    public JPanel getPushUpPanel() {
        return pushUpPanel;
    }

    public void setPushUpPanel(JPanel pushUpPanel) {
        this.pushUpPanel = pushUpPanel;
    }

    public JPanel getPushDownPanel() {
        return pushDownPanel;
    }

    public void setPushDownPanel(JPanel pushDownPanel) {
        this.pushDownPanel = pushDownPanel;
    }

    public JPanel getPushCenterPanel() {
        return pushCenterPanel;
    }

    public void setPushCenterPanel(JPanel pushCenterPanel) {
        this.pushCenterPanel = pushCenterPanel;
    }

    public JPanel getPushControlPanel() {
        return pushControlPanel;
    }

    public void setPushControlPanel(JPanel pushControlPanel) {
        this.pushControlPanel = pushControlPanel;
    }

    public JLabel getPushTotalCountLabel() {
        return pushTotalCountLabel;
    }

    public void setPushTotalCountLabel(JLabel pushTotalCountLabel) {
        this.pushTotalCountLabel = pushTotalCountLabel;
    }

    public JLabel getPushTotalPageLabel() {
        return pushTotalPageLabel;
    }

    public void setPushTotalPageLabel(JLabel pushTotalPageLabel) {
        this.pushTotalPageLabel = pushTotalPageLabel;
    }

    public JLabel getPushTotalThreadLabel() {
        return pushTotalThreadLabel;
    }

    public void setPushTotalThreadLabel(JLabel pushTotalThreadLabel) {
        this.pushTotalThreadLabel = pushTotalThreadLabel;
    }

    public JLabel getPushTotalProgressLabel() {
        return pushTotalProgressLabel;
    }

    public void setPushTotalProgressLabel(JLabel pushTotalProgressLabel) {
        this.pushTotalProgressLabel = pushTotalProgressLabel;
    }

    public JRadioButton getRunAtThisTimeRadioButton() {
        return runAtThisTimeRadioButton;
    }

    public void setRunAtThisTimeRadioButton(boolean runAtThisTime) {
        this.runAtThisTimeRadioButton.setSelected(runAtThisTime);
    }

    public JTextField getStartAtThisTimeTextField() {
        return startAtThisTimeTextField;
    }

    public void setStartAtThisTimeTextField(String startAtThisTimeTextField) {
        this.startAtThisTimeTextField.setText(startAtThisTimeTextField);
    }

    public JPanel getSchedulePanel() {
        return schedulePanel;
    }

    public void setSchedulePanel(JPanel schedulePanel) {
        this.schedulePanel = schedulePanel;
    }

    public JRadioButton getRunPerDayRadioButton() {
        return runPerDayRadioButton;
    }

    public void setRunPerDayRadioButton(boolean runPerDay) {
        this.runPerDayRadioButton.setSelected(runPerDay);
    }

    public JTextField getStartPerDayTextField() {
        return startPerDayTextField;
    }

    public void setStartPerDayTextField(String startPerDayTextField) {
        this.startPerDayTextField.setText(startPerDayTextField);
    }

    public JRadioButton getRunPerWeekRadioButton() {
        return runPerWeekRadioButton;
    }

    public void setRunPerWeekRadioButton(boolean runPerWeek) {
        this.runPerWeekRadioButton.setSelected(runPerWeek);
    }

    public JButton getScheduleSaveButton() {
        return scheduleSaveButton;
    }

    public void setScheduleSaveButton(JButton scheduleSaveButton) {
        this.scheduleSaveButton = scheduleSaveButton;
    }

    public JComboBox getSchedulePerWeekComboBox() {
        return schedulePerWeekComboBox;
    }

    public void setSchedulePerWeekComboBox(String schedulePerWeek) {
        this.schedulePerWeekComboBox.setSelectedItem(schedulePerWeek);
    }

    public JTextField getStartPerWeekTextField() {
        return startPerWeekTextField;
    }

    public void setStartPerWeekTextField(String startPerWeekTextField) {
        this.startPerWeekTextField.setText(startPerWeekTextField);
    }

    public JTextField getWechatAppIdTextField() {
        return wechatAppIdTextField;
    }

    public void setWechatAppIdTextField(String wechatAppIdTextField) {
        this.wechatAppIdTextField.setText(wechatAppIdTextField);
    }

    public JPasswordField getWechatAppSecretPasswordField() {
        return wechatAppSecretPasswordField;
    }

    public void setWechatAppSecretPasswordField(String wechatAppSecretPasswordField) {
        this.wechatAppSecretPasswordField.setText(wechatAppSecretPasswordField);
    }

    public JPasswordField getWechatTokenPasswordField() {
        return wechatTokenPasswordField;
    }

    public void setWechatTokenPasswordField(String wechatTokenPasswordField) {
        this.wechatTokenPasswordField.setText(wechatTokenPasswordField);
    }

    public JPasswordField getWechatAesKeyPasswordField() {
        return wechatAesKeyPasswordField;
    }

    public void setWechatAesKeyPasswordField(String wechatAesKeyPasswordField) {
        this.wechatAesKeyPasswordField.setText(wechatAesKeyPasswordField);
    }

    public JButton getSettingMpInfoSaveButton() {
        return settingMpInfoSaveButton;
    }

    public void setSettingMpInfoSaveButton(JButton settingMpInfoSaveButton) {
        this.settingMpInfoSaveButton = settingMpInfoSaveButton;
    }

    public JTextField getAliServerUrlTextField() {
        return aliServerUrlTextField;
    }

    public void setAliServerUrlTextField(String aliServerUrlTextField) {
        this.aliServerUrlTextField.setText(aliServerUrlTextField);
    }

    public JPasswordField getAliAppKeyPasswordField() {
        return aliAppKeyPasswordField;
    }

    public void setAliAppKeyPasswordField(String aliAppKeyPasswordField) {
        this.aliAppKeyPasswordField.setText(aliAppKeyPasswordField);
    }

    public JTextField getAliSignTextField() {
        return aliSignTextField;
    }

    public void setAliSignTextField(String aliSignTextField) {
        this.aliSignTextField.setText(aliSignTextField);
    }

    public JButton getSettingAliInfoSaveButton() {
        return settingAliInfoSaveButton;
    }

    public void setSettingAliInfoSaveButton(JButton settingAliInfoSaveButton) {
        this.settingAliInfoSaveButton = settingAliInfoSaveButton;
    }

    public JTextField getMysqlUrlTextField() {
        return mysqlUrlTextField;
    }

    public void setMysqlUrlTextField(String mysqlUrlTextField) {
        this.mysqlUrlTextField.setText(mysqlUrlTextField);
    }

    public JTextField getMysqlDatabaseTextField() {
        return mysqlDatabaseTextField;
    }

    public void setMysqlDatabaseTextField(String mysqlDatabaseTextField) {
        this.mysqlDatabaseTextField.setText(mysqlDatabaseTextField);
    }

    public JTextField getMysqlUserTextField() {
        return mysqlUserTextField;
    }

    public void setMysqlUserTextField(String mysqlUserTextField) {
        this.mysqlUserTextField.setText(mysqlUserTextField);
    }

    public JPasswordField getMysqlPasswordField() {
        return mysqlPasswordField;
    }

    public void setMysqlPasswordField(String mysqlPasswordField) {
        this.mysqlPasswordField.setText(mysqlPasswordField);
    }

    public JButton getSettingTestDbLinkButton() {
        return settingTestDbLinkButton;
    }

    public void setSettingTestDbLinkButton(JButton settingTestDbLinkButton) {
        this.settingTestDbLinkButton = settingTestDbLinkButton;
    }

    public JButton getSettingDbInfoSaveButton() {
        return settingDbInfoSaveButton;
    }

    public void setSettingDbInfoSaveButton(JButton settingDbInfoSaveButton) {
        this.settingDbInfoSaveButton = settingDbInfoSaveButton;
    }

    public JTable getMsgHistable() {
        return msgHistable;
    }

    public void setMsgHistable(JTable msgHistable) {
        this.msgHistable = msgHistable;
    }

    public JCheckBox getDryRunCheckBox() {
        return dryRunCheckBox;
    }

    public void setDryRunCheckBox(boolean dryRunCheck) {
        this.dryRunCheckBox.setSelected(dryRunCheck);
    }

    public JLabel getSloganLabel() {
        return sloganLabel;
    }

    public void setSloganLabel(JLabel sloganLabel) {
        this.sloganLabel = sloganLabel;
    }

    public void setPreviewUserField(JTextField previewUserField) {
        this.previewUserField = previewUserField;
    }

    public void setImportFromSqlTextArea(JTextArea importFromSqlTextArea) {
        this.importFromSqlTextArea = importFromSqlTextArea;
    }

    public void setMemberFilePathField(JTextField memberFilePathField) {
        this.memberFilePathField = memberFilePathField;
    }

    public void setMemberTabCountLabel(JLabel memberTabCountLabel) {
        this.memberTabCountLabel = memberTabCountLabel;
    }

    public void setMsgNameField(JTextField msgNameField) {
        this.msgNameField = msgNameField;
    }

    public JLabel getCheckUpdateLabel() {
        return checkUpdateLabel;
    }

    public void setCheckUpdateLabel(JLabel checkUpdateLabel) {
        this.checkUpdateLabel = checkUpdateLabel;
    }

    public JButton getCreateMsgButton() {
        return createMsgButton;
    }

    public void setCreateMsgButton(JButton createMsgButton) {
        this.createMsgButton = createMsgButton;
    }

    public JButton getMemberImportAllButton() {
        return memberImportAllButton;
    }

    public void setMemberImportAllButton(JButton memberImportAllButton) {
        this.memberImportAllButton = memberImportAllButton;
    }

    public JComboBox getSettingThemeComboBox() {
        return settingThemeComboBox;
    }

    public void setSettingThemeComboBox(String settingThemeComboBox) {
        this.settingThemeComboBox.setSelectedItem(settingThemeComboBox);
    }

    public JComboBox getSettingFontNameComboBox() {
        return settingFontNameComboBox;
    }

    public void setSettingFontNameComboBox(String settingFontNameComboBox) {
        this.settingFontNameComboBox.setSelectedItem(settingFontNameComboBox);
    }

    public JComboBox getSettingFontSizeComboBox() {
        return settingFontSizeComboBox;
    }

    public void setSettingFontSizeComboBox(int settingFontSizeComboBox) {
        this.settingFontSizeComboBox.setSelectedItem(String.valueOf(settingFontSizeComboBox));
    }

    public JButton getSettingAppearanceSaveButton() {
        return settingAppearanceSaveButton;
    }

    public void setSettingAppearanceSaveButton(JButton settingAppearanceSaveButton) {
        this.settingAppearanceSaveButton = settingAppearanceSaveButton;
    }

    public JLabel getPushLastTimeLabel() {
        return pushLastTimeLabel;
    }

    public void setPushLastTimeLabel(JLabel pushLastTimeLabel) {
        this.pushLastTimeLabel = pushLastTimeLabel;
    }

    public JLabel getPushLeftTimeLabel() {
        return pushLeftTimeLabel;
    }

    public void setPushLeftTimeLabel(JLabel pushLeftTimeLabel) {
        this.pushLeftTimeLabel = pushLeftTimeLabel;
    }

    public JLabel getPushMsgName() {
        return pushMsgName;
    }

    public void setPushMsgName(String pushMsgName) {
        this.pushMsgName.setText(pushMsgName);
    }

    public JScrollPane getSettingScrollPane() {
        return settingScrollPane;
    }

    public void setSettingScrollPane(JScrollPane settingScrollPane) {
        this.settingScrollPane = settingScrollPane;
    }

    public JPasswordField getAliAppSecretPasswordField() {
        return aliAppSecretPasswordField;
    }

    public void setAliAppSecretPasswordField(String aliAppSecretPasswordField) {
        this.aliAppSecretPasswordField.setText(aliAppSecretPasswordField);
    }

    public JButton getImportFromHisButton() {
        return importFromHisButton;
    }

    public void setImportFromHisButton(JButton importFromHisButton) {
        this.importFromHisButton = importFromHisButton;
    }

    public JButton getClearImportButton() {
        return clearImportButton;
    }

    public void setClearImportButton(JButton clearImportButton) {
        this.clearImportButton = clearImportButton;
    }

    public JComboBox getMemberHisComboBox() {
        return memberHisComboBox;
    }

    public void setMemberHisComboBox(JComboBox memberHisComboBox) {
        this.memberHisComboBox = memberHisComboBox;
    }

    public JTable getImportHisTable() {
        return importHisTable;
    }

    public void setImportHisTable(JTable importHisTable) {
        this.importHisTable = importHisTable;
    }

    public JButton getMsgHisTableSelectAllButton() {
        return msgHisTableSelectAllButton;
    }

    public void setMsgHisTableSelectAllButton(JButton msgHisTableSelectAllButton) {
        this.msgHisTableSelectAllButton = msgHisTableSelectAllButton;
    }

    public JButton getMsgHisTableDeleteButton() {
        return msgHisTableDeleteButton;
    }

    public void setMsgHisTableDeleteButton(JButton msgHisTableDeleteButton) {
        this.msgHisTableDeleteButton = msgHisTableDeleteButton;
    }

    public JButton getImportHisTableSelectAllButton() {
        return importHisTableSelectAllButton;
    }

    public void setImportHisTableSelectAllButton(JButton importHisTableSelectAllButton) {
        this.importHisTableSelectAllButton = importHisTableSelectAllButton;
    }

    public JButton getImportHisTableDeleteButton() {
        return importHisTableDeleteButton;
    }

    public void setImportHisTableDeleteButton(JButton importHisTableDeleteButton) {
        this.importHisTableDeleteButton = importHisTableDeleteButton;
    }

    public JButton getMsgHisTableUnselectAllButton() {
        return msgHisTableUnselectAllButton;
    }

    public void setMsgHisTableUnselectAllButton(JButton msgHisTableUnselectAllButton) {
        this.msgHisTableUnselectAllButton = msgHisTableUnselectAllButton;
    }

    public JButton getImportHisTableUnselectAllButton() {
        return importHisTableUnselectAllButton;
    }

    public void setImportHisTableUnselectAllButton(JButton importHisTableUnselectAllButton) {
        this.importHisTableUnselectAllButton = importHisTableUnselectAllButton;
    }

    public JLabel getScheduleDetailLabel() {
        return scheduleDetailLabel;
    }

    public void setScheduleDetailLabel(JLabel scheduleDetailLabel) {
        this.scheduleDetailLabel = scheduleDetailLabel;
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(8, 0, 0, 0), -1, -1));
        tabbedPane = new JTabbedPane();
        Font tabbedPaneFont = this.$$$getFont$$$(null, -1, -1, tabbedPane.getFont());
        if (tabbedPaneFont != null) tabbedPane.setFont(tabbedPaneFont);
        mainPanel.add(tabbedPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        messagePanel = new JPanel();
        messagePanel.setLayout(new GridLayoutManager(3, 4, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("编辑消息", messagePanel);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(2, 6, new Insets(0, 0, 0, 0), -1, -1));
        messagePanel.add(panel1, new GridConstraints(0, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        msgTypeLabel = new JLabel();
        msgTypeLabel.setText("消息类型");
        panel1.add(msgTypeLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgTypeComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("阿里云短信");
        defaultComboBoxModel1.addElement("模板消息");
        defaultComboBoxModel1.addElement("客服消息");
        defaultComboBoxModel1.addElement("客服消息优先");
        defaultComboBoxModel1.addElement("阿里大于模板短信");
        msgTypeComboBox.setModel(defaultComboBoxModel1);
        panel1.add(msgTypeComboBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgNameLabel = new JLabel();
        msgNameLabel.setText("消息名称");
        panel1.add(msgNameLabel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgNameField = new JTextField();
        panel1.add(msgNameField, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        msgHistoryLabel = new JLabel();
        msgHistoryLabel.setText("通过历史消息编辑 ");
        panel1.add(msgHistoryLabel, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgHistoryComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        msgHistoryComboBox.setModel(defaultComboBoxModel2);
        panel1.add(msgHistoryComboBox, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator1 = new JSeparator();
        panel1.add(separator1, new GridConstraints(1, 0, 1, 6, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        messagePanel.add(panel2, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        previewMemberLabel = new JLabel();
        previewMemberLabel.setText("预览消息用户openid（以半角分号分隔）");
        panel2.add(previewMemberLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        previewUserField = new JTextField();
        panel2.add(previewUserField, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        previewMsgButton = new JButton();
        previewMsgButton.setText("预览");
        panel2.add(previewMsgButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgSaveButton = new JButton();
        msgSaveButton.setText("保存");
        panel2.add(msgSaveButton, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        createMsgButton = new JButton();
        createMsgButton.setText("新建");
        panel2.add(createMsgButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        templateMsgPanel = new JPanel();
        templateMsgPanel.setLayout(new GridLayoutManager(3, 2, new Insets(10, 50, 10, 0), -1, -1));
        messagePanel.add(templateMsgPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        templateMsgPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "模板消息编辑"));
        templateIdLabel = new JLabel();
        templateIdLabel.setText("模板ID");
        templateMsgPanel.add(templateIdLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgTemplateIdTextField = new JTextField();
        templateMsgPanel.add(msgTemplateIdTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        templateUrlLabel = new JLabel();
        templateUrlLabel.setText("跳转URL");
        templateMsgPanel.add(templateUrlLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgTemplateUrlTextField = new JTextField();
        templateMsgPanel.add(msgTemplateUrlTextField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        templateMsgDataPanel = new JPanel();
        templateMsgDataPanel.setLayout(new GridLayoutManager(2, 7, new Insets(0, 0, 0, 0), -1, -1));
        templateMsgPanel.add(templateMsgDataPanel, new GridConstraints(2, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        templateMsgDataPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "模板消息数据配置（可使用\"#ENTER#\"作为换行符）", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.ABOVE_TOP));
        templateMsgNameLabel = new JLabel();
        templateMsgNameLabel.setText("name");
        templateMsgDataPanel.add(templateMsgNameLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        templateDataNameTextField = new JTextField();
        templateMsgDataPanel.add(templateDataNameTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        templateMsgValueLabel = new JLabel();
        templateMsgValueLabel.setText("value");
        templateMsgDataPanel.add(templateMsgValueLabel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        templateDataValueTextField = new JTextField();
        templateMsgDataPanel.add(templateDataValueTextField, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        templateMsgColorLabel = new JLabel();
        templateMsgColorLabel.setText("color");
        templateMsgDataPanel.add(templateMsgColorLabel, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        templateDataColorTextField = new JTextField();
        templateMsgDataPanel.add(templateDataColorTextField, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        templateMsgDataAddButton = new JButton();
        templateMsgDataAddButton.setIcon(new ImageIcon(getClass().getResource("/icon/add.png")));
        templateMsgDataAddButton.setText("添加");
        templateMsgDataPanel.add(templateMsgDataAddButton, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        templateMsgDataPanel.add(scrollPane1, new GridConstraints(1, 0, 1, 7, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        templateMsgDataTable = new JTable();
        templateMsgDataTable.setAutoCreateColumnsFromModel(true);
        templateMsgDataTable.setAutoCreateRowSorter(true);
        templateMsgDataTable.setGridColor(new Color(-12236470));
        templateMsgDataTable.setRowHeight(40);
        scrollPane1.setViewportView(templateMsgDataTable);
        kefuMsgPanel = new JPanel();
        kefuMsgPanel.setLayout(new GridLayoutManager(6, 2, new Insets(10, 50, 10, 0), -1, -1));
        messagePanel.add(kefuMsgPanel, new GridConstraints(1, 2, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        kefuMsgPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "客服消息编辑"));
        kefuMsgTypeLabel = new JLabel();
        kefuMsgTypeLabel.setText("消息类型");
        kefuMsgPanel.add(kefuMsgTypeLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        kefuMsgPanel.add(spacer1, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        msgKefuMsgTypeComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("文本消息");
        defaultComboBoxModel3.addElement("图文消息");
        msgKefuMsgTypeComboBox.setModel(defaultComboBoxModel3);
        kefuMsgPanel.add(msgKefuMsgTypeComboBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        kefuMsgTitleLabel = new JLabel();
        kefuMsgTitleLabel.setText("内容/标题");
        kefuMsgPanel.add(kefuMsgTitleLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgKefuMsgTitleTextField = new JTextField();
        kefuMsgPanel.add(msgKefuMsgTitleTextField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(380, -1), new Dimension(380, -1), null, 0, false));
        kefuMsgPicUrlLabel = new JLabel();
        kefuMsgPicUrlLabel.setText("图片URL");
        kefuMsgPanel.add(kefuMsgPicUrlLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgKefuPicUrlTextField = new JTextField();
        kefuMsgPanel.add(msgKefuPicUrlTextField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        kefuMsgDescLabel = new JLabel();
        kefuMsgDescLabel.setText("描述");
        kefuMsgPanel.add(kefuMsgDescLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgKefuDescTextField = new JTextField();
        kefuMsgPanel.add(msgKefuDescTextField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        kefuMsgUrlLabel = new JLabel();
        kefuMsgUrlLabel.setText("跳转URL");
        kefuMsgPanel.add(kefuMsgUrlLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgKefuUrlTextField = new JTextField();
        kefuMsgPanel.add(msgKefuUrlTextField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final Spacer spacer2 = new Spacer();
        messagePanel.add(spacer2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        memberPanel = new JPanel();
        memberPanel.setLayout(new GridLayoutManager(10, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("准备目标用户", memberPanel);
        memberTabUpPanel = new JPanel();
        memberTabUpPanel.setLayout(new GridLayoutManager(6, 5, new Insets(0, 0, 0, 0), -1, -1));
        memberPanel.add(memberTabUpPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        memberTabCountLabel = new JLabel();
        Font memberTabCountLabelFont = this.$$$getFont$$$("Microsoft JhengHei UI", -1, 36, memberTabCountLabel.getFont());
        if (memberTabCountLabelFont != null) memberTabCountLabel.setFont(memberTabCountLabelFont);
        memberTabCountLabel.setForeground(new Color(-276358));
        memberTabCountLabel.setText("0");
        memberTabUpPanel.add(memberTabCountLabel, new GridConstraints(0, 0, 4, 3, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        memberTabImportProgressLabel = new JLabel();
        memberTabImportProgressLabel.setText("导入进度");
        memberTabUpPanel.add(memberTabImportProgressLabel, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        memberTabImportProgressBar = new JProgressBar();
        memberTabUpPanel.add(memberTabImportProgressBar, new GridConstraints(4, 1, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        memberTabUpPanel.add(spacer3, new GridConstraints(0, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setText("已导入");
        memberTabUpPanel.add(label1, new GridConstraints(0, 3, 4, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator2 = new JSeparator();
        memberTabUpPanel.add(separator2, new GridConstraints(5, 0, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        memberTabDownPanel = new JPanel();
        memberTabDownPanel.setLayout(new GridLayoutManager(1, 3, new Insets(10, 50, 10, 0), -1, -1));
        memberPanel.add(memberTabDownPanel, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        memberTabDownPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "通过文件导入"));
        importFromFileLabel = new JLabel();
        importFromFileLabel.setText("文件路径（*.txt,*.csv）");
        memberTabDownPanel.add(importFromFileLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        memberFilePathField = new JTextField();
        memberTabDownPanel.add(memberFilePathField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        importFromFileButton = new JButton();
        importFromFileButton.setIcon(new ImageIcon(getClass().getResource("/icon/fromVCS.png")));
        importFromFileButton.setText("导入openid/手机号");
        memberTabDownPanel.add(importFromFileButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        memberTabCenterPanel = new JPanel();
        memberTabCenterPanel.setLayout(new GridLayoutManager(2, 2, new Insets(10, 0, 0, 0), -1, -1));
        memberPanel.add(memberTabCenterPanel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        memberTabCenterPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "通过SQL导入"));
        importFromSqlTextArea = new JTextArea();
        importFromSqlTextArea.setText("SELECT openid FROM");
        memberTabCenterPanel.add(importFromSqlTextArea, new GridConstraints(0, 0, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 150), null, 0, false));
        importFromSqlButton = new JButton();
        importFromSqlButton.setIcon(new ImageIcon(getClass().getResource("/icon/fromVCS.png")));
        importFromSqlButton.setText("导入openid/手机号");
        memberTabCenterPanel.add(importFromSqlButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        memberTabCenterPanel.add(spacer4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        memberPanel.add(spacer5, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        memberPanel.add(spacer6, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        memberPanel.add(panel3, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        memberPanel.add(spacer7, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        memberPanel.add(panel4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        clearImportButton = new JButton();
        clearImportButton.setText("清除");
        panel4.add(clearImportButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        panel4.add(spacer8, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("从历史导入");
        panel4.add(label2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        memberHisComboBox = new JComboBox();
        panel4.add(memberHisComboBox, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        importFromHisButton = new JButton();
        importFromHisButton.setIcon(new ImageIcon(getClass().getResource("/icon/fromVCS.png")));
        importFromHisButton.setText("导入openid/手机号");
        panel4.add(importFromHisButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator3 = new JSeparator();
        memberPanel.add(separator3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        memberImportAllButton = new JButton();
        memberImportAllButton.setIcon(new ImageIcon(getClass().getResource("/icon/fromVCS.png")));
        memberImportAllButton.setText("导入全员（自动导入当前所有关注公众号的用户）");
        memberPanel.add(memberImportAllButton, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushPanel = new JPanel();
        pushPanel.setLayout(new GridLayoutManager(3, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("开始推送", pushPanel);
        pushUpPanel = new JPanel();
        pushUpPanel.setLayout(new GridLayoutManager(7, 13, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushUpPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        pushSuccessCount = new JLabel();
        Font pushSuccessCountFont = this.$$$getFont$$$("Microsoft JhengHei UI", -1, 48, pushSuccessCount.getFont());
        if (pushSuccessCountFont != null) pushSuccessCount.setFont(pushSuccessCountFont);
        pushSuccessCount.setForeground(new Color(-13587376));
        pushSuccessCount.setText("0");
        pushUpPanel.add(pushSuccessCount, new GridConstraints(0, 0, 6, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushFailCount = new JLabel();
        Font pushFailCountFont = this.$$$getFont$$$("Microsoft YaHei UI", -1, 48, pushFailCount.getFont());
        if (pushFailCountFont != null) pushFailCount.setFont(pushFailCountFont);
        pushFailCount.setForeground(new Color(-2200483));
        pushFailCount.setText("0");
        pushUpPanel.add(pushFailCount, new GridConstraints(0, 2, 6, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalProgressLabel = new JLabel();
        pushTotalProgressLabel.setText("总进度");
        pushUpPanel.add(pushTotalProgressLabel, new GridConstraints(5, 8, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalProgressBar = new JProgressBar();
        pushTotalProgressBar.setStringPainted(true);
        pushUpPanel.add(pushTotalProgressBar, new GridConstraints(5, 9, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("成功");
        pushUpPanel.add(label3, new GridConstraints(2, 1, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("失败");
        pushUpPanel.add(label4, new GridConstraints(2, 3, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator4 = new JSeparator();
        separator4.setOrientation(1);
        pushUpPanel.add(separator4, new GridConstraints(0, 4, 6, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushLastTimeLabel = new JLabel();
        pushLastTimeLabel.setEnabled(true);
        Font pushLastTimeLabelFont = this.$$$getFont$$$(null, -1, 36, pushLastTimeLabel.getFont());
        if (pushLastTimeLabelFont != null) pushLastTimeLabel.setFont(pushLastTimeLabelFont);
        pushLastTimeLabel.setForeground(new Color(-6710887));
        pushLastTimeLabel.setText("0s");
        pushUpPanel.add(pushLastTimeLabel, new GridConstraints(0, 6, 3, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("耗时");
        pushUpPanel.add(label5, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushLeftTimeLabel = new JLabel();
        Font pushLeftTimeLabelFont = this.$$$getFont$$$(null, -1, 36, pushLeftTimeLabel.getFont());
        if (pushLeftTimeLabelFont != null) pushLeftTimeLabel.setFont(pushLeftTimeLabelFont);
        pushLeftTimeLabel.setForeground(new Color(-6710887));
        pushLeftTimeLabel.setText("0s");
        pushUpPanel.add(pushLeftTimeLabel, new GridConstraints(3, 6, 3, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator5 = new JSeparator();
        separator5.setOrientation(1);
        pushUpPanel.add(separator5, new GridConstraints(0, 7, 6, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushTotalThreadLabel = new JLabel();
        pushTotalThreadLabel.setText("需要线程宝宝个数：");
        pushUpPanel.add(pushTotalThreadLabel, new GridConstraints(3, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalPageLabel = new JLabel();
        pushTotalPageLabel.setText("总页数：");
        pushUpPanel.add(pushTotalPageLabel, new GridConstraints(2, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushTotalCountLabel = new JLabel();
        pushTotalCountLabel.setText("总用户数：");
        pushUpPanel.add(pushTotalCountLabel, new GridConstraints(1, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushMsgName = new JLabel();
        Font pushMsgNameFont = this.$$$getFont$$$(null, -1, 24, pushMsgName.getFont());
        if (pushMsgNameFont != null) pushMsgName.setFont(pushMsgNameFont);
        pushMsgName.setForeground(new Color(-13587376));
        pushMsgName.setText("五彩城跳跳糖大蹦床定点推送");
        pushUpPanel.add(pushMsgName, new GridConstraints(0, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("预计剩余");
        pushUpPanel.add(label6, new GridConstraints(4, 5, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scheduleDetailLabel = new JLabel();
        scheduleDetailLabel.setForeground(new Color(-276358));
        scheduleDetailLabel.setText("");
        pushUpPanel.add(scheduleDetailLabel, new GridConstraints(4, 8, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushDownPanel = new JPanel();
        pushDownPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushDownPanel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        pushControlPanel = new JPanel();
        pushControlPanel.setLayout(new GridLayoutManager(1, 9, new Insets(0, 0, 0, 0), -1, -1));
        pushDownPanel.add(pushControlPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("每页分配用户数");
        pushControlPanel.add(label7, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushPageSizeTextField = new JTextField();
        pushControlPanel.add(pushPageSizeTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, -1), null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("每个线程分配的页数");
        pushControlPanel.add(label8, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushPagePerThreadTextField = new JTextField();
        pushControlPanel.add(pushPagePerThreadTextField, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(100, -1), null, 0, false));
        ScheduleRunButton = new JButton();
        ScheduleRunButton.setIcon(new ImageIcon(getClass().getResource("/icon/clock.png")));
        ScheduleRunButton.setText("按计划执行");
        pushControlPanel.add(ScheduleRunButton, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushStopButton = new JButton();
        pushStopButton.setEnabled(false);
        pushStopButton.setIcon(new ImageIcon(getClass().getResource("/icon/suspend.png")));
        pushStopButton.setText("停止");
        pushControlPanel.add(pushStopButton, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pushStartButton = new JButton();
        pushStartButton.setIcon(new ImageIcon(getClass().getResource("/icon/run@2x.png")));
        pushStartButton.setText("开始");
        pushControlPanel.add(pushStartButton, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dryRunCheckBox = new JCheckBox();
        dryRunCheckBox.setText("空跑");
        pushControlPanel.add(dryRunCheckBox, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer9 = new Spacer();
        pushControlPanel.add(spacer9, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        pushCenterPanel = new JPanel();
        pushCenterPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        pushPanel.add(pushCenterPanel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane2 = new JScrollPane();
        pushCenterPanel.add(scrollPane2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushConsoleTextArea = new JTextArea();
        scrollPane2.setViewportView(pushConsoleTextArea);
        final JScrollPane scrollPane3 = new JScrollPane();
        pushCenterPanel.add(scrollPane3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        pushThreadTable = new JTable();
        pushThreadTable.setGridColor(new Color(-12236470));
        pushThreadTable.setRowHeight(40);
        scrollPane3.setViewportView(pushThreadTable);
        schedulePanel = new JPanel();
        schedulePanel.setLayout(new GridLayoutManager(5, 7, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("计划任务", schedulePanel);
        runAtThisTimeRadioButton = new JRadioButton();
        runAtThisTimeRadioButton.setText("在此时间开始推送：");
        schedulePanel.add(runAtThisTimeRadioButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer10 = new Spacer();
        schedulePanel.add(spacer10, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer11 = new Spacer();
        schedulePanel.add(spacer11, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        startAtThisTimeTextField = new JTextField();
        startAtThisTimeTextField.setText("");
        schedulePanel.add(startAtThisTimeTextField, new GridConstraints(0, 1, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        runPerDayRadioButton = new JRadioButton();
        runPerDayRadioButton.setText("每天固定时间开始推送：");
        schedulePanel.add(runPerDayRadioButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        startPerDayTextField = new JTextField();
        schedulePanel.add(startPerDayTextField, new GridConstraints(1, 1, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        runPerWeekRadioButton = new JRadioButton();
        runPerWeekRadioButton.setText("每周固定时间开始推送：");
        schedulePanel.add(runPerWeekRadioButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("yyyy-MM-dd HH:mm:ss");
        schedulePanel.add(label9, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("HH:mm:ss");
        schedulePanel.add(label10, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("HH:mm:ss");
        schedulePanel.add(label11, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        scheduleSaveButton = new JButton();
        scheduleSaveButton.setText("保存");
        schedulePanel.add(scheduleSaveButton, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setText("每周");
        schedulePanel.add(label12, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("的");
        schedulePanel.add(label13, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        schedulePerWeekComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("一");
        defaultComboBoxModel4.addElement("二");
        defaultComboBoxModel4.addElement("三");
        defaultComboBoxModel4.addElement("四");
        defaultComboBoxModel4.addElement("五");
        defaultComboBoxModel4.addElement("六");
        defaultComboBoxModel4.addElement("日");
        schedulePerWeekComboBox.setModel(defaultComboBoxModel4);
        schedulePanel.add(schedulePerWeekComboBox, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        startPerWeekTextField = new JTextField();
        schedulePanel.add(startPerWeekTextField, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        reportPanel = new JPanel();
        reportPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        tabbedPane.addTab("结果报表", reportPanel);
        settingPanel = new JPanel();
        settingPanel.setLayout(new GridLayoutManager(1, 1, new Insets(10, 10, 10, 10), -1, -1));
        Font settingPanelFont = this.$$$getFont$$$("Microsoft YaHei UI", -1, -1, settingPanel.getFont());
        if (settingPanelFont != null) settingPanel.setFont(settingPanelFont);
        tabbedPane.addTab("设置", settingPanel);
        settingScrollPane = new JScrollPane();
        settingPanel.add(settingScrollPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
        settingScrollPane.setViewportView(panel5);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(6, 3, new Insets(15, 50, 10, 0), -1, -1));
        Font panel6Font = this.$$$getFont$$$("Microsoft YaHei UI", -1, -1, panel6.getFont());
        if (panel6Font != null) panel6.setFont(panel6Font);
        panel5.add(panel6, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "公众号"));
        final JLabel label14 = new JLabel();
        label14.setText("AppID");
        panel6.add(label14, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer12 = new Spacer();
        panel6.add(spacer12, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer13 = new Spacer();
        panel6.add(spacer13, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        wechatAppIdTextField = new JTextField();
        panel6.add(wechatAppIdTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("AppSecret");
        panel6.add(label15, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wechatAppSecretPasswordField = new JPasswordField();
        panel6.add(wechatAppSecretPasswordField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label16 = new JLabel();
        label16.setText("Token");
        panel6.add(label16, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wechatTokenPasswordField = new JPasswordField();
        panel6.add(wechatTokenPasswordField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label17 = new JLabel();
        label17.setText("AES Key");
        panel6.add(label17, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        wechatAesKeyPasswordField = new JPasswordField();
        panel6.add(wechatAesKeyPasswordField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel6.add(panel7, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        settingMpInfoSaveButton = new JButton();
        settingMpInfoSaveButton.setText("保存");
        panel7.add(settingMpInfoSaveButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer14 = new Spacer();
        panel7.add(spacer14, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer15 = new Spacer();
        panel5.add(spacer15, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridLayoutManager(6, 4, new Insets(15, 50, 10, 0), -1, -1));
        panel5.add(panel8, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "MySQL数据库"));
        final JLabel label18 = new JLabel();
        label18.setText("数据库地址");
        panel8.add(label18, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer16 = new Spacer();
        panel8.add(spacer16, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer17 = new Spacer();
        panel8.add(spacer17, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        mysqlUrlTextField = new JTextField();
        panel8.add(mysqlUrlTextField, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setText("数据库名称");
        panel8.add(label19, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mysqlDatabaseTextField = new JTextField();
        panel8.add(mysqlDatabaseTextField, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setText("用户名");
        panel8.add(label20, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mysqlUserTextField = new JTextField();
        panel8.add(mysqlUserTextField, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label21 = new JLabel();
        label21.setText("密码");
        panel8.add(label21, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mysqlPasswordField = new JPasswordField();
        panel8.add(mysqlPasswordField, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel8.add(panel9, new GridConstraints(4, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        settingTestDbLinkButton = new JButton();
        settingTestDbLinkButton.setText("测试连接");
        panel9.add(settingTestDbLinkButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer18 = new Spacer();
        panel9.add(spacer18, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        settingDbInfoSaveButton = new JButton();
        settingDbInfoSaveButton.setText("保存");
        panel9.add(settingDbInfoSaveButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new GridLayoutManager(6, 3, new Insets(15, 50, 10, 0), -1, -1));
        panel5.add(panel10, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel10.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "阿里大于"));
        final JLabel label22 = new JLabel();
        label22.setText("SMS ServerUrl");
        panel10.add(label22, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer19 = new Spacer();
        panel10.add(spacer19, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer20 = new Spacer();
        panel10.add(spacer20, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        aliServerUrlTextField = new JTextField();
        panel10.add(aliServerUrlTextField, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setText("AppKey");
        panel10.add(label23, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliAppKeyPasswordField = new JPasswordField();
        panel10.add(aliAppKeyPasswordField, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setText("AppSecret");
        panel10.add(label24, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setText("短信签名");
        panel10.add(label25, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliSignTextField = new JTextField();
        panel10.add(aliSignTextField, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        aliAppSecretPasswordField = new JPasswordField();
        panel10.add(aliAppSecretPasswordField, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel10.add(panel11, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        settingAliInfoSaveButton = new JButton();
        settingAliInfoSaveButton.setText("保存");
        panel11.add(settingAliInfoSaveButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer21 = new Spacer();
        panel11.add(spacer21, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new GridLayoutManager(2, 2, new Insets(15, 0, 10, 0), -1, -1));
        panel5.add(panel12, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel12.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "历史消息管理"));
        final JScrollPane scrollPane4 = new JScrollPane();
        panel12.add(scrollPane4, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        msgHistable = new JTable();
        msgHistable.setGridColor(new Color(-12236470));
        msgHistable.setRowHeight(40);
        scrollPane4.setViewportView(msgHistable);
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel12.add(panel13, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        msgHisTableSelectAllButton = new JButton();
        msgHisTableSelectAllButton.setText("全选");
        panel13.add(msgHisTableSelectAllButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        msgHisTableDeleteButton = new JButton();
        msgHisTableDeleteButton.setText("删除");
        panel13.add(msgHisTableDeleteButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer22 = new Spacer();
        panel13.add(spacer22, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        msgHisTableUnselectAllButton = new JButton();
        msgHisTableUnselectAllButton.setText("全不选");
        panel13.add(msgHisTableUnselectAllButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer23 = new Spacer();
        panel12.add(spacer23, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new GridLayoutManager(4, 3, new Insets(15, 50, 10, 0), -1, -1));
        panel5.add(panel14, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel14.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "外观"));
        final JLabel label26 = new JLabel();
        label26.setText("主题风格");
        panel14.add(label26, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer24 = new Spacer();
        panel14.add(spacer24, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        settingThemeComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("Darcula(推荐)");
        defaultComboBoxModel5.addElement("BeautyEye");
        defaultComboBoxModel5.addElement("weblaf");
        defaultComboBoxModel5.addElement("系统默认");
        defaultComboBoxModel5.addElement("Windows");
        defaultComboBoxModel5.addElement("Nimbus");
        defaultComboBoxModel5.addElement("Metal");
        defaultComboBoxModel5.addElement("Motif");
        settingThemeComboBox.setModel(defaultComboBoxModel5);
        panel14.add(settingThemeComboBox, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label27 = new JLabel();
        label27.setText("字体");
        panel14.add(label27, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        settingFontNameComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("Microsoft YaHei");
        defaultComboBoxModel6.addElement("Microsoft YaHei Light");
        defaultComboBoxModel6.addElement("Microsoft YaHei UI");
        defaultComboBoxModel6.addElement("Microsoft YaHei UI Light");
        settingFontNameComboBox.setModel(defaultComboBoxModel6);
        panel14.add(settingFontNameComboBox, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label28 = new JLabel();
        label28.setText("字号");
        panel14.add(label28, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        settingFontSizeComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("10");
        defaultComboBoxModel7.addElement("11");
        defaultComboBoxModel7.addElement("12");
        defaultComboBoxModel7.addElement("13");
        defaultComboBoxModel7.addElement("14");
        defaultComboBoxModel7.addElement("15");
        defaultComboBoxModel7.addElement("16");
        defaultComboBoxModel7.addElement("17");
        defaultComboBoxModel7.addElement("18");
        defaultComboBoxModel7.addElement("19");
        defaultComboBoxModel7.addElement("20");
        defaultComboBoxModel7.addElement("21");
        defaultComboBoxModel7.addElement("22");
        defaultComboBoxModel7.addElement("23");
        defaultComboBoxModel7.addElement("24");
        defaultComboBoxModel7.addElement("25");
        defaultComboBoxModel7.addElement("26");
        settingFontSizeComboBox.setModel(defaultComboBoxModel7);
        panel14.add(settingFontSizeComboBox, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel14.add(panel15, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        settingAppearanceSaveButton = new JButton();
        settingAppearanceSaveButton.setText("保存");
        panel15.add(settingAppearanceSaveButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer25 = new Spacer();
        panel15.add(spacer25, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        memberHisManagePanel = new JPanel();
        memberHisManagePanel.setLayout(new GridLayoutManager(2, 2, new Insets(15, 0, 10, 0), -1, -1));
        panel5.add(memberHisManagePanel, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        memberHisManagePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "导入历史管理"));
        final JScrollPane scrollPane5 = new JScrollPane();
        memberHisManagePanel.add(scrollPane5, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        importHisTable = new JTable();
        importHisTable.setGridColor(new Color(-12236470));
        importHisTable.setRowHeight(40);
        scrollPane5.setViewportView(importHisTable);
        final JPanel panel16 = new JPanel();
        panel16.setLayout(new GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        memberHisManagePanel.add(panel16, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        importHisTableSelectAllButton = new JButton();
        importHisTableSelectAllButton.setText("全选");
        panel16.add(importHisTableSelectAllButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        importHisTableDeleteButton = new JButton();
        importHisTableDeleteButton.setText("删除");
        panel16.add(importHisTableDeleteButton, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer26 = new Spacer();
        panel16.add(spacer26, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        importHisTableUnselectAllButton = new JButton();
        importHisTableUnselectAllButton.setText("全不选");
        panel16.add(importHisTableUnselectAllButton, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer27 = new Spacer();
        memberHisManagePanel.add(spacer27, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel17 = new JPanel();
        panel17.setLayout(new GridLayoutManager(5, 4, new Insets(15, 50, 10, 0), -1, -1));
        panel5.add(panel17, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel17.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "阿里云短信"));
        final Spacer spacer28 = new Spacer();
        panel17.add(spacer28, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JLabel label29 = new JLabel();
        label29.setText("AppKey");
        panel17.add(label29, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliyunSmsAppKey = new JPasswordField();
        panel17.add(aliyunSmsAppKey, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label30 = new JLabel();
        label30.setText("AppSecret");
        panel17.add(label30, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label31 = new JLabel();
        label31.setText("短信签名");
        panel17.add(label31, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        aliyunSmsSign = new JTextField();
        panel17.add(aliyunSmsSign, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        aliyunSmsAppSecret = new JPasswordField();
        panel17.add(aliyunSmsAppSecret, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel18 = new JPanel();
        panel18.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel17.add(panel18, new GridConstraints(3, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        settingAliyunSms = new JButton();
        settingAliyunSms.setText("保存");
        panel18.add(settingAliyunSms, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer29 = new Spacer();
        panel18.add(spacer29, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer30 = new Spacer();
        panel17.add(spacer30, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
