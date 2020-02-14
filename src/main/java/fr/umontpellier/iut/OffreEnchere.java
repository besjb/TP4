package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {
    private Produit produit;
    private LocalDate date;
    private LocalTime heure;
    private int prixCourant;
    private int prixMax;

    public OffreEnchere(Produit produit,int prixCourant, int prixMax) {
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

    public int getPrixCourant() {
        return prixCourant;
    }

    public int getPrixMax() {
        return prixMax;
    }

    public void setPrixCourant(int prixCourant) {
        this.prixCourant = prixCourant;
    }

    public void setPrixMax(int prixMax) {
        this.prixMax = prixMax;
    }
}
