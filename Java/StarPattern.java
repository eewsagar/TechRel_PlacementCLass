/*i)

**********
**********
**********
**********

ii)

*
**
***
****
***** 

        *
       **
      ***
     ****
    *****


*/

public class StarPattern{

  public static void main(String arg[]){
    System.out.println("***** star pattern *****\n\n");
	
	for (int i=1;i<=4;i++){
		
		for(int j=1 ;j<=10;j++){
		
           System.out.print("*");
	}
	System.out.println("");
	}
	
/*	x =1-->5
y=1-->x

x =1
y =1,

x=2
y=1,2

x=3
y=1,2,3  */
	
	
	System.out.println("\n\n\n***** star pattern 2*****\n\n");
	 for(int x=1;x <=5;x++){
		 for(int y = 1;y<=x;y++){
			 System.out.print("*");//(x+""+y+" ");   //*
		 }
		 System.out.println("");
		 
	 }
/*  ####*
    ###**
    ##***
    #****
    *****  */


	 
	 System.out.println("***** star pattern 3 *****\n\n");
	
	int i=1;
		while (i<=20){
		
		for(int j=20 ;j>=1;j--){
		 if (j<=i){
           System.out.print("*");
		 }
	     else{
			 System.out.print(" ");
		 }
	}
	System.out.println("");
	i++;
	}
	
  }
 
}