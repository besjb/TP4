package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private Produit produit;
    private LocalDate date;
    private LocalTime heure;
    private double prixCourant;
    private double prixMax;

    public OffreEnchere(Produit produit,double prixCourant, double prixMax) {
        this.prixCourant = prixCourant;
        this.prixMax = prixMax;
        heure = LocalTime.now();
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "produit=" + produit +
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
}
