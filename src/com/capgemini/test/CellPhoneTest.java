package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.CellPhone;
import com.capgemini.main.Laptop;

public class CellPhoneTest {

	 private static CellPhone Apple;
	 private static CellPhone samsung;
	 private static CellPhone vivo;
	 
	 @BeforeClass
	 public static void setUp() {
		 Apple=new CellPhone("Apple", "XPS15", "Ram3GB", "window10", 50000);
		 samsung=new CellPhone("samsung", "ENVY", "Ram4GB", "window8", 20000);
		 vivo=new CellPhone("vivo", "TUF", "Ram3GB", "window17", 30000);
	 }

	 @Test
	 public void testWheatherItIsAcceptingDuplicates() {
		 HashSet<CellPhone>cellphone=new HashSet<CellPhone>();
		 cellphone.add(Apple);
		 cellphone.add(samsung);
		 cellphone.add(vivo);
		 
		 assertEquals(3, cellphone.size());
	 }
	 @Test
	 public void testWheatherTheOrderIsMaintained(){
		 ArrayList<CellPhone> cellphone=new ArrayList<CellPhone>();
		 cellphone.add(Apple);
		 cellphone.add(samsung);
		 cellphone.add(vivo);
		 
		 Iterator<CellPhone>it=cellphone.iterator();
			assertEquals("Apple", it.next().getCompany()); 
			assertEquals("samsung", it.next().getCompany()); 
			assertEquals("vivo", it.next().getCompany()); 
			
	 }
	 @AfterClass
	 public static void teerDown() {
		 
		 Apple=null;
		 samsung=null;
		 vivo=null;
	 }

	}


