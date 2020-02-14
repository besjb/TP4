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
    private OffreEnchere enchereGagnante;

    private static double pasEnchere; //le pas d'enchère minimal commun à tous les produits vendus.

    public Produit(int numero, String description, double prixCourant) {
        this.numero = numero;
        this.description = description;
        this.prixCourant = prixCourant;
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
        if(enchereGagnante == null || (offre.getPrixCourant() >= prixCourant + pasEnchere && offre.getPrixMax() > enchereGagnante.getPrixMax())){
            offre.setEstGagnant(true);
            enchereGagnante = offre;
            prixCourant = enchereGagnante.getPrixCourant();
            listeOffreP.add(offre);
        }
    }

    public OffreEnchere getGagnant(){
        return enchereGagnante;
    }
}
