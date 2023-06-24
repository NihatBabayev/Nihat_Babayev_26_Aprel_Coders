package az.coders.chapter1.practice4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecondProblem {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\practice4\\test");
        System.out.println(SecondProblem.changeExtension(file, "asm"));

    }
    public static File changeExtension(File f, String newExtension) {

        int i = f.getName().length() ;
        String name = f.getName().substring(0,i);
        return new File(f.getParent(), name + "."+newExtension);
    }





}
