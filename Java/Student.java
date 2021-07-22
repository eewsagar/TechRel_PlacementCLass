public class Student{
  int rollno;
  double aver;
  int marks[];

Student(){
System.out.println("please enter the proper value!!!"); 
}
Student(int roll, int []marks1){
rollno = roll;
marks = marks1;
int ave = 0;
for(int i = 0; i<3; i++){

ave =ave+marks[i];
} 
aver= ave/3;

System.out.println("Roll no : "+rollno +" Avergemarks : "+aver); 
}

public static void main(String []args){
 Student n1 = new Student();
int arr[]={45,56,67} ;
 Student n2 = new Student(1001,arr);
}

 }