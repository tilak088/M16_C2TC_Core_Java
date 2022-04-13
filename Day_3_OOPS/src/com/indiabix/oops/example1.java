package com.indiabix.oops;

public class example1 
{  
	String name;
	// paramiterized constructorr
	Example1 (String Name)
	
	{
		name=Name;
	}
    void display ()
    {
    	System.out.println("this is +name");
}
   public static void main(String[] args)
   {
	   Example1 a1=new Example1 ("circle");
	   Example1 a2=new Example1 ("square");
       Example1 a3=new Example1 ("rectangle");
       a1.display();
	   a2.display();
	   a3.display();
   }
   