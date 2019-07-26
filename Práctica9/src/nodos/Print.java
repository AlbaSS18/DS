package nodos;

import visitor.Visitor;

public class Print implements Sentencia {
	public Expresion expr;

	public Print(Expresion expr) {
		this.expr = expr;
	}
	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}

}
