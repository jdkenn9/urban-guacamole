package org.howard.edu.lsp.exam.question40;

public class Test 
{
   public static void main(String[] args) 
   {
       Animals tiger = new Tiger();
       Animals goose = new Goose();
       Flying flyingGoose = new Goose();
       Flying airplane = new Airplane();
      
       tiger.move();
       tiger.speak();
       goose.move();
       goose.speak();
       flyingGoose.fly();
       airplane.fly();
   }
}
