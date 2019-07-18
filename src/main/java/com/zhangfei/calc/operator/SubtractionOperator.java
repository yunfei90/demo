/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 减法运算
 * 
 * @author zhangyunfei
 *
 */
public class SubtractionOperator extends AbstractOperator implements IOperator {

	public SubtractionOperator(String leftValue) {
		super(leftValue);
	}

	@Override
	public double calc(String rightValue) {
		leftValue = leftValue.subtract(new BigDecimal(rightValue));

		return leftValue.doubleValue();
	}

}
