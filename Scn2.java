import java.util.Scanner;
class Scan2{
	public static void main(String[]args){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Name");

	 String name=s.nextLine();
	 
	 System.out.println("Enter your age");
	 byte age=s.nextByte();
	 System.out.println("Welcome "+ name +" your name is:  " +name +"   And your age is" +age); 
	}
}