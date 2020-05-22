package javapractice;


/**
 * @author Devlabs Alliance
 *
 */
public class JavaDemo implements  FunnInter {           //while giving error still working???????
	//this class must implement all the methods of an interface


	 void say(String msg) {
		System.out.print(msg);
	}
	// void mull(int n)   giving error
	public void mull(int n)
	{
		System.out.print(n);
	}
	{
		
	}
	public static void main(String[] args)
	{int jam=98;
		JavaDemo f=new JavaDemo();
		f.say("hello ");  // here we don't need to mention public in method
		f.mull(6);  // overriding this abstract method (While overriding the abstract method we have to mention public in method)
		f.methi();//here we are able to call this method as functional interface extends interface
	
		//Now creating an anonymous class using interface without lambda
		funInter f1=new funInter() {
			//now implementing the abstract method
			public void meth() {
				System.out.println("Methi is good for your health"+jam);
			}
			
		};
	
		f1.meth();
	//note that lamda expression provides implementation of functional interface(having one abstract method only)
		//lambda syntax is (argument list)->{body}
		funInter f2=()->{
			System.out.print("What to describe");
		};
		f2.meth();
	
	}


}
