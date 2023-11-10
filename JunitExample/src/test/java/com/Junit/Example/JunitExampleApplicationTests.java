package com.Junit.Example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitExampleApplicationTests {

	private Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}


	@Test
	void testSum() {
		int expectedResult=19;
		
		int actualResult=c.doSum(12,3,4);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testProduct() {
		int expectedResult=20;
		int actualResult=c.doProduct(2, 2, 5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testDivide() {
		int expectedResult=2;
		int actualResult=c.doDivide(10,5);
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
}
