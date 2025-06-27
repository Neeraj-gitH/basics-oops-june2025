package basic_oops.polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        performSum performSum = new performSum();
        performSum.sum(2,5);
        performSum.sum(2.0,5.0);

    }
}
