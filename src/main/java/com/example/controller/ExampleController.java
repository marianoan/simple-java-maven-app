package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Productos;
import com.example.service.ExampleService;

@RestController
@RequestMapping("/")
public class ExampleController {
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	
	@RequestMapping("/example/{code}")
       public ResponseEntity<String> getAllAlgo(@PathVariable("code") String code) {            
             //List<Productos> response = exampleService.getProductos(code);
             //return new ResponseEntity<>(response, HttpStatus.OK);
             return new ResponseEntity<>("Prueba de API con un parametro cambio 2:  " + code, HttpStatus.OK);
 
       }
      
	@RequestMapping("/example")
	public ResponseEntity<String> getOne() {
		
			return new ResponseEntity<>("Prueba de API sin parametro ", HttpStatus.OK);

	}

}
