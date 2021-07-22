class Student11{
 
int a=10;
int a1=10;

// declaration and defination
int array_a[] = {10, 10 , 10, 10} ;

char grade[];


public  void  print_array(String arrname[],String arradd[],int arrtell[]){
	System.out.println("***Inside the print Directory !!!");
	System.out.println("size of array : " + arrname.length);
	  
	System.out.println("Name          "+"address                  "+"Telephone"   );
	System.out.println("==============================================================\n");
	
	for(int i=0; i<arrname.length;i++){
	System.out.println(arrname[i]+"         "+arradd[i]+"                     "+arrtell[i]);  //{"tom","jerry","bomba","mogli","mr.bean","honeybeen","popoye"};
    
	}
	
	
}

public static void main(String args[]){
	Student11 std =  new Student11();
	String Stu_name[]={"tom","jerry","bomba","mogli","mr.bean","honeybeen","popoye"};
	String Stu_add[]={"pune","mumbai","bombay","maharashte","plot no3,disney"," new jersey UK","popoye"};
	int Stu_telephone[]={456789,456798213,8451,87945613,25648,235689,87465};
	std.print_array(Stu_name,Stu_add,Stu_telephone);
	
}
}