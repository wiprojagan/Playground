package aiholmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Holmes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int stones=sc.nextInt();
		int layers=sc.nextInt();
		int r=0;
		List<Map<Integer,Integer>> reverseMaps = new ArrayList<Map<Integer,Integer>>();
		for(int i=0;i<layers;i++){
			Map<Integer,Integer> map=null;
			for(int j=0;j<stones;j++){
				map=new HashMap<>();
				int val=sc.nextInt();
				map.put(j, val);
			}
			reverseMaps.add(map);
		}
		int min=0;
		for(int i=0;i<stones+layers+1;i++){
			Map<Integer,Integer> map=reverseMaps.get(i);
			min=min+Collections.min(map.values());
			map.
		}
	}
}
