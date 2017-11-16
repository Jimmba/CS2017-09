package by.it.sc02_morning.menchytsky.examples.lesson13.listing22;

// Varargs, overloading, and ambiguity.
//  
// This program contains an error and will  
// not compile!  
class VarArgs4 {  
 
  // Use an int vararg parameter.  
  static void vaTest(int ... v) {  
    // ... 
  }  
  
  // Use a boolean vararg parameter.  
  static void vaTest(boolean ... v) {  
    // ... 
  }  
  
  
  public static void main(String args[])   
  {  
    vaTest(1, 2, 3);  // OK  
    vaTest(true, false, false); // OK  
  
    // vaTest(); // Error: Ambiguous!
  }  
}