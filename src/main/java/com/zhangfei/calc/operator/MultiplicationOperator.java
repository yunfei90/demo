/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 乘法运算
 * 
 * @author zhangyunfei
 *
 */
public class MultiplicationOperator extends AbstractOperator {

	public MultiplicationOperator(String leftValue) {
		super(leftValue);
	}

	@Override
	public double calc(String rightValue) {
		leftValue = leftValue.multiply(new BigDecimal(rightValue));
		return leftValue.doubleValue();
	}

}
