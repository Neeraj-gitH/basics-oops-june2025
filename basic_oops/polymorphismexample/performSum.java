package basic_oops.polymorphismexample;

public class performSum {

    //method overloading/complie time polymrophism examp[les
    public void sum(int a, int b){
        System.out.println("Sum of two int numbers is : " +(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum of three int numbers is : " +(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("Sum of two float numbers is : " +(a+b));
    }

    public void sum(double a, double b){
        System.out.println("Sum of two double numbers is : " +(a+b));
    }
}
