package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Student;

public class StudentTest {

	private static Student payal;
	private static Student deepti;
	private static Student anushree;

	@Before
	public  void setUp() {
		payal = new Student("payal", 10, "Wardha", "Apple");
		deepti = new Student("deepti", 11, "mp", "Mango");
		anushree = new Student("anushree", 13, "mumbai", "Watermelon");
	}

	@Test
	public void testIsOrderMaintained() {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(payal);
		students.add(deepti);
		students.add(anushree);

		Iterator<Student> it = students.iterator();
		assertEquals("payal", it.next().getStudentName());
		assertEquals("deepti", it.next().getStudentName());
		assertEquals("anushree", it.next().getStudentName());
	}

	@Test
	public void testCheckWhetherIsDuplicateContain() {
		HashSet<Student> students = new HashSet<Student>();
		students.add(payal);
		students.add(deepti);
		students.add(anushree);
		students.add(payal);

		assertEquals(3, students.size());

		/*
		 * Iterator<Student> it = students.iterator(); assertEquals("payal", it.next());
		 * assertEquals("deepti", it.next()); assertEquals("anushree", it.next());
		 */

	}

	@Test
	public void testGetFruitsBytheirFruitValuename() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(payal.getStudentName(), "Apple");
		hm.put(deepti.getStudentName(), "Mango");
		hm.put(anushree.getStudentName(), "Watermelon");
        
		assertEquals("Apple", hm.get(payal.getStudentName()));
		assertEquals("Mango", hm.get(deepti.getStudentName()));
		assertEquals("Watermelon", hm.get(anushree.getStudentName()));
		
		assertTrue(hm.values().contains("Apple"));
		assertTrue(hm.values().contains("Mango"));
		assertTrue(hm.values().contains("Watermelon"));
		assertFalse(hm.values().contains("payal"));
		assertFalse(hm.values().contains("deepti"));
		assertFalse(hm.values().contains("anushree"));
		
		assertTrue(hm.keySet().contains("payal"));
		assertTrue(hm.keySet().contains("deepti"));
		assertTrue(hm.keySet().contains("anushree"));
		assertFalse(hm.keySet().contains("Apple"));
		assertFalse(hm.keySet().contains("Mango"));
		assertFalse(hm.keySet().contains("Watermelon"));
	}

}
