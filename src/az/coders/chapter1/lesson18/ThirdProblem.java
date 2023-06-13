package az.coders.chapter1.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ThirdProblem {
    @NotNull
    int first;
    public static void main(String[] args) {

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotNull{

}