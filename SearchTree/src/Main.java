
public class Main {
	
	public static void main(String[] args)
	{
		Tree bstOne = new Tree();
		bstOne.addNode(50);
		bstOne.addNode(45);
		bstOne.addNode(47);
		bstOne.addNode(42);
		bstOne.inorder(bstOne.root);
	}
}
