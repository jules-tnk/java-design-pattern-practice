package ma.ac.emi.gof.structure.adapter;

import ma.ac.emi.gof.structure.adapter.controller.Controller;

public class VideoGame {
    private Controller controller;

    // SETTERS
    public void setController(Controller controller) {
        this.controller = controller;
    }

    // CONSTRUCTORS
    public VideoGame(Controller controller) {
        setController(controller);
    }

    private void loopGame(){}
}
