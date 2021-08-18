

class data{

 public void print(){
 System.out.println("Please print  data");
}
}
//-------------------

public class sample11  extends data {

 public final void add(){

  System.out.println("Add");
}

// overrideing
public void print(){
 System.out.println("Please print addition of data");
}

/// overloading
public final void add(int a, int b){
  int add =  a+b;
  
}

public static void main(String arg[]){
sample11 sample =  new sample11();
sample.add();
sample.add(10,20);
sample.print();

  
}

}