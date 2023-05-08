package az.coders.chapter1.lesson4;



public class CharactersInString {

    public static void main(String[] args) {

        char[] charArray = "Salammamaannna".toCharArray();
        int[] intArray = new int[charArray.length];
        int[] numbers = new int[intArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {
            numbers[i]++;
            for (int j = i + 1; j < intArray.length; j++) {
                if(intArray[i] == intArray[j]){
                    intArray[j] = 0;
                    numbers[i]++;

                }
            }
        }


        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]!=0){
                System.out.print((char)intArray[i]+": ");
                System.out.println(numbers[i]);
            }

        }
    }
}
