package by.it.sc02_morning.menchytsky.examples.lesson13.listing10;

/* Automatic type conversions can affect
   overloaded method resolution. 
*/ 
class Overload2 { 
  void f(int x) { 
    System.out.println("Inside f(int): " + x); 
  } 
 
  void f(double x) { 
    System.out.println("Inside f(double): " + x); 
  } 
} 
