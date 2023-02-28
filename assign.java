class A{//number swaping using third variable
	public static void main (String[]args){
		int a=100;
		int b=200;
		
		 a=(b+a);
		 b=(a-b);
		 a=(a-b);
		System.out.println("The value of a is"+a);
		System.out.println("The value of b is"+b);
