package javapractice;
//it is not a functional interface
public interface funInter {
	
	//note that a functional interface can extends another another interface only when it does not have any any abstract method
	
	void meth();  //abstract method
	 default void methi() {      // you have to mention default here otherwise it took it for abstract 
		System.out.println("come here");
	}

}
