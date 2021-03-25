public class CalculatorExample{
  public static void main(String arg[]){
     int a=100;
	 int b =11;
	 
	 System.out.println("addition : " +(a+b)); // concate  cout<< "hello" << a+b
	 System.out.println("substraction : " +(a-b));  // ln is new line 
	 System.out.println(" Multiplication : " +(a*b));
	  System.out.println(" division : " +(a/b));
	   System.out.println(" Modulus : " +(a%b));
	 System.out.print(a+b);
	 System.out.print("  hello");
	 
	 
	// -------
	//for loop
	 System.out.println("\n --------------------- for loop --------------\n\n");
	 
	int x =3;
   for(int i=1;i<=10; i++ ){   // init, condition, incrror drecc
	 System.out.println(x+" X " +i +" = " + (i*x)); 
  }  
  
  System.out.println("\n --------------------- while loop --------------\n\n");
  int i=1;
  while (i<=10){
	  
	  System.out.println(x+" X " +i +" = " + (i*x)); 
	  
	  i++; // increment by 1
  }
  int num =5;
  switch(num){
	  case 1:
	         System.out.println("i am here in 1"); 
			 break;
	  case 2:
	  System.out.println("i am here in 2"); 
			 break;
	  case 3:
	  System.out.println("i am here in 3"); 
			 break;
		default : 
               System.out.println(" unknown number"); 
			 break;		
  }
  
	
  }


}