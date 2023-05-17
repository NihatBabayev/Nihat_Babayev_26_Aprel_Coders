package az.coders.chapter1.lesson8.forAbstract;

public class Main {
    public static void main(String[] args) {
        Kvadrat kv = new Kvadrat(5);
        System.out.println(kv.getPerimeter());
        System.out.println(kv.getSahe());
        DuzbucaqliUcbucaq db = new DuzbucaqliUcbucaq(4,3);
        System.out.println(db.getPerimeter());
        System.out.println(db.getSahe());
    }
}
