 class Test1 
    { 
    static int add(int a,int b){return a+b;}  
     static int add(int a,int b,int c){return a+b+c;} 
 static double add(double a, double b){return a+b;}  
}  
 
 
 class Test2 
  { 
   public static void main(String[] args) 
   { 
      System.out.println(Test1.add(24,41));    
      System.out.println(Test1.add(24,41,11));
         System.out.println(Test1.add(13.2,14.6));  
   } 
}   
