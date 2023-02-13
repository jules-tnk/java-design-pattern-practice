package ma.ac.emi.exoexam2.graphicform;

public class Ligne extends GraphicForm{

    public Ligne(double x, double y) {
        super(x, y);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessin ligne....");
    }
}
