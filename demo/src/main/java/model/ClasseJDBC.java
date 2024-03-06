package model;

import org.springframework.stereotype.Component;

@Component
public class ClasseJDBC {
	public ClasseJDBC() {
		System.out.println("Conexão JDBC");
	}
}
