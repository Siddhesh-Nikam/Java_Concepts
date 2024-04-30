import java.lang.*;
import java.util.*;

class Collections_Vectors_3
{
    public static void main(String arg[])
    {
        Vector vector = new Vector();

        vector.add("Sanjay");
        vector.add("Rahul");
        vector.add("Arman");

        System.out.println(vector);

        System.out.println("The size of the vector = " +  vector.size());

        System.out.println("The first element of the vector = " + vector.firstElement());

        //Here the program will print out the first appearance of "Johnny" element
        System.out.println(vector.indexOf("Rahul"));

        //Program will print out the first appearance of "Johnny" element starting from the element 1
        System.out.println(vector.indexOf("Arman", 1));

        vector.clear(); //deleting all vector elements
        System.out.println("the size of the vector after clear method = " +  vector.size());


    }
}