package az.coders.chapter1.practice3;


import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;

abstract class Employer {
    private String name;

    public Employer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getJobTitle();
}

class Manager extends Employer {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    }
}

class Developer extends Employer {
    public Developer(String name) {
        super(name);
    }

    @Override
    public String getJobTitle() {
        return "Developer";
    }
}

class Tester extends Employer {
    public Tester(String name) {
        super(name);
    }

    @Override
    public String getJobTitle() {
        return "Tester";
    }
}

class Salesperson extends Employer {
    public Salesperson(String name) {
        super(name);
    }

    @Override
    public String getJobTitle() {
        return "Salesperson";
    }
}

public class SecondProblem {
    public static void main(String[] args) {
        List<Employer> employers = new ArrayList<>();

        employers.add(new Manager("John Smith"));
        employers.add(new Developer("Alice Johnson"));
        employers.add(new Tester("Michael Brown"));
        employers.add(new Salesperson("Emily Davis"));

        Collections.sort(employers, Comparator.comparing(Employer::getName));

        for (Employer employer : employers) {
            System.out.println("Name: " + employer.getName() + ", Job Title: " + employer.getJobTitle());
        }
    }
}
