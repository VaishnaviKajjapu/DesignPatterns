package com.StrategyPattern;


	interface Strategy {
	   public int doOperation(int num1, int num2);

}

	class Context {
	   private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }

}

	
	 class OperationSubtract  implements Strategy{
	   public int doOperation(int num1, int num2) {
		      return num1 - num2;
		   }

}

	 class OperationAdd  implements Strategy{
	   public int doOperation(int num1, int num2) {
		      return num1 + num2;
		   }

}

public class StrategyPattern {
	public static void main(String[] args) {
	      Context context = new Context(new OperationAdd());		
	      System.out.println("1254 + 1255 = " + context.executeStrategy(1254, 1255));

	      context = new Context(new OperationSubtract());		
	      System.out.println("1290 - 1254 = " + context.executeStrategy(1290,1254));

	}
}
