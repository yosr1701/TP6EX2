package TP6EX2;

public class Voiture {
    private String marque;
    private String modele;
    private int anneeProduction;
    private int prixLocation;

    public Voiture(String marque, String modele, int anneeProduction, int prixLocation) {
        this.marque = marque;
        this.modele = modele;
        this.anneeProduction = anneeProduction;
        this.prixLocation = prixLocation;
    }

    public String getMarque() {
        return marque;
    }
    
    public String getModele() {
        return modele;
    }

    public int getPrixLocation() {
        return prixLocation;
    }

   
    public String toString() {
        return "Marque: " + marque + ", Modèle: " + modele + ", Prix: " + prixLocation + " DT";
    }
}
