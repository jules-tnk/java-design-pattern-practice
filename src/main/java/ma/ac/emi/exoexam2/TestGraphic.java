package ma.ac.emi.exoexam2;

import ma.ac.emi.exoexam2.factory.LigneFactory;
import ma.ac.emi.exoexam2.factory.RectangleFactory;
import ma.ac.emi.exoexam2.factory.RosaceFactory;
import ma.ac.emi.exoexam2.graphicform.Rectangle;
import ma.ac.emi.exoexam2.graphicform.Rosace;

public class TestGraphic {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.setGraphicFromFactory(LigneFactory.getInstance());
        graphicEditor.addForm(52, 5);
        graphicEditor.addForm(52, 96);

        graphicEditor.setGraphicFromFactory(RectangleFactory.getInstance());
        graphicEditor.addForm(52, 5);
        graphicEditor.addForm(52, 96);

        graphicEditor.setGraphicFromFactory(RosaceFactory.getInstance());
        graphicEditor.addForm(52, 5);
        graphicEditor.addForm(52, 96);

        graphicEditor.drawAllForms();

    }
}
