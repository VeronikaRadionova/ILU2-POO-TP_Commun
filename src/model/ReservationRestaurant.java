package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int mois, int jour, int numService, int numTable) {
		super(mois, jour);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	public String toString() {
		if (numService == 1) {
			return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le premier service.\n";
		} else {
			return "Le " + jour + "/" + mois + " : table n°" + numTable + " pour le deuxième service.\n";
		}
	}
}
