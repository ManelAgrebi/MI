package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import Pages.MaisonConnecte;
import io.cucumber.java.en.*;


public class HomePageStepDef {

@Given("Utilisateur est sur la page d acceuil")
public void utilisateur_est_sur_la_page_d_acceuil() throws Exception {
	Config.ConfChrome();
	Config.navigateURL(Utils.getProperty("HomePageLink"));
	Config.maximizeWindow();
   
}

@When("Utilisateur survole sur {string} et clique sur {string}")
public void utilisateur_survole_sur_et_clique_sur(String Menu, String Submenu) {
	HomePage home= new HomePage();
	home.moushoverOnMenuByName(Menu);
	home.clickOnMenuByName(Submenu);
  
}

@Then("Utilisateur est dirige vers {string}")
public void utilisateur_est_dirige_vers(String ExceptedText) {
	MaisonConnecte page= new MaisonConnecte();
	String actualMessage= page.verifMessage();
	Assert.assertEquals(ExceptedText, actualMessage);
	Config.quit();
   
}




}
