/*
   Name:Therese Andrei C. Arcenal
   Yr&Sec: BSIT 2B
   Date: 9/6/2023
   Activity: 1.0
*/   
  
 import java.util.Scanner;

class Animal{
  public static void main(String args[]){
   System.out.println("");
   Scanner scanner = new Scanner(System.in);
   int choice;
   
     Animal animal = new Animal();
     Dog dog = new Dog();
     Cat cat = new Cat();
     Fox fox = new Fox();
     Cow cow = new Cow();
     
     System.out.println("What does the Animal Say?");
        
    
      
       System.out.println("What does the animal say");
       System.out.println("1. Dog");
       System.out.println("2. Cat");
       System.out.println("3. Fox");
       System.out.println("4. Cow"); 
       
       System.out.println("Enter selected number:"); 
       choice = scanner.nextInt();    
     
     
     switch (choice){
      case 1:
         dog.makeSound();
         break;
      case 2:
         cat.makeSound();
         break;
      case 3:
         fox.makeSound();
         break;
      case 4:
         cow.makeSound();
         break;
     }    
       
  }
}

class Dog extends Animal{
   public void makeSound(){
      System.out.println("Aw, aw ,aw");
   }
}

class Cat extends Animal{
   public void makeSound(){
      System.out.println("Meow, meow, meow");
   }
}

class Fox extends Animal{
   public void makeSound(){
      System.out.println("Ding, ding, Ding");
   }
}

class Cow extends Animal{
   public void makeSound(){
      System.out.println("Moo, moo, moo");
   }
}

