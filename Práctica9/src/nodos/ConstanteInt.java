package nodos;

import visitor.Visitor;

public class ConstanteInt implements Expresion {
	public String valor;

	public ConstanteInt(String valor) {
		this.valor = valor;
	}
	
	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}
}
