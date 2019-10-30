
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
			if(this.right == null)
			{
				this.addRightChild(value);
				return null;
			}else{
				return this.right;
			}
		}else {
			if(this.left == null)
			{
				this.addLeftChild(value);
				return null;
			}else{
				return this.left;
			}
		}
	}

	public void addLeftChild(int value){
		this.left = new Node(value);
	}

	public void addRightChild(int value){
		this.right = new Node(value);
	}
}
