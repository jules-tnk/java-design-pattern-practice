package ma.ac.emi.exoexam2.factory;

import ma.ac.emi.exoexam2.graphicform.IGraphicForm;
import ma.ac.emi.exoexam2.graphicform.Rectangle;

public class RectangleFactory extends GraphicFromFactory{

    private static RectangleFactory instance=null;

    public RectangleFactory() {}

    public static RectangleFactory getInstance(){
        if(instance==null){
            instance = new RectangleFactory();
        }
        return instance;
    }

    @Override
    protected IGraphicForm fabricateGraphicForm(double x, double y) {
        return new Rectangle(x, y);
    }
}
