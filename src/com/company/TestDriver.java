package com.company;

public class TestDriver {

    public static void run(){
        testItem();
    }


    public static void testItem(){
        Item i1 = new Item("Pencil","Rainbow", 8);
        System.out.println(i1.toString());

        Item i2 = new Item("Apple","Red", 2);
        System.out.println(i2.toString());

        Item i3 = new Item("Book","Brown", 13);
        System.out.println(i3.toString());

        Item i4 = new Item("Bag","Purple", 54);
        System.out.println(i4.toString());

        Item i5 = new Item("Board","Green", 102);
        System.out.println(i5.toString());
    }
}
