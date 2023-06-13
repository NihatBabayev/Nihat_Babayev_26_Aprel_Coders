package az.coders.chapter1.lesson18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class A {
    private String aaa;

    private A(String aaa) {
        this.aaa = aaa;
    }

    @Override
    public String toString() {
        return "My argument is: " + aaa;
    }

}
 class B {
    public static void main(final String[] args) throws Exception {

        Constructor<A> constructor= (Constructor<A>) A.class.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        A obj = constructor.newInstance("foo");
        System.out.println(obj);

    }
}