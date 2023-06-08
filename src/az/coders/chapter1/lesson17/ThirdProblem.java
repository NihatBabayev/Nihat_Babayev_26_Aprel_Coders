package az.coders.chapter1.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdProblem {
    public static void main(String[] args) {
        List<Student1> student1List = new ArrayList<>();
        student1List.add(new Student1("Nihat","Babayev",18,"Backend"));
        student1List.add(new Student1("Murad","Baghirli",19,"Frontend"));
        student1List.add(new Student1("Ismayil","Abdullazada",18,"Business Analytics"));
        student1List.add(new Student1("Valeh","Ismayilov",17,"Backend"));

        Map<String, List<Student1>> map = student1List.stream().collect(
                Collectors.groupingBy(Student1::getGroupName));
        System.out.println(map);

    }
}
class Student1{
    String name;
    String surname;
    int age;
    String groupName;

    public Student1(String name, String surname, int age, String groupName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}