
public class Tree {
	Node root;
	Node traverse;
	int size;
	int arrayIterator;
	
	Tree(){
		this.root = null;
		this.traverse = null;
		this.size = 0;
		this.arrayIterator = 0;
	}
	
	public void addNode(int value){
		if(this.root == null)
		{
			this.root = new Node(value);
			this.traverse = root;
		}else {
			while(this.traverse !=null) {
				this.traverse = this.traverse.moveLeftOrRight(value);
			}
			this.traverse = this.root;
		}
		this.size++;
	}
	
	public void inorderToArray(Node inorder, int[] data) {
		if(inorder!= null) {
			inorderToArray(inorder.left,data);
			data[this.arrayIterator] = inorder.value;
			this.arrayIterator+=1;
			inorderToArray(inorder.right,data);
		}
		if(this.arrayIterator == this.size)
		{
			this.arrayIterator = 0;
		}
	}

	public boolean inOrderSearch(Node root, int search){
		boolean found = false;
		if(root!= null) {
			found = inOrderSearch(root.left, search);
			if(found){
				return true;
			}
			if(root.value == search){
				return true;
			}
			found = inOrderSearch(root.right,search);
			if(found)
			{
				return true;
			}
		}
		return found;
	}

	public void removeNode(int value){
		Node node = getNodeToBeRemoved(value);
		Node min = getMinOfRightTree(node);
		System.out.println(min.value);
		node.value = min.left.value;
		min.left = null;
		this.size--;
	}

	Node getNodeToBeRemoved(int value){
		while(this.traverse.value != value){
			if(value < this.traverse.value){
				this.traverse = this.traverse.left;
			}else{
				this.traverse = this.traverse.right;
			}
		}
		Node search = this.traverse;
		this.traverse = this.root;
		return search;
	}

	Node getMinOfRightTree(Node node){
		while (node.left.left != null)
		{
			node = node.left;
		}
		return node;
	}
	
}
