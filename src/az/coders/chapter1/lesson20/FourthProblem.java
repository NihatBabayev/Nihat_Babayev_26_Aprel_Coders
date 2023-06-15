package az.coders.chapter1.lesson20;


// Java code for serialization and deserialization
// of a Java object
import java.io.*;

class User implements Serializable
{
    public String name;


    // Default constructor
    public User(String name)
    {
        this.name = name;
    }

}
class Student extends User implements Serializable{

    public Student(String name) {
        super(name);
    }
}
public class FourthProblem
{
    public static void main(String[] args)
    {
        User object = new User( "Nihat");
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



        // Deserialization
        try(var in = new ObjectInputStream(new FileInputStream(file)))
        {


            // Method for deserialization of object
            Student studentObject = (Student) in.readObject();

            System.out.println("Object has been deserialized ");

            System.out.println("a = " + studentObject.name);

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
