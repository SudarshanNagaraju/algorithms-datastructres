package com.sixdee.test.Adobe;


class A{
	public static void method() {
		System.out.println("Method A");
	}
}

class B extends A{
	public static void method() {
		System.out.println("Method B");
	}
}


public class TestMain {

	public static void main(String[] args) {
		
		
		A a=new B();
		
		
		a.method();
		
		
		

	}

}
