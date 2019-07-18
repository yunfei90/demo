/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 除法运算
 * 
 * @author zhangyunfei
 *
 */
public class DivisionOperator extends AbstractOperator {

	public DivisionOperator(String leftValue) {
		super(leftValue);
	}

	@Override
	public double calc(String rightValue) {

		leftValue = leftValue.divide(new BigDecimal(rightValue));
		
		return leftValue.doubleValue();
	}

}
