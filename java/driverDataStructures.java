import test.summer.datastructures.linkedList ;

public class driverDataStructures {
	public static void main(String[] args) {
		linkedList list = new linkedList(1);
		list.addElement(2);
		list.addElement(3);
		list.addElement(4);
		list.printElements();
		list.addElement(5);
		list.printElements();
	}
}
