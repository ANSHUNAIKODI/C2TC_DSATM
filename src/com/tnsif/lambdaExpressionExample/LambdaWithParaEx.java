package com.tnsif.lambdaExpressionExample;

public class LambdaWithParaEx {
	public static void main(String[] args) {
		message m=(name)->
		{
			System.out.println("Hello world"+name);
		};
		m.greet("Anshu");
		
		cube c=(a)->
		{
			return (a*a*a);
			
		};
		System.out.println(c.calculate(2));

	}


	}