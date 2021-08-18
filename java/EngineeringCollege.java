class EngineeringCollege{

   void StudentDetails(){
    int rollNumber=100;
    final double POINTER_CGPA=9.14;
    String studentName = "Tom Jerry";

    System.out.print("Student Name:" +studentName +" Roll Number : " +rollNumber +" Percentage : " +POINTER_CGPA);

String data =  studentName +rollNumber;
System.out.println(data);  // ln -> new line
System.out.print(data);

}
  public static void main(String []args){
    EngineeringCollege ec =  new EngineeringCollege ();
     // this is new in java
    ec.StudentDetails();
  }

}