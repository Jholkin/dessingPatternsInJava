package Interpreter.numRomanos;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String romano = "XXI";
		
		Context context = new Context(romano);
		
		// Construimos el árbol
		ArrayList<Expresion> tree = new ArrayList<Expresion>();
		tree.add(new TenExpression());
		tree.add(new OneExpression());
		
		// Lo interpretamos
		Iterator<Expresion> it = tree.iterator();
		while(it.hasNext()) {
			Expresion exp = it.next();
			exp.interpret(context);
		}
		
		System.out.println(context.getOutput());
		
	}

}
