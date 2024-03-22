package com.voya.testcases.greet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Checkertest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	@DisplayName("Testing Null")
	void testNull() {
		List<String> myList=null;
		assertNull(myList);
	}
	@Test
	@DisplayName("Testing not null")
	void testNotNull() {
		List<String> myList=new ArrayList<>();
		assertNotNull(myList);
	}
	@Test
	@DisplayName("Testing String References")
	void testSame() {
		String username="Priya";
		String nusername="Priya";
		assertSame(username, nusername,"references are not same");
	}

}
