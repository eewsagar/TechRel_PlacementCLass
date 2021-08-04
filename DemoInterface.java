interface vehicle{  // reused of code, dynamic change of method, behaviour handel as per the requirment
  public void brake(); // no implements  // abstarct method declaration
  public void engine();
  public void Speed();
  
  default void color(){
	  System.out.println("color of vehical is black");
  }
  int j=10;
}
//class
interface data{
	public void add();
}
// multiple inheritance

///public class DemoInterface extends vehical, data --- it will give error
public class DemoInterface implements vehicle, data{
	
	public void add(){
		int i=10; 
		int j=20;
		System.out.println("sum of two number is 100"+(i+j));
	}
	
  public void brake(){  // abstarct method defination or implementation
     System.out.println("slow speed !!!");
  }
  
  public void engine(){
	  System.out.println("Engine is 250 CC");
	  
  }
  public void Speed(){
	  System.out.println("After brake its slow speed");
  }

  public static void main(String arg[]){
  DemoInterface di =  new DemoInterface();
  di.brake();
  di.engine();
  di.Speed();
  di.add();
  di.color();
  }
}
