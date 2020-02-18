package fr.umontpellier.iut;

import java.util.Scanner;

public class IBaille {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        boolean quitter = false;
        double prix = 0, prixMax = 0;

        Produit banane = new Produit(1,"Une banane",10);

        Compte compte1 = new Compte("Philippe", "phiphi@gmail.com","12 rue de la chouette",0);
        Compte compte2 = new Compte("Inosuke", "inosuke@gmail.com","3 rue du sanglier",0);
        Compte compte3 = new Compte("Michel", "michel@gmail.com","50 rue de l'impasse",0);

        compte1.crediter(1000);
        compte2.crediter(2500);
        compte3.crediter(1500);

        banane.demarrerEnchere(10);
        banane.setPasEnchere(1);

        while(!quitter) {
            System.out.println("Voir l'offre : tappez 1");
            System.out.println("Proposer une offre : tappez 2");
            System.out.println("Voir le gagnant actuel : tappez 3");
            System.out.println("Fin de l'enchere : tappez 0");
            int choixClient = saisie.nextInt();

            if(choixClient == 1){
                System.out.println(banane);
                System.out.println("-------------------------------------");
            }else if(choixClient == 2) {
                System.out.println("Veulliez rentrer le numéro de votre compte : ");
                int numCompte = saisie.nextInt();
                if (numCompte == 1) {
                    System.out.println("Bonjour " + compte1.getPseudo());
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    banane.ajouterOffre(compte1.creerOffre(banane, prix, prixMax,compte1.getPseudo()));
                } else if (numCompte == 2) {
                    System.out.println("Bonjour " + compte2.getPseudo());
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    banane.ajouterOffre(compte2.creerOffre(banane, prix, prixMax,compte2.getPseudo()));
                } else if (numCompte == 3) {
                    System.out.println("Bonjour " + compte3.getPseudo());
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    banane.ajouterOffre(compte3.creerOffre(banane, prix, prixMax,compte3.getPseudo()));
                    System.out.println("-------------------------------------");
                } else {
                    System.out.println("Numéro erroné !");
                }
            }else if(choixClient == 3){
                System.out.println("Le gagnant actuel est : "+ banane.getGagnant());
                System.out.println("-------------------------------------");
            }else if(choixClient == 0){
                System.out.println("Fin de l'enchere");
                System.out.println("Le gagnant est : "+banane.getGagnant());
                banane.arreterEnchere();
                System.out.println("-------------------------------------");
                quitter = true;
            }
        }
    }
}
