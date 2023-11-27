package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnecte {
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verifPage;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement triProductSelect;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement>productList;
	public MaisonConnecte(){   
		PageFactory.initElements(Config.driver, this);
	}
	
	public String  verifMessage() {
		String actualMessage=verifPage.getText();
		return actualMessage;
	}
	
	
	public void triProduit(String sortTri) {
		Select select=new Select(triProductSelect);
		select.selectByVisibleText(sortTri);
	}
	
	public void clickProductByName(String productName) {
		
		for(WebElement product:productList) {
			if(product.getText().contains(productName)) {
				product.click();
			}
		}
	}
}
