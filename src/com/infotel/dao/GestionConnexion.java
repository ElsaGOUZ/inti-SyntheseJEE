package com.infotel.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GestionConnexion {
	
	//2-CHARGER LES ELEMENTS DE CONNEXION
		private String url="jdbc:postgresql://localhost:5432/SyntheseJEE";
		private String user="postgres";
		private String password="INMP031";
		private static Connection connect;

		private GestionConnexion() {
			try {
				Class.forName("org.postgresql.Driver");
		  connect= DriverManager.getConnection(url,user,password);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static Connection getInstance(){
			if(connect== null) {
				new GestionConnexion();	
			}
			return connect;
		}
		
		
		
	}

