package visitor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import nodos.Asignacion;
import nodos.ConstanteInt;
import nodos.Division;
import nodos.Print;
import nodos.Producto;
import nodos.Programa;
import nodos.Read;
import nodos.Sentencia;
import nodos.Suma;
import nodos.Variable;

public class InterpreteVisitor implements Visitor {

	private BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
	private Map<String, Integer> memory = new HashMap<String, Integer>();
	
	@Override
	public Object visit(Programa a, Object param) {
		for(Sentencia s: a.sentencias) {
			s.accept(this,null);
		}
		return null;
	}

	@Override
	public Object visit(Asignacion a, Object param) {
		int valor = (Integer) a.expr.accept(this, null);
		memory.put(a.variable.name, valor);
		return null;
	}

	@Override
	public Object visit(Print a, Object param) {
		Integer valor = (Integer)a.expr.accept(this, null);
		System.out.println(valor);
		return null;
	}

	@Override
	public Object visit(Read r, Object param) {
		int valor;
		System.out.print("Introduzca el valor para la variable " + r.var.name + ": ");
		try {
			valor = Integer.parseInt(consola.readLine());
		} catch (Exception e) {
			valor = 0;
		}
		memory.put(r.var.name, valor);
		return null;
	}

	@Override
	public Object visit(Division a, Object param) {
		int valor = ((Integer)a.left.accept(this, null) / (Integer)a.right.accept(this, null));
		return valor;
	}

	@Override
	public Object visit(Suma a, Object param) {
		int valor = ((Integer)a.left.accept(this, null) + (Integer)a.right.accept(this, null));
		return valor;
	}

	@Override
	public Object visit(Producto a, Object param) {
		int valor = ((Integer)a.left.accept(this, null) * (Integer)a.right.accept(this, null));
		return valor;
	}

	@Override
	public Object visit(ConstanteInt s, Object param) {
		return Integer.parseInt(s.valor);
	}

	@Override
	public Object visit(Variable s, Object param) {
		Integer valor = memory.get(s.name);
		if(valor == null) {
			valor = 0;
		}
		return valor;
	}

}
