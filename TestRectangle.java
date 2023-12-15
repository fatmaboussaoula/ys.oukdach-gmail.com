public class TestRectangle {
    public static void main(String[] args) {
        // Créer un rectangle avec le constructeur par défaut
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : ");
        rectangle1.afficher();
        System.out.println("Surface du rectangle 1 : " + rectangle1.surface());

        // Créer un rectangle avec le constructeur paramétré
        Point coinHautGauche = new Point(1, 4);
        Point coinBasDroite = new Point(5, 1);
        Rectangle rectangle2 = new Rectangle(coinHautGauche, coinBasDroite);
        System.out.println("\nRectangle 2 : ");
        rectangle2.afficher();
        System.out.println("Surface du rectangle 2 : " + rectangle2.surface());

        // Zoom sur le rectangle 2
        rectangle2.zoom(2, 2);
        System.out.println("\nRectangle 2 après zoom : ");
        rectangle2.afficher();
        System.out.println("Surface du rectangle 2 après zoom : " + rectangle2.surface());
    }
}
