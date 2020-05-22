package javapractice;
//@FunctionalInterface
public interface FunnInter extends funInter {
//one abstract method in case of functional interface
//Functional interface can contain any number of Object class methods(but here it is giving error)??????
	/*
	int func();
	String hush();
	boolean equals(Object obj);
   */
   void  mull(int n); //abstract method
	//void say(String msg);   // this method is only possible in case if we don't mention functional interface
	
   

}


