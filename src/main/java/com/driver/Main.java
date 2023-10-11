package com.driver;

class A {
    A (){}

    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }

}

public class Main {
  public static void main(String[] args) {
    B obj = new B();
    
    System.out.println(obj.meth());
    System.out.println(obj.meth());
    
  }
}