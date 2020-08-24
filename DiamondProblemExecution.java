package com.diamondproblem;



abstract class Basic
{
	public abstract void run();
}

class Parent1 extends Basic
{

	@Override
	public void run() {
          System.out.println("Running method of parent1");		
	}
	
}

class Parent2 extends Basic
{

	@Override
	public void run() {
  
		System.out.println("Running method of parent2");
	}
	
}

public class DiamondProblemExecution extends Parent1,Parent2 {
  

	public static void main(String args []) 
	{
		DiamondProblemExecution d= new DiamondProblemExecution();
		d.run();
	}

}
