
public class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public Node moveLeftOrRight(int value) {
		if(value > this.value) {
			return this.right;
		}else {
			return this.left;
		}
	}
}
