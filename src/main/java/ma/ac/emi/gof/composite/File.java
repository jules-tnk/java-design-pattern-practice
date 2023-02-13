package ma.ac.emi.gof.composite;

import java.util.EnumSet;

public class File extends DirectoryElement {
    // CONSTRUCTORS
    public File(String name, double size, EnumSet<Permission> permissions) {
        super(name, size, permissions);
    }

    // METHODS
    @Override
    public void ls() {
        System.out.print(getName()+" "+getPermissions()+ " "+ getSize() + "Ko"  +"\n");
    }

    @Override
    public void ls(int depth) {
        printTab(depth);
        ls();
    }

    @Override
    public void addElement(DirectoryElement directoryElement) {
        throw new RuntimeException("Forbidden operation on file");
    }
}
