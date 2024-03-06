package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClasseDAO {
	@Autowired
	ClasseJDBC ObjetoJDBC;

	public ClasseJDBC getObjetoJDBC() {
		return ObjetoJDBC;
	}

	public void setObjetoJDBC(ClasseJDBC objetoJDBC) {
		ObjetoJDBC = objetoJDBC;
	}
	
}
