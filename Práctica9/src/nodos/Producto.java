package nodos;

import visitor.Visitor;

public class Producto implements Expresion {
	public Expresion left, right;

	public Producto(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}
	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}
}
