package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {
    private int numero;
    private String description;
    private double prixCourant;
    private LocalDate dateEnchere;
    private LocalTime heureDebut;
    private double coutParticipation;
    private boolean enCours;
    private LocalDate dateFinEnchere;
    private LocalTime heureFin;
    private ArrayList<OffreEnchere> listeOffreP;

    private static double pasEnchere; //le pas d'enchère minimal commun à tous les produits vendus.

    public Produit(int numero, String description, double prixCourant, double coutParticipation) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        enCours = false;
        listeOffreP = new ArrayList<>();
    }

    public static void setPasEnchere(double newPas){
        pasEnchere = newPas;
    }

    public void demarrerEnchere(double coutParticipation){
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

    public void ajouterOffre(OffreEnchere offre){
        if(!enCours || offre.getPrixCourant()-prixCourant >= pasEnchere){
            listeOffreP.add(offre);
        }
    }
}
