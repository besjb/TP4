package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private Produit produit;
    private LocalDate date;
    private LocalTime heure;
    private double prixCourant;
    private double prixMax;
    private boolean estGagnant;
    private String nomUtilisateur;

    public OffreEnchere(Produit produit,double prixCourant, double prixMax, String nom) {
        this.produit = produit;
        this.prixCourant = prixCourant;
        this.prixMax = prixMax;
        heure = LocalTime.now();
        date = LocalDate.now();
        nomUtilisateur = nom;
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "Nom Utilisateur =" + nomUtilisateur +
                ", produit=" + produit +
                ", date=" + date +
                ", heure=" + heure +
                ", prixCourant=" + prixCourant +
                ", prixMax=" + prixMax +
                '}';
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    public void setPrixMax(double prixMax) {
        this.prixMax = prixMax;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setEstGagnant(boolean estGagnant) {
        this.estGagnant = estGagnant;
    }
}
