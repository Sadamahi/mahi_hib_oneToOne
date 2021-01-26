package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test {
	static char d;

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0 };

		int z = 0;
		int o = 0;
        
		for (int i = 1; i < arr.length; i++) {
			int count =0;
			if(arr[i-1]==arr[i]) {
				count++;
				if(arr[i] == 0 && z<count)
					z=count;
				if(arr[i] == 1 && o<count)
					o=count;
				
			}else {
				if(arr[i] == 0 && z<1)
					z=1;
				if(arr[i] == 0 && o<1)
					o=1;
					
				
			}
              
   		}
		System.out.println(o+"  "+z);
	}
}