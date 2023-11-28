package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.ListeSouhaits;
import Pages.MaisonConnecte;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteeStepDef {

@Given("Utilisateur est sur la page de la maison connecte")
public void utilisateur_est_sur_la_page_de_la_maison_connecte() throws Exception {
	Config.ConfChrome();
	Config.navigateURL(Utils.getProperty("MaisonConnecteLink"));
	Config.maximizeWindow();
   
}

@When("Utilisateur fait le tri par {string} et selectionne un produit {string}")
public void utilisateur_fait_le_tri_par_et_selectionne_un_produit(String SortTri, String NomProduit) {
	MaisonConnecte page= new MaisonConnecte();
	page.triProduit(SortTri);
	page.clickProductByName(NomProduit);
	
   
}

@Then("Utilisateur est dirige vers la page du produit {string}")
public void utilisateur_est_dirige_vers_la_page_du_produit(String ExpectedMessage) {
	ListeSouhaits list= new ListeSouhaits();
	String actualMessage= list.VerificationP();
	Assert.assertEquals(ExpectedMessage, actualMessage);
	Config.quit();
	
  
}




}
