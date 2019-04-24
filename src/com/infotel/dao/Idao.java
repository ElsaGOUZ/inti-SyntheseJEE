package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public interface Idao {

	public int ajouterStagiaire(Stagiaire s);	
	public int supprimerStagiaire(int idStagiaire);  
	public List <Stagiaire> findAll();
	public void ajouterStagiairePromo(Stagiaire s,Promo p);
	
	public int ajouterPromo(Promo p);	
	public int supprimerPromo(int idPromo);  
	public List <Promo> findAllPromo();
	public void ajouterPromoFormation(Promo p,Formation f);
	
	public int ajouterFormation(Formation f);	
	public int supprimerFormation(int idFormation);  
	public List <Formation> findAllFormation();
}
