package com.selenium;

import java.util.Scanner;


	interface drawable {
		  void draw();
		  default void print() {
			  System.out.println("hello");
		  }
			 static int cube(int x) {
				  return(x*x);
			  } 
			 
			 void m();
			 void m1();
			 void m2();
		  }
	public  abstract class simple implements drawable{
		 public void m() {
			System.out.println("m");
		}
		 
	}
	 class M extends simple {
		 private int a=10;
			public  void m1() {
				System.out.println("m1");
			 }
			public  void m2() {
				System.out.println("m2");
			 }
			@Override
			public void draw() {

					System.out.println("draw");
			}
	 
	 }
	



	
