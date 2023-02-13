package ma.ac.emi.exoexam2.factory;

import ma.ac.emi.exoexam2.graphicform.IGraphicForm;
import ma.ac.emi.exoexam2.graphicform.Ligne;

public class LigneFactory extends GraphicFromFactory{

    private static LigneFactory instance=null;

    public LigneFactory() {}

    public static LigneFactory getInstance(){
        if(instance==null){
            instance = new LigneFactory();
        }
        return instance;
    }

    @Override
    protected IGraphicForm fabricateGraphicForm(double x, double y) {
        return new Ligne(x, y);
    }
}
