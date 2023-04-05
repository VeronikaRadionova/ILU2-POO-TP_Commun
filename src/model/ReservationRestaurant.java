package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int nombrePersonnes;
	
	public ReservationRestaurant(int jour, int mois, int numService, int nbPersonnes) {
		super(jour, mois);
		this.numService = numService;
		this.nombrePersonnes = nbPersonnes;
	}
	
	public String toString() {
		if (numService == 1) {
			return "Le " + jour + "/" + mois + " : table n°" + nombrePersonnes + " pour le premier service.\n";
		} else {
			return "Le " + jour + "/" + mois + " : table n°" + nombrePersonnes + " pour le deuxième service.\n";
		}
	}

	public int getNumService() {
		return numService;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}
	
}
