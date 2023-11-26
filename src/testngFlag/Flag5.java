package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	 @Test
	  public void logIn() {
		  
		  Reporter.log("log in!!", true);
	  }
	  
	  @Test(dependsOnMethods = "logIn")
	  public void createUser()
	  {
		  Reporter.log("User Created!!", true);
	  }
	  
	  @Test(dependsOnMethods = "createUser")
	  public void logOut()
	  {
		  Reporter.log("Logged Out!!", true);
	  }
}
