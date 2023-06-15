package az.coders.chapter1.lesson20;


// Java code for serialization and deserialization
// of a Java object
import java.io.*;

class User implements java.io.Serializable
{
    public String name;


    // Default constructor
    public User(String name)
    {
        this.name = name;
    }

}
class Student implements Serializable{
    public String name;
    public Student(String name){
        this.name = name;
    }
}
public class FourthProblem
{
    public static void main(String[] args)
    {
        User object = new User( "Nihat");
        Student object1  = new Student("Nihat");
        File file = new File("C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson20\\file.ser");


        // Serialization
        try(var out = new ObjectOutputStream(new FileOutputStream(file)))
        {

            // Method for serialization of object
            out.writeObject(object);


            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        Demo object1 = null;

        // Deserialization
        try(var in = new ObjectInputStream(new FileInputStream(file)))
        {


            // Method for deserialization of object
            object1 = (Demo)in.readObject();

            System.out.println("Object has been deserialized ");

            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
