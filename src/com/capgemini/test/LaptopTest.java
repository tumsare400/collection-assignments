package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;

public class LaptopTest {

 private static Laptop delllaptop;
 private static Laptop hplaptop;
 private static Laptop accerlaptop;
 
 @BeforeClass
 public static void setUp() {
	delllaptop=new Laptop("Dell", "XPS15", "windows10", "Intelcorei3");
	hplaptop=new Laptop ("HP", "ENVY", "windows8", "Intelcorei5");
	accerlaptop=new Laptop ("HP", "TUF", "windows7", "Intelcorei7");
 }

 @Test
 public void testWheatherItIsAcceptingDuplicates() {
	 HashSet<Laptop>laptops=new HashSet<>();
	 laptops.add(delllaptop);
	 laptops.add(hplaptop);
	 laptops.add(accerlaptop);
	 
	 assertEquals(3, laptops.size());
 }
 @Test
 public void testWheatherTheOrderIsMaintained(){
	 ArrayList<Laptop> laptops=new ArrayList<Laptop>();
	 laptops.add(delllaptop);
	 laptops.add(hplaptop);
	 laptops.add(accerlaptop);
	 
	 Iterator<Laptop>it=laptops.iterator();
		assertEquals("Dell", it.next().getCompany()); 
		
 }
 @AfterClass
 public static void teerDown() {
	 
	 delllaptop=null;
	 hplaptop=null;
	 accerlaptop=null;
 }

}
