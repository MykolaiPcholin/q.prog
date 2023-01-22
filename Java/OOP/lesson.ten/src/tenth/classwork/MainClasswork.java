package tenth.classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainClasswork {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("j", "Java");
		map.put("t", "the");
		map.put("b", "best");
		
		System.out.println(map);
		
		String res1 = map.get("t");
		String res2 = map.get("a");
		System.out.println(res1 + " " + res2);
		
		map.put("j", "JS");
		System.out.println(map);
		
		for(String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}
		
		map.remove("b");
		System.out.println(map);
		
		
		List<Integer> list = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < 15; i++) {
			list.add(rnd.nextInt(10));
		}
		System.out.println(list);
		
		Map<Integer, Integer> stat = new HashMap<>();
		for (Integer number : list) {
			Integer n = stat.get(number);
			if (n == null) {
				stat.put(number, 1);
			} else {
				stat.put(number, ++n);
			}
		}
		System.out.println(stat);
	}

}
