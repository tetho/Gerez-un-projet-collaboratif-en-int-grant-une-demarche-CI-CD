package com.openclassrooms.bobapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BobappApplicationTests {

	@Test
	void contextLoads() {
	}

	 @Test
	    public void testKO() {
	        assertEquals(0, 1, "KO");
	    }
}
