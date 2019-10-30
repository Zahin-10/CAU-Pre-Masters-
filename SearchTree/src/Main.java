import java.util.Arrays;

public class Main {
	
	public static void main(String[] args)
	{
		Tree bstOne = new Tree();
		bstOne.addNode(50);
		bstOne.addNode(45);
		bstOne.addNode(47);
		bstOne.addNode(46);
		bstOne.addNode(42);
        bstOne.removeNode(45);
		int[] myTreeArray = new int[bstOne.size];
		bstOne.inorderToArray(bstOne.root,myTreeArray);
		System.out.println(Arrays.toString(myTreeArray));
		System.out.println(bstOne.inOrderSearch(bstOne.root,46));
	}
}
