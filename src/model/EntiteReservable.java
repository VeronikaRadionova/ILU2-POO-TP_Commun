package model;

import model.CalendrierAnnuel; // ???
import model.FormulaireRestaurant;

public class EntiteReservable {
	private CalendrierAnnuel calendrierPersonnel;
	private int identification;

	
	
	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}
	
	public boolean estLibre(FormulaireRestaurant formRestau) {
		if (calendrierPersonnel.estLibre(formRestau.getJour(), formRestau.getMois())) {
			return true;
		}
		return false;
	}
	
	public boolean compatible(FormulaireRestaurant formRestau) {
		if (calendrierPersonnel.reserver(formRestau.getJour(), formRestau.getMois())) {
			return true;
		}
		return false;
	}
	
	public Reservation reserver(FormulaireRestaurant formRestau) {
		if (!compatible(formRestau)) {
			return new ReservationRestaurant(formRestau.getJour(), formRestau.getMois(), formRestau.getNumService(), formRestau.getNombrePersonnes());
		}
		return null;
	}
}
