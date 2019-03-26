package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.main.Laptop;
import com.capgemini.main.School;

public class SchoolTest {

	private static School NewEnglish;
	private static School LokVidyalay;
	private static School SVM;

	@BeforeClass
	public static void setUp() {
		NewEnglish = new School("NewEnglish", "Wardha", "Wardha", "A");
		LokVidyalay = new School("LokVidyalay", "Nagpur", "Nagpur", "A");
		SVM = new School("SVM", "Amravati", "Amravati", "B");
	}

	@Test
	public void testWheatherItIsAcceptingDuplicates() {
		HashSet<School> school = new HashSet<>();
		school.add(NewEnglish);
		school.add(LokVidyalay);
		school.add(SVM);

		assertEquals(3, school.size());
	}
	@Test
	 public void testWheatherTheOrderIsMaintained(){
		 ArrayList<School> school=new ArrayList<School>();
		 school.add(NewEnglish);
		 school.add(LokVidyalay);
		 school.add(SVM);
		 
		 Iterator<School>it= school.iterator();
			assertEquals("NewEnglish", it.next().getSchoolName()); 
			
	 }
	 @AfterClass
	 public static void teerDown() {
		 
		 NewEnglish=null;
		 LokVidyalay=null;
		 SVM=null;
	 }

}
