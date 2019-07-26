package nodos;

import visitor.Visitor;

public class Variable implements Expresion {
	public String name;

	public Variable(String name) {
		this.name = name;
	}

	public Object accept(Visitor interpreteVisitor, Object param) {
		return interpreteVisitor.visit(this, param);
	}
}
