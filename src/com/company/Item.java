package com.company;

public class Item {
    private String name;
    private String color;
    private int price;

    public Item(String _name, String _color, int _price){
        name = _name;
        color = _color;
        price = _price;
        System.out.println(_name + " is created");
    }

    @Override
    public String toString(){
        return String.format("Item name is " + name + " / color - " + color + " / €" + price  );
    }

}
