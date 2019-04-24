package com.infotel.metier;

public class Promo {
	private int idPromo;
	private String nomSession;
	private int effectif;
	public int getIdPromo() {
		return idPromo;
	}
	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}
	public String getNomSession() {
		return nomSession;
	}
	public void setNomSession(String nomSession) {
		this.nomSession = nomSession;
	}
	public int getEffectif() {
		return effectif;
	}
	public void setEffectif(int effectif) {
		this.effectif = effectif;
	}
	@Override
	public String toString() {
		return "Promo [idPromo=" + idPromo + ", nomSession=" + nomSession + ", effectif=" + effectif + "]";
	}
	
}
