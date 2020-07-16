package com.demo.expression;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#expressions
 * https://www.jianshu.com/p/6a0a1fa453c8
 *
 */
public class ExpressionMain {

	public static void main(String[] args) {

//		spelExpression();
		literalExpression();
	}

	private static void literalExpression() {


		String originString = "hello,#{ #user }";
		Expression expression = new LiteralExpression(originString);
		EvaluationContext evaluationContext = new StandardEvaluationContext();
		evaluationContext.setVariable("user", "coderLi");
		System.out.println(expression.getValue(evaluationContext));
		System.out.println(expression.getValue());

	}

	private static void spelExpression() {

		String originString = "hello,#{ #user }";
		ExpressionParser expressionParser = new SpelExpressionParser();
		EvaluationContext evaluationContext = new StandardEvaluationContext();
		evaluationContext.setVariable("user", "coderLi");
		ParserContext parserContext = new TemplateParserContext();
		Expression expression = expressionParser.parseExpression(originString, parserContext);
		System.out.println(expression.getValue(evaluationContext));
		System.out.println(expression.getValue());

	}

}
