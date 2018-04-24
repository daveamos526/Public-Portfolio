//RecursiveArray.java - Write a recursive method printArray() that displays all 
//the elements in an array of integers, separated by spaces.
//David Amos
//References - 
//https://howtoprogramwithjava.com/java-recursion/
//http://www.javatpoint.com/final-keyword
//http://stackoverflow.com/questions/5887709/getting-random-numbers-in-java


public class RecursiveArray 
{
    
    //Begin main
    public static void main(String[]args)
    {
        
        //instantiate an integer array size of 100
        //create int size
        final int size = 100;
        
        //initialize the array
        int[]recursiveArray = new int[size];
        
        //fill the array
        //form random number generator
        for(int i = 0; i < size; i++)
            recursiveArray[i] = (int)(Math.random()*100) + 1;
        
        //call randomIntArray
        System.out.println("Random Integer Array: ");
        randomIntArray(recursiveArray);
        
    }//End main
    
    //randomIntArray
    public static void randomIntArray(int[]array)
    {
        System.out.print("[");
        
        for(int i = 0; i < array.length - 1; i++)
            
            //include commas and spaces
            System.out.print(array[i] + ", ");
        
        System.out.println(array[array.length - 1] + "]");
    }
}
