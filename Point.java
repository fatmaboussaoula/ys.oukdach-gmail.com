import java.util.Objects;

public class Point {
    private int x;
    private int y;

    // Constructeur par défaut
    public Point() {
        // Initialiser un Point à l'origine en appelant le constructeur avec des paramètres
        this(0, 0);
    }

    // Constructeur avec des paramètres
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur avec un seul paramètre (initialisation de l’abscisse)
    public Point(int a) {
        // Option 1: Initialiser le paramètre à x et 0 à y
        // this.x = a;
        // this.y = 0;

        // Option 2: Utiliser le constructeur déjà défini
        this(a, 0);
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Méthode equals personnalisée comparant deux points par leurs coordonnées
    public boolean equals(Point a) {
        return this.x == a.x && this.y == a.y;
    }

    // Surcharge de la méthode equals pour la comparaison d'objets
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Point otherPoint = (Point) obj;

        return x == otherPoint.x && y == otherPoint.y;
    }

    // Surcharge de la méthode hashCode pour assurer la cohérence avec equals
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    // Surcharge de la méthode toString pour obtenir une représentation textuelle de l'objet
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
