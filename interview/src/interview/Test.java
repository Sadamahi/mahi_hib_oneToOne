package interview;

import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		/*
		 * IntBinaryOperator u = (i,j)-> i*j; System.out.println(u.applyAsInt(4,5));
		 */
		BiPredicate<Integer,Integer>  bi= (i,j)-> i>j;
		System.out.println(bi.test(4, 5));
	}

}