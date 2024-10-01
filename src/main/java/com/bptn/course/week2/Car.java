package com.bptn.course.week2;

class Car {
    /* in this challenge, we had to build on the Car class and create two constructors
    One constructor is similar to what we have done during our classes
    the constructor with parameters, all I had to do was add parameters for
    String color, String brand, and int price.
    From there, I used the this keyword and dot operator, and assign the parameters to instance
    variables.
    The trickier part was to create a default constructor and call the other constructor from this
    A default constructor is very simple, it typically has no parameters
    The hard part was calling the other constructor from it
    After doing some research, I learned that all I have to do was call this like a function
    inside the constructor and pass default parameters.
    */


    //Declare a String color, String brand, int price
    private String color;
    private String brand;
    private int price;

    // calls the parameterized constructor
    public Car() {this("Black", "Toyota", 20000);}

    public Car(String color, String brand, int price) {
        //Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    void printCarDetails() {
        this.print();
    }

    private void print() {
        System.out.println(
            "Car{color='" + color + '\'' + ", brand='" + brand + '\'' + ", price=" + price +'}');
            //"Car{color='" + color + '\'', brand='' + brand + '\'', price=' + price + '}'
        
    }
}
