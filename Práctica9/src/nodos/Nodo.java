package nodos;

import visitor.Visitor;

public interface Nodo {
	
	Object accept(Visitor v, Object param );

}
