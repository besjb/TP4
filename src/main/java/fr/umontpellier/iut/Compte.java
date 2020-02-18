package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private double solde;
    private ArrayList<OffreEnchere> listeOffre;

    public Compte(String pseudo, String email, String adresse, double solde) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.solde = solde;
        listeOffre = new ArrayList<>();
    }

    public void crediter(double somme){
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

    public OffreEnchere creerOffre(Produit p, double prixCourant, double prixMax, String nom){
        OffreEnchere newOffre = new OffreEnchere(p,prixCourant,prixMax,nom);
        listeOffre.add(newOffre);
        return newOffre;
    }

    public String getPseudo() {
        return pseudo;
    }

    public OffreEnchere getListeOffre(int index) {
        return listeOffre.get(index);
    }
}
