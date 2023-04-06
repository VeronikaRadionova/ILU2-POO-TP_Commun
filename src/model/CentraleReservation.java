package model;

public class CentraleReservation <E extends EntiteReservable <F>, F extends Formulaire > {
	private E[] aReserver;
	private int nbEntites = 0;
	
	public CentraleReservation(E[] aReserver) {
		 this.aReserver = aReserver;
	}
	
	
	public int ajouterEntite(E entite) {
		aReserver[nbEntites] = entite;
		nbEntites = nbEntites + 1;
		return entite.getNumero();
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[nbEntites]; 
		for (int i = 0; i < nbEntites; i++) {
			if (aReserver[i].estLibre(formulaire)) {
				possibilites[i] = i + 1;
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numero, F formulaire) {
		
	}
}

