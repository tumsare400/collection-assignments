package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;
import com.capgemini.main.car;

public class carTest {

	private static car BMW;
	private static car Lamborgini;
	private static car  swift;
	
	@BeforeClass
	public static void setUp() {
		 BMW=new car("India", "BMW", 1994, 200000);
		 Lamborgini=new car("US", "Lamborgini", 1996, 400000);
		 swift=new car("India", "swift", 1999, 200000);
	}
	
   @Test
   public void testIsAcceptDuplects() {
	   TreeSet<car> tree = new TreeSet<car>();
	   tree.add(BMW);
	   tree.add(Lamborgini);
	   tree.add(swift);
   }
   
   @AfterClass
   public static void teerDown() {
  	 
	   BMW=null;
	   Lamborgini=null;
	   swift=null;
   }
}
