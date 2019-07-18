/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 加法运算
 * 
 * @author zhangyunfei
 *
 */
public class AdditionOperator extends AbstractOperator implements IOperator {

	public AdditionOperator(String leftValue) {
		super(leftValue);
	}

	@Override
	public double calc(String rightValue) {

		leftValue = leftValue.add(new BigDecimal(rightValue));
		return leftValue.doubleValue();
	}

}
