package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class Test extends Parent {
	static int prev =0;
	public void p() {
		System.out.println("child");
	}
	public static void main(String[] args) {
		/*
		 * IntBinaryOperator u = (i,j)-> i*j; System.out.println(u.applyAsInt(4,5));
		 */
		/*
		 * BiPredicate<Integer,Integer> bi= (i,j)-> i>j; System.out.println(bi.test(4,
		 * 5));
		 */
		
		/*
		 * Function<Integer,String> f = (i)-> i+i+"sada";
		 * System.out.println(f.apply(4));
		 * 
		 * 
		 * IntFunction f1 = (i)-> i+i; System.out.println(f1.apply(4));
		 * 
		 * 
		 * UnaryOperator<Integer> u = (i)->i*i; System.out.println(u.apply(4));
		 * 
		 * 
		 * UnaryOperator<String> u1 = (i)->i+i; System.out.println(u1.apply("java"));
		 * 
		 * 
		 * BiFunction<Integer,Integer,Integer> bf = (i,j)-> i+j;
		 * System.out.println(bf.apply(4, 5)); BinaryOperator<Integer> bo =(i,j)-> i+j;
		 * System.out.println(bo.apply(40, 5));
		 * 
		 * IntPredicate ip = i->i>5; System.out.println(ip.test(44));
		 */
		List<String> l = Arrays.asList("Indore1", "Delhi","Indore2","Indore3");
	Optional<String> op=	l.stream().filter(i->i.startsWith("I")).findFirst();
		if(op.isPresent()) {
			System.out.println("found");
		}
//		System.out.println(op.orElseGet(()->"hello"));
		//op.ifPresent(System.out::println);
		
		System.out.println(op.orElse("sada"));
		try {
			System.out.println(op.orElseThrow(()->new Exception(" for vote your age is more than 17")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Optional<String> of = Optional.ofNullable("java");

		System.out.println(of.orElse("null value sis working"));;
	}

}