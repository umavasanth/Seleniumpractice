package mydemoadactin;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Homepagetest extends Basepage {
	
	Homepageobjects hp;
	Basepage bp;
	
	
	public Homepagetest() {
		hp= new Homepageobjects();
		bp = new Basepage();
	}


@Test
public void VerifyTab() {
	Assert.assertTrue(bp.elementFound(hp.getWomentab()));
	Assert.assertTrue(bp.elementFound(hp.getDressestab()));
	Assert.assertTrue(bp.elementFound(hp.getTshirttab()));
}

@Test
public void VerifytabNavigation() {
	hp.ClickWomentab();
	Assert.assertTrue(bp.getTitlte().contains("Women"));
	
	hp.ClickDressestab();;
	Assert.assertTrue(bp.getTitlte().contains("Dresses"));
	
	hp.ClickTshirttab();
	Assert.assertTrue(bp.getTitlte().contains("T-shirts"));
}
	@Test
	public void VerifyEmail() {
		
		hp.ClickEmail();
		hp.ClearEmail();
		hp.EnterEmail();
		hp.submitbutton();
	}
	
}	
		
		
		
	



