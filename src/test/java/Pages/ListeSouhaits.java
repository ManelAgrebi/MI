package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ListeSouhaits {
	
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/div[2]/div/div/div/div/a/span")
	WebElement AddWish;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[4]/div/section/div/div[1]/div/div/div/div/a/i")
	WebElement ListSouhait;
	@FindBy(xpath="/html/body/div[1]/div[5]/section/div/div/div/form/table/tbody/tr/td[2]/a")
	WebElement VerifProduit;
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement VerifProduitName;
	
	public ListeSouhaits () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void AddProduct() {
		AddWish.click();
		
	}
	
	public void ListDeSouhaits () {
		WebDriverWait wait= new WebDriverWait (Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ListSouhait));
		ListSouhait.click();
	}
	
	public String VerificationS() {
		String VerifS= VerifProduit.getText();
		return VerifS;
		
	}
	public String VerificationP() {
		String VerifS= VerifProduitName.getText();
		return VerifS;
		
	}

}
