package com.oopexample;
class Animal 
{ 
    public void makeSound() 
    {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Woof");
    }
}
class Cat extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Meow");
    }
}
class Cow extends Animal 
{   
    @Override
    public void makeSound() 
    {
        System.out.println("Moo");
    }
}

public class AnimalSounds 
{
	public static void main(String[] args) 
	{
		Animal animal1 = new Dog();
		animal1.makeSound(); 
        Animal animal2 = new Cat();
        animal2.makeSound();
        Animal animal3 = new Cow();
        animal3.makeSound();   
	}
}
