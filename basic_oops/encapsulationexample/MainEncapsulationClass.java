package basic_oops.encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher();
        //teacher1.name="Deepika";  this won't work in encapsulation

        //using Setters to assign the values
        teacher1.setId(123);
        teacher1.setName("Deepika");
        teacher1.setGender("Female");
        teacher1.setSalary(3500.00);
        teacher1.setQualification(("Msc"));

        System.out.println(teacher1);

        //use getters to read the data
        System.out.println(teacher1.getName());
    }
}
