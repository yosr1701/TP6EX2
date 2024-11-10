package TP6EX2;

public class CritereMarque implements Critere {
    private String modele;

    public CritereMarque(String modele) {
        this.modele = modele;
    }

   
    public boolean estSatisfaitPar(Voiture v) {
        return v.getModele().equalsIgnoreCase(modele);
    }
}
