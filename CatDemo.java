package com.oopexample;

public class CatDemo extends AnimalDemo{
    @Override
	public void makeSound()
    {
    	System.out.println("Meow Meow");
    }
	public static void main(String[] args) {
       AnimalDemo ob=new AnimalDemo();
       ob.makeSound();
       CatDemo obj=new CatDemo();
       obj.makeSound();
	}

}
