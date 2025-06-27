package basic_oops.classesandobjects;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello everyone welcome to spring classes!");

        //creating the objects
        Student student1= new Student();
        System.out.println("student1 before assigning the values: " +student1);

        //assign the values
        student1.id=101;
        student1.name="Ajay";
        student1.address="76/4 , dilaram chowk, dehradun";
        student1.grade="6th grade";
        student1.email="ajay12345@gmail.com";
        student1.dob="12/10/2012";
        System.out.println("student1 After assigning the values: " +student1);

        Demo d1= new Demo();
        d1.demo1();
        System.out.println("ABC VALUE IS : "+ d1.abc);

        Demo.demo2();
        System.out.println("PQR value is : "+ Demo.pqr);





    }
}
