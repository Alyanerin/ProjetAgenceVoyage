package Domaine;

import java.util.ArrayList;

/** 
 *  La classe Domaine.Voyage est la classe metier.
 *  Cette classe est renvoyee dans une liste par Domaine.AgenceVoyageService.
 */
public class Voyage {

	private int numeroVoyage;
	private Boolean statut;
	public double prix;
	public Formule formule;
	public ArrayList<Reservation>  mesReservations;
	private Destination destination;
	public Voyage(int numeroVoyage, Boolean statut, Destination destination) {
		super();
		this.numeroVoyage = numeroVoyage;
		this.statut = statut;
		this.destination = destination;
	}
	public int getNumeroVoyage() {
		return numeroVoyage;
	}
	public void setNumeroVoyage(int numeroVoyage) {
		this.numeroVoyage = numeroVoyage;
	}
	public Boolean getStatut() {
		return statut;
	}
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Voyage [numeroVoyage=" + numeroVoyage + ", statut=" + statut + ", prix=" + prix + ", formule=" + formule
				+ ", mesReservations=" + mesReservations + ", destination=" + destination + "]";
	}

	
	
}