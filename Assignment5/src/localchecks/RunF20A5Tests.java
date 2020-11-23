package localchecks;

import gradingTools.comp524f20.assignment5.F20Assignment5Suite;
import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.Tracer;


public class RunF20A5Tests {

		public static void main(final String[] args) {
	// the following two lines should be uncommented if you do not understand why your tests fails
			Tracer.showInfo(true);
			GraderBasicsTraceUtility.setBufferTracedMessages(false);
			F20Assignment5Suite.main(args);
		}
	
}
