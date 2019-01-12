package generic;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;
import com.objectrepo.Home;
import com.objectrepo.Task;

public class sampletest extends Baseclass{
	@Test
	public void create() {
	Home hp=PageFactory.initElements(driver, Home.class);
	hp.navigateTotask();
	Task tp=PageFactory.initElements(driver, Task.class);
	tp.navigatetoCustomer();
	
}
}
