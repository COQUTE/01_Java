package edu.kh.op.practice.run;

import edu.kh.op.practice.OperatorPractice;
import edu.kh.op.practice.OperatorPractice2;
import edu.kh.op.practice.OperatorPractice3;

public class PracticeRun {

	public static void main(String[] args) {

		OperatorPractice op1 = new OperatorPractice();
		OperatorPractice2 op2 = new OperatorPractice2();
		OperatorPractice3 op3 = new OperatorPractice3();
		
		op1.practice1();
		op1.practice2();
		op1.practice3();
		
		op2.practice1();
		
		op3.practice1();
		op3.practice2();
		op3.practice3();
	}

}