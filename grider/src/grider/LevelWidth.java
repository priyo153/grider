package grider;

import java.util.ArrayList;
import java.util.List;

public class LevelWidth {

	static List<Integer> levelWidth(TreeNode n) {

		List<TreeNode> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();


		list1.add(n);
		//list1.add(new TreeNode(-1));
		
		boolean flag = true;
		while (!list1.isEmpty()) {

			TreeNode temp = list1.get(0);
			
			if (temp.data == -1) {
				flag=true;
				list1.remove(temp);
				list2.add(-1);
				continue;

			}
			
			if (flag == true) {
				list1.add(new TreeNode(-1));
				flag = false;

			}

			list2.add(temp.data);
			list1.remove(temp);
			list1.addAll(temp.children);
			
			
			

		}
		return list2;

	}

	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(1);
		TreeNode current = root;
		TreeNode prev = current;
		current.add(2);
		current.add(3);
		current.add(4);

		current = current.children.get(0);
		current.add(5);
		current.add(6);
		current = prev;
		current = current.children.get(1);
		current.add(7);
		current.add(8);
		current = current.children.get(1);
		current.add(9);
		current.add(10);
		current = current.children.get(0);
		current.add(11);
		current.add(12);

		List<Integer> bfs=levelWidth(root);
		List<Integer> count=new ArrayList<>();
		
		int len=0;
		for(int i:bfs) {
			
			if(i==-1) {
				count.add(len);
				len=0;
				continue;
			}
			
			len++;
		}
	
		System.out.println(count);

	}

}
