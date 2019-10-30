
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
	
}
