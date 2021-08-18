/*1. Inhertance
 super class/ parent class -> dreivered class
 ->single inheritance  - done
2. Multilevel inheritance  - done
3. multiple inheritance  two parrent -> one child  - done , but not executed
4. Aggregation/ composition  - done , when we depend on other class is call aggregation
5. Super keyword  - done
6. This keyword   - done
7. pojo/ encapsulation  -- data binding and hiding -- done
8. tostring() -- coverert the value into string  --
--->9. Memory management -> class load, stack , heap, native method, pc register
   class  load -> bootstrap, application/ system
10. variable  -> local variable, instance and static   
11. static keyword - no need to make an object of class - done*/

class Student{
 
private int rollno;
private String Add;
// non parameterized constructor
Student(){
	
}

// parameterized constructor
Student(int roll, String add){
	this.rollno =  roll;
	this.Add =  add;	
}
 // getter and setter method  /pojo
public int getRollno(){
	return rollno;
}
 
 public String getAdd(){
	return Add;
}
public void setRollno(int roll){
	this.rollno =  roll;
}

 public void setAdd(String add){
	this.Add =  add;
}

 // to print the data of pojo class
 @Override  // objects class method  -- like wait, notify, notifyall, tostring, 
 public  String toString(){	
 return "Student Roll :"+rollno+" Address :"+Add;
}
}




public class TestMisscellenous{
 public static void main(String args[]){
  //Address add  = new Address(101," Disney "," Hollywood  "," NY- ",456897);
  Student stu =  new Student();
  stu.rollno=100;
  stu.setAdd("Hollywood"); // not access the attribute directly... we are using method to access the varibales
  stu.setRollno(10003);
  System.out.println(stu.toString());
  //stu.print();
 }

}
