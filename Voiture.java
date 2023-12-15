// Voiture.java
public class Voiture {
    private String marque;
    private String modele;
    private int vitesse;
    private Moteur moteur;
    private Roue[] roues;

    // Constructeur
    public Voiture(String marque, String modele, int vitesse, Moteur moteur, Roue[] roues) {
        this.marque = marque;
        this.modele = modele;
        this.vitesse = vitesse;
        this.moteur = moteur;
        this.roues = roues;
    }

    // Méthode pour obtenir la puissance du moteur
    public int deQuellePuissance() {
        return moteur.getPuissance();
    }

    // Méthode pour changer le moteur
    public void changerLeMoteur(Moteur nouveauMoteur) {
        moteur = nouveauMoteur;
    }

    // Méthode pour obtenir la durée de vie restante du moteur
    public int dureeDeVieRestanteDuMoteur() {
        return moteur.dureeDeVieRestante();
    }

    // Méthodes Setters and Getters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }

}
