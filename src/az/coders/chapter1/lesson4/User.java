package az.coders.chapter1.lesson4;

public class User {
    private String name;
    private String surname;
    private int age;

    public String getName() {

        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }



    public void setName(String name) {
        if(checkSymbols(name) && name.length() >= 3){
            this.name = name;
        }


    }

    public void setSurname(String surname) {
        if(checkSymbols(surname) && surname.length() >= 3){
            this.surname = surname;
        }
    }

    public void setAge(int age) {
        if( age >= 18 && age <= 100){
            this.age = age;
        }

    }
    
    public static boolean  checkSymbols(String checkingVariable){
        char[] charArray = checkingVariable.toCharArray();
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {

            if( !(65 <=  intArray[i] &&  intArray[i] <= 90) &&
                    !(97 <= intArray[i] &&  intArray[i] <= 122)  ){

                return false;
            }
        }
        return  true;
    }
    

    public static void main(String[] args) {
        User niko = new User();
        niko.setName("Nihat");
        niko.setSurname("Babayev");
        niko.setAge(18);

        System.out.println(niko.getName());
        System.out.println(niko.getSurname());
        System.out.println(niko.getAge());


    }
}
