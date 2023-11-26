package qsp;

public class LaunchOperaDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
		new LaunchOperaDriver();
		
	}

}