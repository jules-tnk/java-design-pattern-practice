package ma.ac.emi.exoexam2.graphicform;

public abstract class GraphicForm implements IGraphicForm{
    private double x, y;

    //GETTERS
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //SETTERS
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //CONSTRUCTOR
    public GraphicForm(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //METHODS

    @Override
    public void dessiner(){
        throw new RuntimeException("Opération impossible");
    }
}
