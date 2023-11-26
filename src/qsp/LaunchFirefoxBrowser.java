package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
		new FirefoxDriver();
	}

}