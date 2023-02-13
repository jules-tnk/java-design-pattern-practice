package ma.ac.emi.gof.structure.adapter.controller;

public class KeyboardController implements Controller {

    private Keyboard keyboard;

    // SETTER
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    // CONSTRUCTORS
    public KeyboardController(Keyboard keyboard){
        setKeyboard(keyboard);
    }

    // METHODS
    @Override
    public boolean isLeft() {
        if (keyboard.keyPressed() == Key.ARROW_LEFT){
            return true;
        }
        return false;
    }

    @Override
    public boolean isRight() {
        if (keyboard.keyPressed() == Key.ARROW_RIGHT){
            return true;
        }
        return false;
    }

    @Override
    public boolean isPush() {
        if (keyboard.keyPressed() == Key.SPACEBAR){
            return true;
        }
        return false;
    }
}
