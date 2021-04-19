package Domaine;

public class MoyenPaiement {
  /** 
   *  Nom de la banque
   */
	public String banque;
  /**
   *  Montant sur le compte du client sur le compte de la banque
   */
  
	public double solde;

	public MoyenPaiement(String banque, double solde) {
	this.banque = banque;
	this.solde = solde;
	}
	public MoyenPaiement() {
		
	}



  
}