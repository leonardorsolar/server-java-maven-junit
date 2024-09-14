package com.example.server_java_maven_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerJavaMavenJunitApplicationTests {

	@Test
	void contextLoads() {
		int numero = 1; 
		assertEquals(1, numero, "1 deve ser igual a 1");
	}

}
