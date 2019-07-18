/**
 * 
 */
package com.zhangfei.calc.operator;

/**
 * 运算器工厂
 * 
 * @author zhangyunfei
 *
 */
public final class Operators {

	public static IOperator create(String cmd, String leftValue) {

		switch (cmd) {

		case "%":
			return new RemainingOperator(leftValue);
		case "+":
			return new AdditionOperator(leftValue);
		case "-":
			return new SubtractionOperator(leftValue);
		case "×":
			return new MultiplicationOperator(leftValue);
		case "÷":
			return new DivisionOperator(leftValue);
		}

		throw new IllegalArgumentException("不支持此运算符");

	}
	
	public static IOperator create(String cmd, Double leftValue) {
		
		return create(cmd, leftValue.toString());
	}

}
