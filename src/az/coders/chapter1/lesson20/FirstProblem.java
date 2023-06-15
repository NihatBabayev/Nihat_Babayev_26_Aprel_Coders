package az.coders.chapter1.lesson20;

import java.io.*;
import java.nio.file.Files;

public class FirstProblem {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson20\\first");
        try(var a = new BufferedWriter( new FileWriter(file))) {

            for (int i = 0; i < 10; i++) {
                a.write("Coders Azerbaijan 2023\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(var b = new BufferedReader(new FileReader(file))){
            String  chr;
            int lineNumber = 0;
            while ((chr = b.readLine())!= null){

                    lineNumber++;
            }

            System.out.println("Number of lines is "+lineNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
