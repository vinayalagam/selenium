package automation;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

import com.sun.tools.doclint.Messages.Group;

import net.bytebuddy.implementation.EqualsMethod;

public class TestNGFrameWork {
	/*@BeforeSuite
	public void befoutsuite() {
		System.out.println("befoursuite");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");

	}

	@BeforeTest
	public void befourTest() {
		System.out.println("befourtest");
	}

	@AfterTest

	public void afterTest() {
		System.out.println("aftertest");
	}

	@BeforeClass
	public void befourclass() {
		System.out.println("befourclass");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}

	@BeforeMethod
	public void befourMethod() {
		System.out.println("befourmethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}

	@BeforeGroups
	public void befourgroups() {
		System.out.println("befourgroups");
	}

	@AfterGroups
	public void aftergroups() {
		System.out.println("aftergroups");

	}*/
	//@Test(priority = 1,description = "this is testNG attribute value",dependsOnMethods = "methodtwo")
	public void vinay() {
	System.out.println("vinay");
	
	}

	//@Test(priority = 2,description = "this is testNG attribute value",timeOut = 5000)
	public void alagam() throws InterruptedException {
		System.out.println("alagam");
		Thread.sleep(3000);	
	}
	
	//@Test(priority = 6,description = "this is testNG attribute value ")
	public void av() {
		System.out.println("av");
		
	}
	
	//@Test(priority = 3,enabled = false,description = "testNG attribute value true")
	public void methodone() {
	System.out.println("methodone");	
	}

	//@Test(priority = 4,enabled = true,description = "testNG")
	public void methodtwo() {
		System.out.println("methodtwo");
		Assert.assertEquals(25, 25);

		}
	//@Test(priority = 5, description = "this is testNG methidthree")
	public void methodthree() {
		System.out.println("methodthree");
	}
	
	
	
	// gropus                                         // GROUPS
	
	
	
    //@Test(groups= {"sanity"})
     public void sanity() {
    	 System.out.println("sanity test cases");
     }
     //@Test(groups = {"sanityTwo"})
     public void sanityTwo() {
    	 System.out.println("sanityTwo test cases");
     }
     //@Test(groups = {"regression"})
     public void regression() {
    	 System.out.println("regression test cases");
     }
     //@Test(groups = {"integration"})
     public void integration() {
    	 System.out.println("integration test cases");
     }
     //@Test(groups = {"sanityregression"})
     public void sanityregression() {
    	 System.out.println("sanity regression test cases");
     }
     
     
     //parameters                                              //PARAMETERS
     
     //@Optional
     
     @Parameters ({"firstname","lastname"})
     @Test
     public void methoddonee(String fname,String lname){
    	 System.out.println(fname);
    	 System.out.println(lname);
    	 
     }
     
 // Dataprovider                                     //Dataprovider    
     
     
 
     @Test(dataProvider = "logindetails")
     public void login(String Fname,String Lname) {
    	 
     
    	System.out.println(Fname+Lname);  
     }
     @DataProvider(name = "logindetails")
     public Object[][] getdatafromprovider(){
	 return new Object[][]
			{
		 {"vinay","alagam"},
		 {"alagam","vinay"},
			};
}

}