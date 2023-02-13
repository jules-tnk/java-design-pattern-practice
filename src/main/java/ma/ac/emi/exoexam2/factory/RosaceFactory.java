package ma.ac.emi.exoexam2.factory;

import ma.ac.emi.exoexam2.graphicform.IGraphicForm;
import ma.ac.emi.exoexam2.graphicform.Rosace;

public class RosaceFactory extends GraphicFromFactory{

    private static RosaceFactory instance=null;

    public RosaceFactory() {}

    public static RosaceFactory getInstance(){
        if(instance==null){
            instance = new RosaceFactory();
        }
        return instance;
    }
    @Override
    protected IGraphicForm fabricateGraphicForm(double x, double y) {
        return new Rosace(x, y);
    }
}
