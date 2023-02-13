package ma.ac.emi.exoexam2.graphicform;

public class Rosace extends GraphicForm {
    private RosaceBlackBox rosaceBlackBox = new RosaceBlackBox();

    public Rosace(double x, double y) {
        super(x, y);
    }

    public void dessiner(){
        int addresseRosaceEnMemoire = rosaceBlackBox.getRosace();
        dessinerRosace(addresseRosaceEnMemoire);
    }

    public void dessinerRosace(int addresseRosaceEnMemoire){
        System.out.println("Récupération du rosace en mémoire....");
        System.out.println("Dessin du rosace....");
    }
}
