package az.coders.chapter1.lesson8.forAbstract;

public class Kvadrat extends Forma {
    int teref;

    public Kvadrat(int teref) {
        this.teref = teref;
    }

    @Override
    int getPerimeter() {
        return teref*4;
    }

    @Override
    int getSahe() {
        return teref*teref;
    }
}
