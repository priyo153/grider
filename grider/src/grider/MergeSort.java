package grider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	static List<Integer> merge(List<Integer> a1,List<Integer> a2) {
		
		List<Integer> newarr=new ArrayList<>();
		//System.out.println("before merge "+a1+" "+a2);
		while(!a1.isEmpty() && !a2.isEmpty()) {
			
			if(a1.get(0)<a2.get(0)) {
				newarr.add(a1.get(0));
				a1.remove(0);
			}
			else {
				newarr.add(a2.get(0));
				a2.remove(0);
			}
			
			
		}
		newarr.addAll(a1);
		newarr.addAll(a2);
		//System.out.println("after merge "+newarr);
		return newarr;
		
	}
	
	static List<Integer> sort(List<Integer> l1 ) {
		
		if(l1.size()==1) {
			return l1;
		}
		
		int mid= (int) Math.floor((l1.size())/2);
		List<Integer> left=new ArrayList<>(l1.subList(0, mid));
		List<Integer> right=new ArrayList<>(l1.subList(mid, l1.size()));
	
		
		return merge(sort(left),sort(right));
		
	}

	public static void main(String[] args) {
		
		List<Integer> arr=Arrays.asList(new Integer[]{6,5,7,3,1,2,9,8,4});
		
		
		System.out.println(arr);
		System.out.println(sort(arr));
		

	}

}
