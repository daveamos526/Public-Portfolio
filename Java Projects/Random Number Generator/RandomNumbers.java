//RandomNumbers.java - Calculates sum and floating average of 25 random integers
//between 1 and 100 then displays the results
//David Amos
//References - 
//https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
//http://beginnersbook.com/2014/06/java-iterator-with-examples/
//http://stackoverflow.com/questions/7961788/math-random-explained

//import wildcard
import java.util.*;

public class RandomNumbers 
{
    public static void main(String args[])
    {
        
        //Create LinkedList
        LinkedList <Integer> list = new LinkedList <Integer>();
       
        //Include iterator
        Iterator iterator;
        for(int i=0; i<25; i++)
        {
            //Specify numbers between 1-100
            list.add((int)(Math.random() * (100)));
            
            //Order the elements
            Collections.sort(list);
            
            //Demonstrate order as the elements are added
            System.out.printf("Sorted Elements: %s\n", list);
        }
        
        iterator = list.iterator();
        
        int sum = 0;
        
        //Calculate the sum of the random numbers
        while (iterator.hasNext())
            
        {
            sum = sum + (int)iterator.next();
        }
       
        //Print the sum and average of the elements
        System.out.println("\nThe sum of elements = " + sum + "\nThe"
                + " average of elements = " + ((float)sum/25.0));
    }
}
