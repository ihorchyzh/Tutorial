package com.tutorial;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends Base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

    }

}
