package nodos;

import java.util.List;

import visitor.Visitor;

public class Programa implements Nodo {
    public List<Sentencia> sentencias;
    
    public Programa(List<Sentencia>  sentencias) {
        this.sentencias = sentencias;
    }

	public Object accept(Visitor interprete, Object object) {
		return interprete.visit(this, object);
	}
}
