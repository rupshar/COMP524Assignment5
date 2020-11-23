package assignment;

import main.lisp.parser.terms.ExpressionFactory;
import registerer.CustomOperationRegisterer;
import terms.CustomExpression;
import testables.java.testcases.Main;

public class CustomMain {
	
	public static void main(String[] args) {
		ExpressionFactory.setClass(CustomExpression.class);
		CustomOperationRegisterer.registerAll();
		main.Main.main(args);
	}

}
