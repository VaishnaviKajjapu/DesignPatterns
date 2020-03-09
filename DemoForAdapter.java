package com.DesignPatterns;


interface Bird 
{
	public void fly(); 
	public void makeSound(); 
} 

class Parrot implements Bird 
{  
	public void fly() 
	{ 
		System.out.println("Fly"); 
	} 
	public void makeSound() 
	{ 
		System.out.println("Chirp"); 
	} 
} 

interface ToyDuck 
{  
	public void squeak(); 
} 

class PlasticToyDuck implements ToyDuck 
{ 
	public void squeak() 
	{ 
		System.out.println("Squeak"); 
	} 
} 

class BirdAdapter implements ToyDuck 
{ 
	Bird bird; 
	public BirdAdapter(Bird bird) 
	{ 
		this.bird = bird; 
	} 

	public void squeak() 
	{ 
		bird.makeSound(); 
	} 
} 

class DemoForAdapter
{ 
	public static void main(String args[]) 
	{ 
		Parrot parrot = new Parrot(); 
		ToyDuck toyDuck = new PlasticToyDuck(); 

		ToyDuck birdAdapter = new BirdAdapter(parrot); 

		System.out.println("Parrot:"); 
		parrot.fly(); 
		parrot.makeSound(); 

		System.out.println("ToyDuck:"); 
		toyDuck.squeak(); 

		System.out.println("BirdAdapter:"); 
		birdAdapter.squeak(); 
	} 
} 
