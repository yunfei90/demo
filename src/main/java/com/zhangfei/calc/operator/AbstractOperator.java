/**
 * 
 */
package com.zhangfei.calc.operator;

import java.math.BigDecimal;

/**
 * 二元运算符
 * 
 * @author zhangyunfei
 *
 */
public abstract class AbstractOperator implements IOperator {

	protected BigDecimal leftValue;

	public AbstractOperator(String leftValue) {
		this.leftValue = new BigDecimal(leftValue);
	}

}
