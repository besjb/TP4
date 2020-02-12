package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private int solde;
    private ArrayList<OffreEnchere> listeOffre;

    public Compte(String pseudo, String email, String adresse, int solde) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.solde = solde;
        listeOffre = new ArrayList<>();
    }

    public void crediter(int somme){
        solde += somme;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", solde=" + solde +
                '}';
    }

    public void creerOffre(Produit p, int prixCourant, int prixMax){
        OffreEnchere newOffre = new OffreEnchere(prixCourant,prixMax);
        listeOffre.add(newOffre);
    }
}
