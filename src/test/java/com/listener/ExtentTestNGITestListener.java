package com.listener;

import com.driver.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentXReporter;
import org.testng.*;
import org.testng.annotations.ITestAnnotation;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentTestNGITestListener implements ITestListener,IAnnotationTransformer {
    private Date date=new Date();
    DateFormat format=new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
    private String time=format.format(date);

//    ExtentXReporter extentx = new ExtentXReporter("localhost", 27017);
//    public ExtentReports extent = ExtentManager.getInstance("test-output/extent"+time+".html",extentx);
    public ExtentReports extent = ExtentManager.getInstance("test-output/extent"+time+".html");
    public  ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
    public  static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

    //    ExtentTest.java feature;
//    ExtentTest.java scenario ;
    ExtentTest child;


    @Override
    public synchronized void onStart(ITestContext context) {
//        System.out.println(context.getSuite().getName()); ptengine-UI
//        System.out.println(context.getName());
//        parentTest=extent.createTest(context.getName());
//        ExtentTest parent = extent.createTest(context.getName());
        ExtentTest parent = extent.createTest(context.getSuite().getName());
        parentTest.set(parent);

    }

    @Override
    public synchronized void onFinish(ITestContext context) {
        extent.flush();


    }

    @Override
    public synchronized void onTestStart(ITestResult result){

//        child = ((ExtentTest)parentTest.get()).createNode(result.getMethod().getMethodName());
        child = ((ExtentTest)parentTest.get()).createNode(result.getMethod().getDescription());
        test.set(child);
        ((ExtentTest)test.get()).info(result.getMethod().getMethodName()+" begin");
    }


    @Override
    public synchronized void onTestSuccess(ITestResult result) {
        ((ExtentTest)test.get()).pass("Test passed");
    }

    @Override
    public synchronized void onTestFailure(ITestResult result) {
        ((ExtentTest)test.get()).fail(result.getThrowable());
        File directory = new File("test-output");
        try {
            String screenPath = directory.getCanonicalPath() + "/";
            File file = new File(screenPath);
            if (!file.exists()){
                file.mkdirs();
            }
            takeScreenShot(result);//"test-output/" +
            ((ExtentTest)test.get()).addScreenCaptureFromPath(result.getTestClass().getName() + result.getMethod().getMethodName() + ".jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void takeScreenShot(ITestResult tr) {
        Driver baseTestcase = (Driver)tr.getInstance();

        /**
         *  截图名称需要为 当前 case所在的java文件名+对应的 case（method）名称，在生成报告时，不同的driver线程，插入对应的图片
         */
//
        baseTestcase.takescreen(tr.getInstanceName() + tr.getName());

//        baseTestcase.takescreen(tr.getInstanceName() + tr.getName());
    }
    @Override
    public synchronized void onTestSkipped(ITestResult result) {
        ((ExtentTest)test.get()).skip(result.getThrowable());
//        File directory = new File("test-output");
//        try {
//            String screenPath = directory.getCanonicalPath() + "/";
//            File file = new File(screenPath);
//            if (!file.exists()){
//                file.mkdirs();
//            }
////
//            takeScreenShot(result);
////
//            ((ExtentTest)test.get()).addScreenCaptureFromPath("test-output/" + result.getTestClass().getName() + result.getMethod().getMethodName() + ".png");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public ExtentTest getlog(){
        return test.get();
    }


    @Override
    public void transform (ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer iRetryAnalyzer= iTestAnnotation.getRetryAnalyzer();
        if(iRetryAnalyzer==null){
            iTestAnnotation.setRetryAnalyzer(OverrideIReTry.class);
        }
    }
}
