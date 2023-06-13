package az.coders.chapter1.lesson19;

import java.io.*;

public class FirstProblem {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson19\\test");

        try (var a =new BufferedReader( new FileReader(file))) {
            String chr ;
            while (null !=(chr=a.readLine())) {
                System.out.print(chr);
            }
        }
    }}

