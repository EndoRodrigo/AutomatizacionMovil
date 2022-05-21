package PrimerTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class TestCases {

        AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Bluestacks");
            desiredCapabilities.setCapability("appPackage", "com.segurosbolivar.bolivarconmigo");
            desiredCapabilities.setCapability("appActivity", "io.ionic.starter.MainActivity");
            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            driver = new AndroidDriver(url,desiredCapabilities);

        }

        @Test
        public void IniciarApp(){
            System.out.println("Inciando la app bolivar conmigo");
        }


        @After
        public void tearDown() {
            driver.quit();
        }

}
