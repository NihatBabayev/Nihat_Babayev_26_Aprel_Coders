package az.coders.chapter1.lesson8.forAbstract;

public class DuzbucaqliUcbucaq extends Forma {
    double hundurluk;
    double oturacaq;

    public DuzbucaqliUcbucaq(double hundurluk, double oturacaq) {
        this.hundurluk = hundurluk;
        this.oturacaq = oturacaq;
    }

    @Override
    int getPerimeter() {
        return (int)(hundurluk+oturacaq + Math.sqrt(hundurluk*hundurluk +oturacaq*oturacaq));
    }

    @Override
    int getSahe() {
        return (int) (hundurluk*oturacaq/2);
    }
}
