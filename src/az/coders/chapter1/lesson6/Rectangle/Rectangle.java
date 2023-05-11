package az.coders.chapter1.lesson6.Rectangle;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double sideLength){
        this(sideLength, sideLength);
    }

}
