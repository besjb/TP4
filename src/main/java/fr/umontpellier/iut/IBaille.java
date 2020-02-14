package fr.umontpellier.iut;

import java.util.Scanner;

public class IBaille {
    public static void main(String[] args) {
        Scanner saisie = new Scanner(System.in);
        /*boolean quitter = false;
        double prix = 0, prixMax = 0;*/

        Produit banane = new Produit(1,"Une banane",10);

        Compte compte1 = new Compte("Philippe", "phiphi@gmail.com","12 rue de la chouette",0);
        Compte compte2 = new Compte("Inosuke", "inosuke@gmail.com","3 rue du sanglier",0);
        Compte compte3 = new Compte("Michel", "michel@gmail.com","50 rue de l'impasse",0);

        compte1.crediter(1000);
        compte2.crediter(2500);
        compte3.crediter(1500);

        banane.demarrerEnchere(10);
        banane.setPasEnchere(1);

        System.out.println(banane);

        banane.ajouterOffre(compte1.creerOffre(banane,12,200));
        System.out.println(banane);
        System.out.println(banane.getGagnant());
        banane.ajouterOffre(compte2.creerOffre(banane,15,1000));
        System.out.println(banane);
        System.out.println(banane.getGagnant());
        banane.ajouterOffre(compte3.creerOffre(banane,24,350));
        System.out.println(banane);
        System.out.println(banane.getGagnant());

        //a voir si je peux le mettre a la fin !!
        /*while(!quitter) {
            System.out.println("Voir l'offre : tappez 1");
            System.out.println("Proposer une offre : tappez 2");
            System.out.println("Quitter : tappez 0");
            int choixClient = saisie.nextInt();

            if(choixClient == 1){
                System.out.println(banane);
            }else if(choixClient == 2){
                System.out.println("Veulliez rentrer votre pseudo : ");
                String pseudoCompte = saisie.next();
                if(pseudoCompte == compte1.getPseudo()) {
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    compte1.creerOffre(banane,prix,prixMax);
                }else if(pseudoCompte == compte2.getPseudo()){
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    compte2.creerOffre(banane,prix,prixMax);
                }else if(pseudoCompte == compte3.getPseudo()){
                    System.out.println("Veulliez rentrer un prix : ");
                    prix = saisie.nextDouble();
                    System.out.println("Veulliez rentrer votre prix max : ");
                    prixMax = saisie.nextDouble();
                    compte3.creerOffre(banane,prix,prixMax);
                }else{
                    System.out.println("Pseudo erroné !");
                }
            }else if(choixClient == 0){
                System.out.println("Au revoir");
                quitter = true;
            }
        }*/
    }
}
