import java.lang.*;
import java.util.LinkedList;
import java.util.List;

class Collections_LinkedList_2
{
    public static void main(String arg[])
    {
        LinkedList<String> names = new LinkedList<String>();

        //Adding elements in Linked lIst

        names.add("Ajay");
        names.add("Rajan");
        names.add("Sanjay");

        System.out.println(names);

        //addFirst()
        names.addFirst("Rahul");
        System.out.println(names);

        //addLast()
        names.addLast("Pratik");
        System.out.println(names);

        //removeFirst()
        names.removeFirst();
        System.out.println(names);

        //removeLast()
        names.removeLast();
        System.out.println(names);

        //getFirst()
        System.out.println(names.getFirst());

        //getLast()
        System.out.println(names.getLast());


    }
}