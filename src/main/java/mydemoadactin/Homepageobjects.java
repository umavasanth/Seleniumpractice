package mydemoadactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepageobjects extends Basepage{
	
    public Homepageobjects() {
    	
	    PageFactory.initElements(driver, this);
        }
    
	
		
	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Womentab;
	
	
	public WebElement getWomentab() {
		return Womentab;
	}
	
	@FindBy(xpath= ".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dressestab;
	
	public WebElement getDressestab() {
		return Dressestab;
	}
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirttab;
	
	public WebElement getTshirttab() {
		return Tshirttab;
		
	}
	
	public void ClickWomentab() {
	Womentab.click();
	}
	public void ClickDressestab() {
    Dressestab.click();
    }
	public void ClickTshirttab() {
		Tshirttab.click();
	}
	
	@FindBy(xpath ="//*[@id='newsletter-input']")
	private WebElement NewsLetter;	
	
	
	public void ClickEmail() {
	NewsLetter.click();
	}
		
	public void ClearEmail() {
	NewsLetter.clear();	
	
	}
		    
	public void EnterEmail() {
	NewsLetter.sendKeys("umavasanth27@gmail.com");
			
	}
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement submit;
	
	public void submitbutton() {
		submit.click();
	}
}  	


