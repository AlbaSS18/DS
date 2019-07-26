package nodos;

import visitor.Visitor;

public class Division implements Expresion {
	public Expresion left, right;

	public Division(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}
}
