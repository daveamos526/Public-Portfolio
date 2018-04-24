//CommissionEmployee - Rewritten as a subclass of Employee
//David Amos
//References - 
//https://docs.oracle.com/javase/tutorial/java/IandI/super.html
//http://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java

//ComissionEmployee subclass extends from Employee superclass
public class CommissionEmployee extends Employee
{    
   //Include instance variables not declared in Employee superclass - 1.) Delete firstName, lastName, and socialSecurity
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
       //Call superclass - 2.) Call Employee constructor
       super(firstName,lastName,socialSecurityNumber);
       
      // implicit call to Object constructor occurs here

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString()
   {
      //Call the superclass - 3.) Delete instance variables declared in superclass
      return super.toString()+String.format("%n%s: %.2f%n%s: %.2f","gross sales", getGrossSales(), "commission rate", getCommissionRate());
   } 
} // end class CommissionEmployee

