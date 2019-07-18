/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 取余运算
 * 
 * @author zhangyunfei
 *
 */
public class RemainingOperator extends AbstractOperator {

	public RemainingOperator(String leftValue) {
		super(leftValue);
	}

	@Override
	public double calc(String rightValue) {
		
		leftValue = new BigDecimal(leftValue.longValue() % Long.valueOf(rightValue));
		return leftValue.doubleValue();
	}

}
