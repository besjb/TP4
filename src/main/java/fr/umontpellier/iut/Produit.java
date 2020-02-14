package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class Produit {
    private int numero;
    private String description;
    private int prixCourant;
    private LocalDate dateEnchere;
    private LocalTime heureDebut;
    private int coutParticipation;
    private boolean enCours;
    private LocalDate dateFinEnchere;
    private LocalTime heureFin;

    private static int pasEnchere; //le pas d'enchère minimal commun à tous les produits vendus.

    public Produit(int numero, String description, int prixCourant, int coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        enCours = false;
    }

    public static void setPasEnchere(int newPas){
        pasEnchere = newPas;
    }

    public void demarrerEnchere(int coutParticipation){
        this.coutParticipation = coutParticipation;
        dateEnchere = LocalDate.now();
        heureDebut = LocalTime.now();
        enCours = true;
    }

    public void arreterEnchere(){
        dateFinEnchere = LocalDate.now();
        heureFin = LocalTime.now();
        enCours = false;
        coutParticipation = 0;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numero=" + numero +
                ", description='" + description + '\'' +
                ", prixCourant=" + prixCourant +
                ", dateEnchere=" + dateEnchere +
                ", heureDebut=" + heureDebut +
                ", coutParticipation=" + coutParticipation +
                ", dateFinEnchere=" + dateFinEnchere +
                ", heureFin=" + heureFin +
                '}';
    }
}
