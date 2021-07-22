class StarPatter{

  public static void main(String args[]){
int count= 1;
    for (int i=1; i<=4; i++){
       for (int j =1; j<=i; j++){
         if (j%2==0){
       System.out.print("* ");
         }else{
                 System.out.print("$ ");
           }
       count++;
        }  
       System.out.println();
      }
   for (int i=1; i<=5; i++){
       for (int k =5; k>=i; k--){
       if (k%2==0){
       System.out.print("* ");
         }else{
                 System.out.print("$ ");
           }
       count++;
        } 
       System.out.println();
      }
  }
}


