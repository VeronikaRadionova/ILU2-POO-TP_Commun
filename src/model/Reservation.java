package model;

public class Reservation {
	protected int mois;
	protected int jour;
	
	public Reservation(int jour, int mois) {
		this.mois = mois;
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public int getJour() {
		return jour;
	}
	
	
}
