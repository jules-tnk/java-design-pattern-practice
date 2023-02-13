package ma.ac.emi.gof.structure.adapter.controller;

public class WirelessController implements Controller {
    @Override
    public boolean isLeft() {
        return true;
    }

    @Override
    public boolean isRight() {
        return true;
    }

    @Override
    public boolean isPush() {
        return true;
    }
}
