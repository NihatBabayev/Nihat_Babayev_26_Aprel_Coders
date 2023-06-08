package az.coders.chapter1.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FirstProblem {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nihat","Babayev",18));
        studentList.add(new Student("Murad","Baghirli",19));
        studentList.add(new Student("Ismayil","Abdullazada",18));
        studentList.add(new Student("Valeh","Ismayilov",17));

        Optional<Student> max;
        max = studentList
                .stream()
                .max((a, b) -> a.age - b.age );
        System.out.println(max);
    }
}
class Student{
    String name;
    String surname;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}