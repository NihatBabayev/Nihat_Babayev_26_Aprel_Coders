package az.coders.chapter1.lesson20;

import java.io.*;


public class SecondProblem {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson20\\first");



        try(var b = new BufferedReader(new FileReader(file))){
            int  chr;
            int numberOfWords = 0;
            while ((chr = b.read()) != -1){
                if(chr == 10 || chr == 32){
                    numberOfWords++;
                }


            }
            System.out.println("Number of words is "+numberOfWords);


        }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
