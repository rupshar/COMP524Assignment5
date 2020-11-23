package assignment;

import assignment.CustomMain;
import evaluators.AndEvaluator;
import evaluators.OrEvaluator;
import evaluators.CondEvaluator;
import evaluators.EvalEvaluator;
import evaluators.NotEvaluator;
import evaluators.GTEEvaluator;
import evaluators.GTEvaluator;
import evaluators.LTEEvaluator;
import evaluators.LTEvaluator;
import evaluators.ListEvaluator;
import evaluators.LoadEvaluator;
import evaluators.QuoteEvaluator;
import registerer.CustomOperationRegisterer;
import terms.CustomExpression;
import main.ClassRegistry;
import main.lisp.evaluator.Evaluator;
import main.lisp.evaluator.OperationRegisterer;
import main.lisp.parser.terms.SExpression;

public class MainClassRegistry implements ClassRegistry {

	@Override
	public Class<? extends Evaluator> getAndEvaluator() {
		// TODO Auto-generated method stub
		return AndEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getCondEvaluator() {
		// TODO Auto-generated method stub
		return CondEvaluator.class;
	}

	@Override
	public Class<? extends OperationRegisterer> getCustomOperationRegisterer() {
		// TODO Auto-generated method stub
		return CustomOperationRegisterer.class;
	}

	@Override
	public Class<? extends Evaluator> getEvalEvaluator() {
		// TODO Auto-generated method stub
		return EvalEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getGTEEvaluator() {
		// TODO Auto-generated method stub
		return GTEEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getGTEvaluator() {
		// TODO Auto-generated method stub
		return GTEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getLTEEvaluator() {
		// TODO Auto-generated method stub
		return LTEEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getLTEvaluator() {
		// TODO Auto-generated method stub
		return LTEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getListEvaluator() {
		// TODO Auto-generated method stub
		return ListEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getLoadEvaluator() {
		// TODO Auto-generated method stub
		return LoadEvaluator.class;
	}

	@Override
	public Class<?> getMain() {
		// TODO Auto-generated method stub
		return CustomMain.class;
	}

	@Override
	public Class<? extends Evaluator> getNotEvaluator() {
		// TODO Auto-generated method stub
		return NotEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getOrEvaluator() {
		// TODO Auto-generated method stub
		return OrEvaluator.class;
	}

	@Override
	public Class<? extends Evaluator> getQuoteEvaluator() {
		// TODO Auto-generated method stub
		return QuoteEvaluator.class;
	}

	@Override
	public Class<? extends SExpression> getStringFormattingSExpression() {
		// TODO Auto-generated method stub
		return CustomExpression.class;
	}

}
