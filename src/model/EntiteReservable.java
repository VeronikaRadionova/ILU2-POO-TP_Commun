package model;

import model.CalendrierAnnuel; // ???
import model.Formulaire;

public abstract class EntiteReservable <F extends Formulaire>{
	private CalendrierAnnuel calendrierPersonnel;
	private int numero;

	public EntiteReservable(CalendrierAnnuel calendrierPersonnel, int numero) {
		this.calendrierPersonnel = calendrierPersonnel;
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F formulaire) {
		if (calendrierPersonnel.estLibre(formulaire.getJour(), formulaire.getMois())) {
			return true;
		}
		return false;
	}
	
/*	public boolean compatible(F formulaire) {
		if (calendrierPersonnel.reserver(formulaire.getJour(), formulaire.getMois())) {
			return true;
		}
		return false;
	}
	
	public Reservation reserver(F formulaire) {
		if (!compatible(formulaire)) {
			return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), formulaire.getNbPersonnes());
		}
		return null;
	}
	*/
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}
