// Moteur.java
public class Moteur {
    private String nom;
    private int puissance;
    private int kilometrage;

    // Constructeur
    public Moteur(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
        this.kilometrage = 0;
    }

    // Getter pour la puissance
    public int getPuissance() {
        return puissance;
    }

    // Méthode pour changer le moteur
    public void changerLeMoteur(Moteur nouveauMoteur) {
        this.nom = nouveauMoteur.nom;
        this.puissance = nouveauMoteur.puissance;
        this.kilometrage = 0;
    }

    // Méthode pour obtenir la durée de vie restante
    public int dureeDeVieRestante() {
        return Math.max(0, 300000 - kilometrage);
    }

    // Autres méthodes...
}
