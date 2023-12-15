public class TestPoint {
    public static void main(String[] args) {
        // Déclarer deux objets de type Object, mais les instancier en tant que Point
        Object p = new Point(2, 5);
        Object q = new Point(2, 5);

        // Tester l'égalité en utilisant la méthode equals surchargée dans la classe Point
        boolean areEqual1 = p.equals(q);

        // Tester l'égalité en utilisant la méthode equals personnalisée dans la classe Point
        boolean areEqual2 = ((Point) p).equals((Point) q);

        // Afficher les résultats
        System.out.println("Les points p et q sont-ils égaux en utilisant la méthode equals surchargée ? " + areEqual1);
        System.out.println("Les points p et q sont-ils égaux en utilisant la méthode equals personnalisée ? " + areEqual2);

        // Créer une instance de Point en utilisant le constructeur par défaut
        Point pointP = new Point();
        pointP.setX(3);
        pointP.setY(4);

        // Afficher les coordonnées du point en utilisant les méthodes getX et getY
        System.out.println("Les coordonnées du point P sont :");
        System.out.println("x=" + pointP.getX());
        System.out.println("y=" + pointP.getY());

        // Utiliser Point p = new Point(); pour initialiser un objet Point à (0,0) par défaut
        Point defaultPoint = new Point();
        System.out.println("Coordonnées du point par défaut : (" + defaultPoint.getX() + ", " + defaultPoint.getY() + ")");

        // Utiliser Point q = new Point(5,2); pour initialiser un objet Point à (5,2)
        Point customPoint = new Point(5, 2);
        System.out.println("Coordonnées du point personnalisé : (" + customPoint.getX() + ", " + customPoint.getY() + ")");
    }
}
