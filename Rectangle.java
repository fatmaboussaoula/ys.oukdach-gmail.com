public class Rectangle {
    private Point hg;  // le coin haut à gauche
    private Point bd;  // le coin bas à droite

    // Constructeur par défaut
    public Rectangle() {
        this(new Point(), new Point());
    }

    // Constructeur avec des paramètres
    public Rectangle(Point h, Point b) {
        this.hg = new Point(h);
        this.bd = new Point(b);
    }

    // Méthode pour afficher les coordonnées des coins
    public void afficher() {
        System.out.println("Rectangle: HG" + hg.toString() + ", BD" + bd.toString());
    }

    // Méthode pour calculer la surface
    public int surface() {
        return Math.abs((hg.getX() - bd.getX()) * (hg.getY() - bd.getY()));
    }

    // Méthode pour zoomer
    public void zoom(int deltax, int deltay) {
        hg.setX(hg.getX() - deltax);
        hg.setY(hg.getY() - deltay);
        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
    }

    // Méthodes Setters and Getters
    public Point getHg() {
        return hg;
    }

    public void setHg(Point hg) {
        this.hg = hg;
    }

    public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }
}
