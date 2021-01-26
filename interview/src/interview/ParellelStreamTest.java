package interview;
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
public class ParellelStreamTest {
public static void main(String[] args) {
	List<Long> l = new ArrayList<>();
	for(long i =1;i< 10000000;i++)
		l.add(i);
	long startTime = System.currentTimeMillis();
    l.parallelStream().forEach(i->System.out.println(i));
     
     
	/*
	 * Iterator<Long> iterator = l.iterator(); while (iterator.hasNext()) {
	 * Long integer = (Long) iterator.next(); System.out.println(integer);
	 * 
	 * }
	 */
		 

	long endTime = System.currentTimeMillis();

	System.out.println("That took " + (endTime - startTime) + " milliseconds"+startTime+"  "+endTime);
}
}
