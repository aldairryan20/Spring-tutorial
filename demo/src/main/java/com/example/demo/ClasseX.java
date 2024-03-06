package com.example.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("X")
public class ClasseX implements InterfaceB{

	@Override
	public void metodoB() {
		System.out.println("Metodo X");
	}

}
