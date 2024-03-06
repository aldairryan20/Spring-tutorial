package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Y")
public class ClasseY implements InterfaceB{

	@Override
	public void metodoB() {
		System.out.println("Metodo Y");
	}

}
