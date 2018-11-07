package Dauphine.TP3;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
	
	private String name;
	private int Charbon;
    private int NombreHeuredispo;
    private String Etat;
	private int Etat2;
	
	private int capacity =0;
	

@Given("^Creation d un charbonnier avec un nom, une Qte de Charbon, son nombre d heures de travail ainsi que son etat d humeur$")
public void creation_d_un_charbonnier_avec_un_nom_une_Qte_de_Charbon_son_nombre_d_heures_de_travail_ainsi_que_son_etat_d_humeur(){
    // Write code here that turns the phrase above into concrete actions
	this.name = "marc";	
	this.Charbon = 10;
	this.NombreHeuredispo = 72;
	this.Etat = "Content";

}

@Given("^la creation d une mine avec son nom\\.$")
public void la_creation_d_une_mine_avec_son_nom(){
    // Write code here that turns the phrase above into concrete actions
	this.name="mine1";
    
}

@Then("^Le charbonnier est affecte a la mine et peut y travailler\\.$")
public void le_charbonnier_est_affecte_a_la_mine_et_peut_y_travailler(Charbonnier charbonn1, Mine mine1){
    // Write code here that turns the phrase above into concrete actions
    charbonn1.Travailler(mine1);
    assertEquals(2, charbonn1.getEtat2());


}


}