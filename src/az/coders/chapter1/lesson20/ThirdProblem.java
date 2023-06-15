package az.coders.chapter1.lesson20;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ThirdProblem {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson20\\Users");
        //adding users
        try (var a = new BufferedWriter(new FileWriter(file))) {
            a.write("nihat@gmail.com nihatnihat\n");
            a.write("murad@gmail.com muradmurad\n");
            a.write("ismayil@gmail.com ismayilismayil\n");
            a.write("valeh@gmail.com valehvaleh\n");

        }catch (IOException e) {
            throw new RuntimeException(e);
        }


        String gmailForTest = "nihat@gmail.com";
        String gmailForTest1 = "sanan@gmail.com";
        //registration part
        try (Stream<String > lines = Files.lines(Paths.get(file.getPath()))){

            boolean found = lines.anyMatch(line -> line.contains(gmailForTest));

            if(found){
                System.out.println("Success for "+gmailForTest);
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
