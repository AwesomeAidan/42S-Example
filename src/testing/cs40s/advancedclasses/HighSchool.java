/** Required package class namespace */
package testing.cs40s.advancedclasses;

 
/**
 * HighSchool.java - represents a high school student person. Before creating
 * this class we altered the NetBeans template (Tools - Templates) for a 
 * Java class so that the toString(), clone(), and equals() methods are now 
 * always part of any new class we create (whether or not we choose to over-ride
 * those methods).
 *
 * @author Mr. Wachs
 * @since Feb. 9, 2022, 8:01:03 a.m.
 */
public class HighSchool extends Student
{

    /**
     * Default constructor, set class properties
     */
    public HighSchool() {
        super("Smelly Teenager",15);        // Calling the super constructor
    }
    
    /**
     * Constructor that sets the class properties to the parameters
     * 
     * @param name the name of this HighSchool Student Person
     */
    public HighSchool(String name) {
        super(name,15);
    }
     
    /**
     * String representation of this object
     *
     * @return The object represented as a String
     */
    @Override
    public String toString() {
        return "HighSchool: " + super.toString();
    }
   
    /**
     * Deep comparison, determines if two objects are "equal" in this context
     *
     * @param object the object to compare to
     * @return the objects are "equal" (true) or not (false)
     */
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }
       
    /**
     * a Deep clone, creates a duplicate object using new memory
     *
     * @return a "clone" of the object using new memory
     */
    @Override
    public HighSchool clone() {
        return this;
    }
    
}