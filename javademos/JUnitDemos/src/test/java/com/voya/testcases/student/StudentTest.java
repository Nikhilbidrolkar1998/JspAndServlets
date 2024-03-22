package com.voya.testcases.student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.exception.InvalidNumberException;
import com.voya.training.StudentDetails;

class StudentTest {
	StudentDetails studentDetails=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all the testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all the testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		studentDetails=new StudentDetails();
		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("called after each testcases");
		studentDetails=null;
	}

	@Test
	//@Disabled
	void testTotalMarks() {
		int actual=studentDetails.totalMarks(50, 50, 50);
		assertEquals(150, actual,"Expected marks are 150");
	}
	@Test
	@Tag("negative")
	@DisplayName("testing marks negative")
	void testNegativeMarks() {
		assertThrows(InvalidNumberException.class,()->studentDetails.totalMarks(80,-50,70));
	}
	@Test
	@DisplayName("testing marks less than 100")
	void testGreaterMarks() {
		assertThrows(InvalidNumberException.class,()->studentDetails.totalMarks(180,50,70));
	}
}
