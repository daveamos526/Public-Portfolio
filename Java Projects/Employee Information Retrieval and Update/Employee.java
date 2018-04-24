//Employee - Newly created superclass that factors out common attributes and behaviors that are common to all employees
//David Amos
//References - 
//https://docs.oracle.com/javase/tutorial/java/IandI/super.html
//http://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java

public class Employee 
{
    //common attributes and behaviors - 1.) Create instance variables for Employee
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    //common attributes and behaviors - 2.) Create constructor for Employee
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    //common attributes and behaviors - 3.) Return instance variables
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    //Include annotation to override method
    @Override
    
    //Include toString
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s", "Commission Employee", firstName,
                lastName, "Social Security Number", socialSecurityNumber);
    }
} //end Employee class

