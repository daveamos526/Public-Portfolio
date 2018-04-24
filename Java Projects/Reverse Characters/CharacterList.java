//CharacterList.java - Displays object of 10 characters then displays it
//again in reverse character order
//David Amos
//References - 
//https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
//https://www.tutorialspoint.com/java/util/java_util_collections.htm



//import
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CharacterList 
{
    public static void main(String args[])
    {
        
        //Create original list
        LinkedList<Character> list = new LinkedList<Character>();
        
        //Add 10 characters to the list
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        
        //Create reversed list
        List<Character> reversedList = new ArrayList<Character>();
        
        //Join the original list
        reversedList.addAll(list);
        
        //Reverse the orginial list
        Collections.reverse(reversedList);
        
        //Print the orginal list followed by the reversed list
        System.out.println("Original List: " + list);
        System.out.println("Reversed List: " + reversedList);
    }
}
