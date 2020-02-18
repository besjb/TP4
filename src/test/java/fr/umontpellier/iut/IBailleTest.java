package fr.umontpellier.iut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class IBailleTest {
    private Compte c1,c2,c3;
    private Produit p;

    @BeforeEach
    public void init(){
        p = new Produit(1,"Produit",10);

        c1 = new Compte("c1","emailC1","adreC1",0);
        c2 = new Compte("c2","emailC2","adreC2",0);
        c3 = new Compte("c3","emailC3","adreC3",0);

        c1.crediter(1000);
        c2.crediter(2500);
        c3.crediter(1500);

        p.demarrerEnchere(10);
        p.setPasEnchere(1);
    }
    //@Disabled
    @Test
    public void test_gagnant_c2() {
        p.ajouterOffre(c1.creerOffre(p,12,100));
        p.ajouterOffre(c2.creerOffre(p,15,200));
        assertEquals(c2.getListeOffre(0),p.getGagnant());
    }

    @Test
    public void test_gagnant_c2_avec_3_participants() {
        p.ajouterOffre(c1.creerOffre(p,12,100));
        p.ajouterOffre(c2.creerOffre(p,15,200));
        p.ajouterOffre(c3.creerOffre(p,25,140));
        assertEquals(c2.getListeOffre(0),p.getGagnant());
    }
}