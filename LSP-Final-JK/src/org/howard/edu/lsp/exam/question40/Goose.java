package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animals {
	   public Goose() {
	   }

	   @Override
	   public void speak() {
	       System.out.println("This Goose speaks.");
	   }

	   @Override
	   public void move() {
	       System.out.println("This Goose moves forward.");
	      
	   }

	   @Override
	   public void fly() {
	       System.out.println(this.getClass().getSimpleName()+" flies using its wings.");
	   }
	}
