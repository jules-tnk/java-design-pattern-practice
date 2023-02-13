package ma.ac.emi.gof.composite;

import java.util.EnumSet;

public abstract class DirectoryElement {
    private String name;
    private double size;

    private EnumSet<Permission> permissions;

    // GETTERS
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public EnumSet<Permission> getPermissions(){
        return permissions;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // CONSTRUCTORS
    public DirectoryElement(String name, double size, EnumSet<Permission> permissions) {
        this.name = name;
        this.size = size;
        this.permissions = permissions;
    }

    public DirectoryElement(String name, EnumSet<Permission> permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    // METHODS
    public abstract void ls();
    public abstract void ls(int depth);

    public abstract void addElement(DirectoryElement directoryElement);
    public void printTab(int tabNumber){
        System.out.print("\t".repeat(tabNumber));
        System.out.print("|____");
    }

}
