package javapractice;
import java.util.*;
//java program to compare the price of the book using tree set

 class Booklet {
	 
	 private String title;
	 private double price;
	 Booklet(String title,double price )
	 {
		 this.title=title;
		 this.price=price;
	 }
	 public String getTitle()
	 {
		 return title;
	 }
	 public double getPrize()
	 {
		 return price;
	 }
 }
 public class Book implements Comparator
 {
	 public int compare(Object o1,Object o2)
	 {
		 Book book1=(Book)o1;
		 Book book2=(Book)o2;
		 book1.getPrice()<book2
		 
	 }
	 
public static void main(String[] args) {

Booklet b1,b2,b3;
b1=new Booklet("PHP ",300.0);
b2=new Booklet("Java ",500.0);
b3=new Booklet(" Python ",800.0);
TreeSet t=new TreeSet(new Book());
t.add(b1);
t.add(b2);
t.add(b3);

}
 }
	


