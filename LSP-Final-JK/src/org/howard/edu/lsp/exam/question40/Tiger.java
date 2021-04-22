package org.howard.edu.lsp.exam.question40;

public class Tiger implements Animals 
{
   @Override
   public void speak() 
   {
	   System.out.println("This Tiger speaks.");
   }
   @Override
   public void move() 
   {
       System.out.println("This Tiger moves forward.");
   }
}