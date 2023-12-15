
public class Roue {
    private int largeur;
    private int diametreJante;

    // Constructeur par défaut
    public Roue() {
        // Initialiser les valeurs par défaut ou laisser vide, selon vos besoins
        this.largeur = 0;
        this.diametreJante = 0;
    }

    // Constructeur avec paramètres
    public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }

    // Méthodes getters et setters
    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getDiametreJante() {
        return diametreJante;
    }

    public void setDiametreJante(int diametreJante) {
        this.diametreJante = diametreJante;
    }

}
