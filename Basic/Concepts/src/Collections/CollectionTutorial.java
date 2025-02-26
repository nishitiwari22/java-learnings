// import java.util.ArrayList;
// import java.util.List;

// public class CollectionTutorial{
// 	public static void main(String[] args)

// 	//package
// 	//Interface
// 	//Class
// 	//Wrapper Class
// 	//Generics
// 	//Objects
// 	//Iterator
// 	//Collection
// 	//Arrays
// 	//Comparator

// 	//List
// 	List list = new ArrayList()

// 	ArrayList<Integer> list = new ArrayList<Integer>();
// 	list.add(10);
// 	list.add(20);
// 	list.add(30);
// 	list.add(index: 2, element: 25);
// 	System.out.println(list)	
// 	list.add(10);

// 	//LinkedList
// 	List linkedList = new LinkedList<Integer>();
// 	linkedList.add(index:0, element: 20);
// 	linkedList.add(10);
// 	linkedList.add(index: 1, element: 15);
// 	linkedList.remove(index:1);
// 	System.out.println(linkedList);

// 	//Vector	
// 	Vector<String> vector = new Vector<String>();
// 	vector.add(10);
// 	vector.add(20);
// 	vector.add(30);
// 	System.out.println("Vector = "+ vector);
// 	vector.clear();
// 	System.out.println(vector);

// 	//Stack	
// 	Stack<Integer> stack = new Stack<Integer>();
// 	stack.push(10);
// 	stack.push(20);
// 	stack.push(30);
// 	System.out.println("Stack = "+ stack);
// 	stack.pop();
// 	System.out.println(stack.peek());

// 	//Queue = ?
// 	Queue<Integer> queue = new LinkedList<Integer>();

// queue.add(10);
// queue.add(10);
// queue.add(10);
// queue.add(10);

// 	//PriorityQueue
// 	//DeQueue
// 	//ArrayQueue

// 	//Set = ?
// 	//Hashset
// 	Set<Integer> set = new HashSet<Integer>();
// 	set.add(10);
// 	set.add(20);
// 	set.add(30);
// 	System.out.println(set);

// 	//LinkedHashSet
// 	LinkedHashSet<Integer> llset = new LinkedHashSet();
// 	llset.add(5);
// 	llset.add(2);
// 	llset.add(2);
// 	llset.add(10);
// 	System.out.println(llset);
// 	boolean bl = llset.contains(2);
// 	System.out.println("2 is present or not = " +b1);

// 	//TreeSet
// 	TreeSet<Integer> tset = new TreeSet<Integer>();
// 	tset.add(20);
// 	tset.add(5);
// 	tset.add(10);
// 	tset.add(10);
// 	System.out.println(llset);
// 	boolean bl = llset.contains(2);
// 	System.out.println("2 is present or not = " +b1);
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;
// import java.util.Set;
// import java.util.Stack;
// import java.util.TreeSet;
// import java.util.Vector;

// // Ternary

// // boolean bl = (2>3) ? true : false;
// // System.out.println(bl);

// // int res = (2>3) ? 2+3 : 2-3;
// // System.out.println(res);

// // int num = 6;
// // boolean even = (num%2==0) ? true : false;
// // System.out.println("Is even : "+even);

// // int num1 = 2;
// // int num2 = 4;
// // int num3 = 6;

// // boolean max = (num1 > num2) && (num2 > num3) 
// // System.out.println(max);

// ########### Kunal Kushwaha's Collections ######//#endregion

public class CollectionTutorial {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(89);

        System.out.println(list2);
    }


    List<Integer> vector = new Vector<>();

    vector.add(34);
    vector.add(78);
    vector.add(55);
    vector.add(89);

    System.out.println(vector);
}}