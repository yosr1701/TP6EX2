package TP6EX2;

public class Agence {
    private Voiture[] voitures;
    private int nbrV;

    public Agence(int capacite) {
        this.voitures = new Voiture[capacite];
        this.nbrV = 0;
    }

    public void ajout(Voiture v) {
        if (nbrV < voitures.length) {
            voitures[nbrV] = v;
            nbrV++;
        }
    }

    public void afficheSelection(Critere c) {
        for (int i = 0; i < nbrV; i++) {
            if (c.estSatisfaitPar(voitures[i])) {
                System.out.println(voitures[i]);
            }
        }
    }
}

