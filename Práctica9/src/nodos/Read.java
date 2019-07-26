package nodos;

import visitor.Visitor;

public class Read implements Sentencia {
	public Variable var;

	public Read(Variable var) {
		this.var = var;
	}
	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}
}
