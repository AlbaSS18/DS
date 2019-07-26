package nodos;

import visitor.Visitor;

public class Asignacion implements Sentencia {
	public Variable variable;
	public Expresion expr;

	public Asignacion(Variable variable, Expresion expr) {
		this.variable = variable;
		this.expr = expr;
	}
	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}

}
