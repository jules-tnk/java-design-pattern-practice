package ma.ac.emi.gof.composite;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Folder extends DirectoryElement {
    private Map<String, DirectoryElement> content = new HashMap<String, DirectoryElement>();

    // CONSTRUCTORS
    public Folder(String name, EnumSet<Permission> permissions) {
        super(name, permissions);
        setSize(1);
    }

    // METHODS
    @Override
    public void ls() {
        System.out.print(this.getName()+" d"+getPermissions()+ " "+ getSize() + "Ko"  +"\n");
        int depthOfSubElement = 1;
        // ls files
        for (DirectoryElement directoryElement : content.values()) {
            if (directoryElement instanceof File){
                directoryElement.ls(depthOfSubElement);
            }
        }
        // ls folders
        for (DirectoryElement directoryElement : content.values()) {
            if (directoryElement instanceof Folder){
                directoryElement.ls(depthOfSubElement);
            }
        }
    }

    @Override
    public void ls(int depth) {
        printTab(depth);
        System.out.print(this.getName() +" d"+getPermissions()+ " "+ getSize() + "Ko"  +"\n");
        int depthOfSubElement = depth + 1;
        // ls files
        for (DirectoryElement directoryElement : content.values()) {
            if (directoryElement instanceof File){
                directoryElement.ls(depthOfSubElement);
            }
        }
        // ls folders
        for (DirectoryElement directoryElement : content.values()) {
            if (directoryElement instanceof Folder){
                directoryElement.ls(depthOfSubElement);
            }
        }
    }

    @Override
    public void addElement(DirectoryElement directoryElement) {
        content.put(directoryElement.getName(), directoryElement);
        setSize(this.getSize() + directoryElement.getSize());
    }
}
