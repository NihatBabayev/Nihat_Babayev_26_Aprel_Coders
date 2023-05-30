package az.coders.chapter1.lesson13;

public class PairProblem<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public PairProblem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> newPair = new PairProblem<>(1,"Nihat");
        System.out.println(newPair.getKey()+" is key");
        System.out.println(newPair.getValue()+" is value");

    }

}
interface Pair<K,V>{
    K getKey();
    V getValue();


}