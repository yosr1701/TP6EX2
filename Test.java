package TP6EX2;

public class Test {
    public static void main(String[] args) {
        Agence agence = new Agence(5);

        
        agence.ajout(new Voiture("Renault", "Clio", 2018, 90));
        agence.ajout(new Voiture("Toyota", "Yaris", 2020, 110));
        agence.ajout(new Voiture("Peugeot", "208", 2019, 80));
        agence.ajout(new Voiture("Renault", "Megane", 2021, 130));
        agence.ajout(new Voiture("Renault", "Clio", 2022, 95));

     
        System.out.println("Voitures dont le prix est inférieur à 100€ :");
        agence.afficheSelection(new CriterePrix(100));

        
        System.out.println("\nVoitures de modèle 'Clio' :");
        agence.afficheSelection(new CritereMarque("Clio"));
    }
}
