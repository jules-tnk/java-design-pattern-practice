package ma.ac.emi.gof.composite;

import java.util.EnumSet;

public class Test {
    public static void main(String[] args) {
        //create main folder
        Folder mainFolder = new Folder("Racine", EnumSet.of(Permission.X, Permission.R));

        // add files to main folder
        mainFolder.addElement(new File("File 1", 200, EnumSet.of(Permission.W)));
        mainFolder.addElement(new File("File 2", 150, EnumSet.of(Permission.X)));
        mainFolder.addElement(new File("File 3", 500, EnumSet.of(Permission.X)));

        // sub folder 1
        Folder subFolder1 = new Folder("Sous dossier1", EnumSet.of(Permission.R));
        subFolder1.addElement(new File("img.jpg", 200, EnumSet.of(Permission.W)));
        subFolder1.addElement(new File("File b", 150, EnumSet.of(Permission.X)));

        // sub sub folder 1
        Folder subSubFolder1 = new Folder("dossier1", EnumSet.of(Permission.R));
        subSubFolder1.addElement(new File("File a5", 200, EnumSet.of(Permission.W, Permission.X)));
        subSubFolder1.addElement(new File("File b2", 150, EnumSet.of(Permission.W, Permission.X)));

        // add sub sub folder1 to sub folder 1
        subFolder1.addElement(subSubFolder1);

        // sub folder 2
        Folder subFolder2 = new Folder("Sous dossier2", EnumSet.of(Permission.R, Permission.X));
        subFolder2.addElement(new File("File a2", 200, EnumSet.of(Permission.W)));
        subFolder2.addElement(new File("File b2", 150, EnumSet.of(Permission.R, Permission.W)));

        // add sub folders to main folder
        mainFolder.addElement(subFolder1);
        mainFolder.addElement(subFolder2);

        // add files to main folder again
        mainFolder.addElement(new File("File X", 150, EnumSet.of(Permission.X)));
        mainFolder.addElement(new File("File G", 500, EnumSet.of(Permission.X)));

        // show mainfolder
        mainFolder.ls();
    }
}
