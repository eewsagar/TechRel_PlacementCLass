//Question 7

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class EvenOddSum{

   public static void main (String args[]){
     int even =0,odd=0;
     //input number  =  1-50;
    for (int i =1; i <=50;i++){
	  
	  if (i%2==0){   //condition for even  number
	  
	  even = even+i;
	  System.out.println("The sum of the even :" +even);
	  
	  }
	  else{    //condition for odd  number
	  odd =odd+i;
	   System.out.println("The sum of the odd :" +odd);
	   
	  }
	
	}
	System.out.println("\n-----------The sum of the even and odd integers: ");
    System.out.println("The sum of the final even :" +even);
    System.out.println("The sum of the final odd :" +odd);
   }
}
