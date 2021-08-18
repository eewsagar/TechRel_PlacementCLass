/*1. Inhertance
 super class/ parent class -> dreivered class
 ->single inheritance  - done
2. Multilevel inheritance  - done
3. multiple inheritance  two parrent -> one child
4. Aggregation/ composition
5. Super keyword
6. This keyword
7. pojo/ encapsulation
8. tostring()
--->9. Memory management -> class load, stack , heap, native method, pc register
   class  load -> bootstrap, application/ system
10. variable  -> local variable, instance and static   
11. static keyword*/

class Animal{
 
int legs= 4;
public void walking(){
 System.out.println("animal walk on : "+legs+" legs.");
  
}
}

class Bird{
 
int nose= 2;
public void eating(){
 System.out.println("bird eat throgh  : "+nose+" nose.");
  

}
}

// parent classof tiger or child class of animal
class catfamily extends Animal extends Bird{
String sounds = "meow";
public void sound(){
System.out.println("cat create a sound : "+sounds);
}
} 
// child class 
class Tiger extends catfamily{
String sounds = "roar";
public void sound(){
System.out.println("tiger create a sound : "+sounds);
super.sound();  // dead lock condition // nowparent method
}

}

public class Test{
 public static void main(String args[]){
  Tiger c =  new Tiger();
  c.walking();
  c.sound();
  c.eat();
  
  //super.sound();
 
 }


}
