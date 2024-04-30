import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

class Collections_ArrayList_1
{
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList();

        //Add elements

        list.add(9);
        list.add(5);
        list.add(7);

        System.out.println(list);

        list.add(2, 3);
        System.out.println(list);

        //size

        int b = list.size();
        System.out.println("Size of list is: " + b);

        //get

        int elements=list.get(0);
        System.out.println("Element at given index is : " + elements);

        //set
        list.set(0,12);
        System.out.println(list);


        //remove
        list.remove(3);
        System.out.println(list);

        //using loop

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //sorting

        Collections.sort(list);
        System.out.println(list);


    }
}


