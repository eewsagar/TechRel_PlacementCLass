/*1. Inhertance
 super class/ parent class -> dreivered class
 ->single inheritance  - done
2. Multilevel inheritance  - done
3. multiple inheritance  two parrent -> one child  - done , but not executed
4. Aggregation/ composition  - done , when we depend on other class is call aggregation
5. Super keyword  - done
6. This keyword   - done
7. pojo/ encapsulation
8. tostring()
--->9. Memory management -> class load, stack , heap, native method, pc register
   class  load -> bootstrap, application/ system
10. variable  -> local variable, instance and static   
11. static keyword*/

class Student{
 
int rollno;
Address Add;


 
public  void PrintData(int roll, Address add){
 System.out.println("Student Roll :"+roll+" Address :"+add.flatno+add.roadName+add.City+add.Pincode);
  
}
}

/*class Address{
 
 int flatno;
 String roadName;
 String City;
 String state;
 int Pincode;
 

public Address(int flatno,String roadName,String City,String state,int Pincode){
 this.flatno=flatno;
 this.roadName=roadName;
 this.City=City;
 this.state=state;
 this.Pincode=Pincode;
 
}

}
*/



public class TestAggregation extends Student{
 public static void main(String args[]){
  Address add  = new Address(101," Disney "," Hollywood  "," NY- ",456897);
  Student stu =  new Student();
  stu.PrintData(1002,add); 
 }


}
