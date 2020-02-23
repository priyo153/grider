package grider;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
	int data;
	List<TreeNode> children;
	
	TreeNode(int val){
		data=val;
		children=new ArrayList<>();
		
	}
	
	void add(int val) {
		if(children==null) {
			
		}
		children.add(new TreeNode(val));
	}
	

	
	void remove(int val) {
		children.removeIf(n -> (n.data==val));
	}
}

public class Tree {
	
	
	TreeNode root;
	
	Tree(int val){
		root=new TreeNode(val);
	}
	
	TreeNode getRoot() {
		return root;
	}

}
