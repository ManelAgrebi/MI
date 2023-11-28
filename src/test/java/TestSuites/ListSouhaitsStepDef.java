package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.ListeSouhaits;
import io.cucumber.java.en.*;

public class ListSouhaitsStepDef {
	@Given("Utilisateur est sur la page du produit")
	public void utilisateur_est_sur_la_page_du_produit() throws Exception {
		Config.ConfChrome();
		Config.navigateURL(Utils.getProperty("ProduitLink"));
		Config.maximizeWindow();
		
	    
	}

	@When("Utilisateur clique sur Ajout souhait")
	public void utilisateur_clique_sur_ajout_souhait() {
		ListeSouhaits list= new ListeSouhaits();
		list.AddProduct();
		
	    
	}

	@Then("Utilisateur est sur la page de la liste de souhaits")
	public void utilisateur_est_sur_la_page_de_la_liste_de_souhaits() throws Exception {
		ListeSouhaits list= new ListeSouhaits();
		Thread.sleep(5000);
		list.ListDeSouhaits();
		String VerifProduit= list.VerificationS();
		Assert.assertEquals("Xiaomi Smart Camera C300", VerifProduit);
		Config.quit();
	
		
	 
	}




}
