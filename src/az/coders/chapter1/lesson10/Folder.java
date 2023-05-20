package az.coders.chapter1.lesson10;

import java.util.Arrays;

public class Folder {
    String name;
    Folder subFolder;

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subFolder=" + subFolder +
                '}';
    }
}
class Main{


    static Folder pathToFolder(Folder folder,String[] pathAsArray, int i){
//        if(i == 0){
//             folder.name = pathAsArray[0];
//
//        }

        if(i < pathAsArray.length) {
            folder.name = pathAsArray[i];
            folder.subFolder = new Folder();
            return pathToFolder(folder.subFolder, pathAsArray, i + 1);
        }
        return folder;
    }

    public static void main(String[] args) {
        Folder newFolder = new Folder();
        String path = "baba/ata/ogul/neve";
        String[] pathAsArray = path.split("/");
        pathToFolder(newFolder, pathAsArray, 0);
//        System.out.println(newFolder.name+" "+newFolder.subFolder.name+" "+newFolder.subFolder.subFolder.name+" "
//                + newFolder.subFolder.subFolder.subFolder.name);
        System.out.println(newFolder.toString());
    }
}

