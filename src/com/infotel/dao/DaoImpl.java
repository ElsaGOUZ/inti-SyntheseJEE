package com.infotel.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.infotel.metier.Formation;
import com.infotel.metier.Promo;
import com.infotel.metier.Stagiaire;

public class DaoImpl implements Idao {
	private Connection conn;
	private PreparedStatement st;
	private ResultSet rs;

	@Override
	public int ajouterStagiaire(Stagiaire s) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			//Pour faire le methode ajouter une promo à un stagiaire on ajoute fpromo dans le insert et en attribut dans la classe et dans les servelts
			st = conn.prepareStatement("INSERT INTO Stagiaire(nom,prenom,age,fpromo)" + "VALUES(?,?,?,?)");
			st.setString(1, s.getNom());
			st.setString(2, s.getPrenom());
			st.setInt(3, s.getAge());
			st.setInt(4, s.getFpromo());

			st.executeUpdate();

			// 3-recupérer les resultats en cas de besoin
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return s.getIdStagiaire();
	}

	@Override
	public int supprimerStagiaire(int idStagiaire) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			st = conn.prepareStatement("DELETE FROM Stagiaire WHERE idStagiaire=?");
			st.setInt(1, idStagiaire);

			st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public List<Stagiaire> findAll() {
		List<Stagiaire> list = new ArrayList<Stagiaire>();
		try {
			// 1- se connecter à la base de données
			conn = GestionConnexion.getInstance();
			// 2- préparer effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Stagiaire");

			rs = st.executeQuery();
			// 3- récupérer le résultat en cas de besoin

			while (rs.next()) {
				Stagiaire s = new Stagiaire();
				s.setIdStagiaire(rs.getInt("idStagiaire"));
				s.setNom(rs.getString("nom"));
				s.setPrenom(rs.getString("prenom"));
				s.setAge(rs.getInt("age"));

				list.add(s);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void ajouterStagiairePromo(Stagiaire s, Promo p) {
		// TODO Auto-generated method stub

	}

	// PROMO

	@Override
	public int ajouterPromo(Promo p) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			st = conn.prepareStatement("INSERT INTO Promo(nomSession,effectif)" + "VALUES(?,?)");
			st.setString(1, p.getNomSession());
			st.setInt(2, p.getEffectif());

			st.executeUpdate();

			// 3-recupérer les resultats en cas de besoin
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return p.getIdPromo();
	}

	@Override
	public int supprimerPromo(int idPromo) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			st = conn.prepareStatement("DELETE FROM Promo WHERE idPromo=?");
			st.setInt(1, idPromo);

			st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public List<Promo> findAllPromo() {
		List<Promo> list = new ArrayList<Promo>();
		try {
			// 1- se connecter à la base de données
			conn = GestionConnexion.getInstance();
			// 2- préparer effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Promo");

			rs = st.executeQuery();
			// 3- récupérer le résultat en cas de besoin

			while (rs.next()) {
				Promo p = new Promo();
				p.setIdPromo(rs.getInt("idPromo"));
				p.setNomSession(rs.getString("nomSession"));
				p.setEffectif(rs.getInt("effectif"));

				list.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void ajouterPromoFormation(Promo p, Formation f) {
		// TODO Auto-generated method stub
	}

	// FORMATION
	@Override
	public int ajouterFormation(Formation f) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			st = conn.prepareStatement("INSERT INTO Formation (nomFormation)" + "VALUES(?)");
			st.setString(1, f.getNomFormation());

			st.executeUpdate();

			// 3-recupérer les resultats en cas de besoin
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f.getIdFormation();
	}

	@Override
	public int supprimerFormation(int idFormation) {
		try {
			// 1- se connecter à la BDD
			conn = GestionConnexion.getInstance();

			// 2-preparer et effectuer la requete
			st = conn.prepareStatement("DELETE FROM Formation WHERE idFormation=?");
			st.setInt(1, idFormation);

			st.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Formation> findAllFormation() {
		List<Formation> list = new ArrayList<Formation>();
		try {
			//1- se connecter à la base de données
			conn = GestionConnexion.getInstance();
			//2- préparer effectuer la requête
			st = conn.prepareStatement("SELECT * FROM Formation");
		  
			rs = st.executeQuery();
			//3- récupérer le résultat en cas de besoin
			
			while(rs.next())
			{
				Formation f = new Formation();
				f.setIdFormation(rs.getInt("idFormation"));
				f.setNomFormation(rs.getString("nomFormation"));
				
				
				list.add(f);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
				
	    }
	}

