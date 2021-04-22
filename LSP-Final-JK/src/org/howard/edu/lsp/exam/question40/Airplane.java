package org.howard.edu.lsp.exam.question40;

public class Airplane extends Flying 
{
   public Airplane() {
   }

   @Override
   public void fly() {
       System.out.println(this.getClass().getSimpleName() + " flies using technology.");
   }
}
