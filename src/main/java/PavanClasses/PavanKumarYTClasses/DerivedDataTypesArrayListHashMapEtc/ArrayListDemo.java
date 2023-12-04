package PavanClasses.PavanKumarYTClasses.DerivedDataTypesArrayListHashMapEtc;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        //How to declare an ArrayList
         ArrayList list1 = new ArrayList();       //We can store any type of elements
        //Creating an object, and accessing the methods
        // ArrayList <Integer> list2 = new ArrayList <Integer>(); //Arraylist for Integers

//        ArrayList <String> list1 = new ArrayList <String>(); //Arraylist for String
        //Adding values to arraylist

        list1.add("John1");      //Add is a method being used with Object list1 to add values in ArrayList
        list1.add("John2");
        list1.add("John3");
        list1.add("John4");
        list1.add("100");
        list1.add('A');


        //Find out how many elements I have stored, size of the ArrayList
        System.out.println(list1.size());               //4
        System.out.println("before removing: " +list1);

        //How we can remove elements from ArrayList
        list1.remove(1);
        System.out.println(list1.size());
        System.out.println("After removing: " +list1);

        //Insert a new element in the middle of ArrayList
        list1.add(1,"John Middle");
        System.out.println(list1.size());
        System.out.println("After Inserting: " +list1);

        System.out.println("Enhanced For Loop");
        //Read Individual Values from Array List using For Loop (Enhanced For Loop)
        for (Object s :list1)               //Object can hold any type of value/datatype
        {

            System.out.println(s);
        }
    }
}
