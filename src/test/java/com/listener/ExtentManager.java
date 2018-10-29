package com.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ResourceCDN;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;
//import com.aventstack.extentreports.reporter.KlovReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Reporter;


import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;

//    public static ExtentReports getInstance(String filePath, ExtentXReporter extentx) {
        public static ExtentReports getInstance(String filePath) {
        File reportDir = new File("test-output");
        if (!reportDir.exists() && !reportDir.isDirectory()) {
            reportDir.mkdir();
        }
        if (extent == null)
//            createInstance(filePath, extentx);
            createInstance(filePath);
        return extent;
    }


//    public static void createInstance(String filePath, ExtentXReporter extentx) {
        public static void createInstance(String filePath) {
        extent = new ExtentReports();

        extent.attachReporter(createHtmlReporter(filePath));
//        extent.attachReporter(createExtentXReporter(extentx));
//        extent.attachReporter(createKlovReporter());

    }

    public static ExtentHtmlReporter createHtmlReporter(String filePath) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filePath);
        extent.setSystemInfo("手机", "华为H60");
        extent.setSystemInfo("android", "4.4.2");
        extent.setSystemInfo("3线渠道", "156878");
        extent.setSystemInfo("1线渠道", "120220");
        extent.setSystemInfo("测试环境","huluprep");
        extent.setSystemInfo("3线城市","湖北鄂州");
        extent.setSystemInfo("1线城市","广东广州");
        htmlReporter.config().setDocumentTitle("多名称UI自动化测试报告");
        htmlReporter.config().setReportName("多名称UI自动化测试报告");
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setEncoding("GB2312");
        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
        htmlReporter.config().setCSS(".node.level-1  ul{ display:none;} .node.level-1.active ul{display:block;}");
        return htmlReporter;
    }

    public static ExtentXReporter createExtentXReporter(ExtentXReporter extentx) {
//        ExtentXReporter extentx = new ExtentXReporter("localhost", 27017);
//        extentx.getTestRunnerLogs();
        extent.setSystemInfo("OS_platform", "centos");

        extentx.config().setProjectName("LBS");
        extentx.config().setReportName("Build-0.02");
        extentx.config().setServerUrl("http://localhost:1337");
        return extentx;
    }

//    public static KlovReporter createKlovReporter(){
//        KlovReporter klovReporter = new KlovReporter();
//        klovReporter.initMongoDbConnection("localhost", 27017);
//
//        klovReporter.setProjectName("LBS");
//        klovReporter.setReportName("AppTest-0.0.1");
//
//        klovReporter.setKlovUrl("http://localhost:8088");
//        return klovReporter;
//    }
}
