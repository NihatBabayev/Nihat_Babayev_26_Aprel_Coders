package az.coders.chapter1.practice4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class ThirdProblem {
    @WholeNumberAnnotation
    int a ;
    int b;

    public static void main(String[] args) throws IllegalAccessException {
        ThirdProblem myClass = new ThirdProblem();
        myClass.a = 3;
        Class cls = myClass.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field:
            fields ) {
            if(field.isAnnotationPresent(WholeNumberAnnotation.class)){
                field.setAccessible(true);
                try {
                    Object fieldValue = field.get(myClass);

                    if (fieldValue instanceof Number) {
                        Number numberValue = (Number) fieldValue;
                        if (numberValue.doubleValue() % 1 != 0) {
                            System.out.println("Number is not a whole number");
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface WholeNumberAnnotation{

}