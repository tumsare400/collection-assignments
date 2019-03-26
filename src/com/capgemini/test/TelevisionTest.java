package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Television;

public class TelevisionTest {

	private static Television LG;
	private static  Television samsung;
	private static Television sony;
	
	@BeforeClass
	public static void setup() {
      LG=new Television("LG","LCD", true, 150000 );
	  samsung=new Television("samsung","LED",false, 50000);
	  sony=new Television("sony", "plasma", true, 100000);
	}
	@Test
	public void testIsAcceptDuplicates() {
		ArrayList<Television>television=new ArrayList<Television>();
		television.add(LG);
		television.add(samsung);
		television.add(sony);
		
		assertEquals(3, television.size());
	}
	@Test
	public void testWhetherOrderMaintained() {
	
		HashSet<Television>television=new HashSet<Television>();
		television.add(LG);
		television.add(samsung);
		television.add(sony);
		
		Iterator<Television>it= television.iterator();
		assertEquals("LG", it.next().getCompany());
		assertEquals("samsung", it.next().getCompany());
		assertEquals("sony", it.next().getCompany());
	}
	@AfterClass
	public static void teerDown() {
		LG=null;
		samsung=null;
		sony=null;
	}
}
