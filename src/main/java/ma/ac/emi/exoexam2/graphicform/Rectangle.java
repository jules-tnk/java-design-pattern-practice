package ma.ac.emi.exoexam2.graphicform;

public class Rectangle extends GraphicForm{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessin rectangle...");
    }
}
