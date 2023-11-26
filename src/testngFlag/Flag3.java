package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
  @Test(priority = 1)
  public void login() {
	  
	  Reporter.log("logged in!!", true);
  }
  
  @Test(priority = 0)
  public void userCreate()
  {
	  Reporter.log("User Created!!", true);
  }
  
  @Test(priority = 2)
  public void logOut()
  {
	  Reporter.log("Logged Out!!", true);
  }
  
  
}
