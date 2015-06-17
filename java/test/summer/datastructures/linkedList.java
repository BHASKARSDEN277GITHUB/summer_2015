package test.summer.datastructures ;

public class linkedList {
	linkedListNode  head ;
	linkedListNode currentNode;
	public linkedList(int value) {
		System.out.println("Created new Linked List");
		head=new linkedListNode(value);
		currentNode=head;
	}
	
	public void addElement(int value) {
		currentNode.pointer=new linkedListNode(value);
		currentNode=currentNode.pointer;
		currentNode.value=value;
		currentNode.pointer=null;
		System.out.println("Added value "+ value);
	}
	
	public void printElements() {
		System.out.println("Printing elements of linked list");
		linkedListNode temp=head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.pointer;
		}
	}

}
