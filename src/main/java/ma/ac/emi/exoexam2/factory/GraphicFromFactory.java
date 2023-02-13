package ma.ac.emi.exoexam2.factory;

import ma.ac.emi.exoexam2.graphicform.IGraphicForm;

public abstract class GraphicFromFactory {
    public IGraphicForm createGraphicFrom(double x, double y){
        return fabricateGraphicForm(x, y);
    }

    protected abstract IGraphicForm fabricateGraphicForm(double x, double y);

}
