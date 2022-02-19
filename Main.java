/*public class Main {
  public static int sum(int k) {
    int s=0;
    while (k>0) 
{ s+=k; k--;}     return s;}
  public static void main(String[] args) {
    int result = sum(99999);
    System.out.println(result);
  }
  
}



public class Main {

  public static int sum(int p, int u)
  {int s=0;
  while(p!=u)
{s=s+p;
  p++;}
s+=u;
return s;}
  public static void main(String[] args) {
    int result = sum(5, 43895);
    System.out.println(result);
  
  }
}
   

public class Main{
int x=5;
public static void main(String[] args) {
Main myObj = new Main();
System.out.println(myObj.x);
  }
}


public class Main{
int x=5;
int y=8;
}        second.java

  

public class Main{
int x;
public static void main(String[] args){
Main myObj = new Main();
myObj.x = 50;
System.out.println(myObj.x);
}}
   




public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  
    Main myObj2 = new Main();  
    myObj2.x = 25;
    System.out.println(myObj1.x);  
    System.out.println(myObj2.x);  
  }
}




public class Main{
String fname="Richard";
String lname="Benedict";
int age=28;
public static void main(String[] args){
  Main myObj=new Main();
System.out.println("Name: " + myObj.fname + " " + myObj.lname);
System.out.println("Age: " + myObj.age);
}
}





public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}





public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}*/





public class Main {
public void fullThrottle(){
System.out.println("My car is going as fast as it can!");}
public void speed(int maxSpeed){
  System.out.println("Max speed is: " + maxSpeed);
}
public static void main(String[] args){
Main obj = new Main();
obj.fullThrottle();
obj.speed(200);
}
}