package ma.ac.emi.exoexam2;

import ma.ac.emi.exoexam2.factory.GraphicFromFactory;
import ma.ac.emi.exoexam2.graphicform.IGraphicForm;

import java.util.ArrayList;
import java.util.List;

public class GraphicEditor {

    private GraphicFromFactory graphicFromFactory;

    public GraphicFromFactory getGraphicFromFactory() {
        return graphicFromFactory;
    }

    public void setGraphicFromFactory(GraphicFromFactory graphicFromFactory) {
        this.graphicFromFactory = graphicFromFactory;
    }

    private List<IGraphicForm> graphicForms = new ArrayList<IGraphicForm>();

    public List<IGraphicForm> getGraphicForms() {
        return graphicForms;
    }

    public void addForm(double x, double y){
        IGraphicForm newForm = graphicFromFactory.createGraphicFrom(x, y);
        getGraphicForms().add(newForm);
    }

    public void drawAllForms(){
        for (IGraphicForm graphicForm: getGraphicForms()) {
            graphicForm.dessiner();
        }
    }




}
