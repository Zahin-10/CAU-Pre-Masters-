
public class Tree {
	Node root;
	Node traverse;
	int size;
	
	Tree(){
		this.root = null;
		this.traverse = null;
		this.size = 0;
	}
	
	public void addNode(int value){
		if(this.root == null)
		{
			this.root = new Node(value);
			this.traverse = root;
		}else {
			while(this.traverse !=null) {
				this.traverse = traverse.moveLeftOrRight(value);
			}
			this.traverse = new Node(value);
			this.traverse = this.root;
		}
		this.size++;
	}
	
	public void inorder(Node inorder) {
		if(inorder.left!= null) {
			inorder(inorder.left);
		}
		
		System.out.println(inorder.value);
		
		if(inorder.right != null) {
			inorder(inorder.right);
		}
		
	}
	
	
	
	
}
