package com.example.gaboninja;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import static org.junit.Assert.*;

import com.example.controller.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleControllerTest {

	ExampleController controller = new ExampleController();

	@Test
	public void getAllAlgoTest() {
		ResponseEntity<String> result = controller.getAllAlgo("algo");
		
		assertNotNull(result);
		assertEquals(HttpStatus.OK, result.getStatusCode());
		assertEquals("Code :  algo", result.getBody());


	}

}
