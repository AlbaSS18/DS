package visitor;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Suma;
import nodos.Variable;

public interface Visitor {

	// Nodo
	Object visit(Programa a, Object param);
	
	// Sentencias
	Object visit(Asignacion a, Object param);
	Object visit(Print a, Object param);
	Object visit(Read s, Object param);
	
	// Expresión
	Object visit(Division a, Object param);
	Object visit(Suma a, Object param);
	Object visit(Producto a, Object param);
	Object visit(ConstanteInt s, Object param);
	Object visit(Variable s, Object param);

}
