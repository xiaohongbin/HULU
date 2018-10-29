package com.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;


/**
 * Created by yaowang on 2017/5/10.
 */
public class OverrideIReTry implements IRetryAnalyzer {

    public  int initReTryNum = 1;
    public  int maxReTryNum = 1;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if (initReTryNum < maxReTryNum) {
            String message = "用例 <" + iTestResult.getName() + ">运行失败，第" + initReTryNum + "次重试";

            Reporter.setCurrentTestResult(iTestResult);
            Reporter.log(message);
            initReTryNum++;
            return true;
        }
        return false;
    }

}
