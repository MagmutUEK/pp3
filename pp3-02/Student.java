public class Student
{
    String name;
    int age;
    String idCard;
    boolean validId;
    int semester;
    double averageGrade;
    
    void sayHello(){
        System.out.println("Hello");
    }
    
    void displayName(){
        System.out.println(name);
    }
    
    void displayAge(){
        System.out.println(age);
    }
    
    void changeIdStatus(){
        validId = !validId;
    }
    
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID card number: " + idCard);
        System.out.println("ID card valid: " + validId);
    }
}
