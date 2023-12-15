// TestVoiture.java
public class TestVoiture {
    public static void main(String[] args) {
        // Créer un moteur
        Moteur moteurInitial = new Moteur("V6", 200);

        // Créer des roues (à ajuster selon votre implémentation de la classe Roue)
        Roue[] roues = new Roue[4];
        for (int i = 0; i < 4; i++) {
            roues[i] = new Roue();
        }

        // Créer une voiture avec le moteur et les roues
        Voiture maVoiture = new Voiture("Toyota", "Camry", 120, moteurInitial, roues);

        // Tester les méthodes
        System.out.println("Puissance du moteur : " + maVoiture.deQuellePuissance());

        // Changer le moteur
        Moteur nouveauMoteur = new Moteur("V8", 300);
        maVoiture.changerLeMoteur(nouveauMoteur);

        // Tester à nouveau la puissance
        System.out.println("Nouvelle puissance du moteur : " + maVoiture.deQuellePuissance());

        // Afficher la durée de vie restante du moteur
        System.out.println("Durée de vie restante du moteur : " + maVoiture.dureeDeVieRestanteDuMoteur());
    }
}
