package Domaine;

/**
 *  Genere facture avec informations adequates
 */
public class Facture {
  /* {author=Laure, version=1.0}*/

    public Client  client;
    public Reservation reservation;
	public Facture(Client client, Reservation reservation) {
		super();
		this.client = client;
		this.reservation = reservation;
	}
    
    

}