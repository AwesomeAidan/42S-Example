
/** Required package class namespace */
package testing.cs30s;

 
/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since Feb. 9, 2022, 8:01:03 a.m.
 */
public class Student extends Person
{

    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    
    // private (encapsulated) property (global variable) identified (named)
    // "studentNumber" that is of type "integer"
    private int studentNumber;
    
    private double average;
    
    /**
     * Constructor for the class, sets the class properties (including the
     * properties it inherited form the super or parent class)
     * 
     * @param name the name for this student person
     * @param age the age for this student person
     * @param gender the gender for this student person
     * @param studentNumber the student number for this student
     */
    public Student(String name, int age, String gender, int studentNumber) {
        super.name = name;
        super.gender = gender;
        super.birthday(age);
        this.studentNumber = studentNumber;
        average = 0;
    }    
    
    /**
     * Studying raises the student's average
     */
    public void study() {
        average += 1.25;
    }
    
    /**
     * Slacking off lowers the student's average
     */
    public void slackOff() {
        average -= 0.33;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }
    
    /**
     * Talking overrides the same talk method of the parent class and outputs
     * additional information to the screen
     */
    @Override
    public void talk() {
        // Even with a class that inherits from another class, we 
        // can call the methods of the parent class
        super.talk();
        System.out.println("\t Number:  " + studentNumber);
        System.out.println("\t Average: " + average);        
    }
        
}