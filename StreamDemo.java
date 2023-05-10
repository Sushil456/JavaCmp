package com.practiceOops.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Map.Entry;
//import java.util.PriorityQueue;
//import java.util.Stack;
//import java.util.TreeMap;
//import java.util.TreeSet;

//public class Student {
//	public static void main(String[] args) {
//		
		
		
//		int[] numbers = {1,2,3,4,5,6,7,8,9};
//		
//		for(int i : numbers) {
//			System.out.println("count :" + i);
//		}
		
		
//		int arr[][] = {{2,4,7,}, {3,6,3}, {2,6,1}, {0,2,5}};
//		for (int i = 0;i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
//		Collections in Java 
		
//		List<Integer> arrayList = new ArrayList<>(5);
//		
//		for(int i = 1; i<=5; i++) {
////			System.out.println(arrayList);
//			arrayList.add(i);
//			
//			
//		}
//		
//		System.out.println(arrayList);
//		arrayList.remove(3);
//		
//		
//		for(int i = 0; i<arrayList.size(); i++) {
//			System.out.print(arrayList.get(i) + " ");
//
//		}
		
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.addFirst("S");
//		
//		list.add("U");
//		list.add("S");
////		list.add("H");
//		list.add("I");
//		
//		list.addLast("L");
//		
//		list.add(3, "H");
//		
//		System.out.println(list);
//		
//		
//		list.removeFirst();
//		list.removeLast();
//		
//		System.out.println(list);
		
//		HASHSET :elements accessed in random order
		
//		HashSet<String> hashSet = new HashSet<String>();
//		
//		hashSet.add("S");
//		hashSet.add("U");
//		hashSet.add("S"); // it will not be added as it is duplicate of first s
//		hashSet.add("H");
//		
//		System.out.println(hashSet);
//		
//		hashSet.remove("S");
//		hashSet.remove(2);
//		
//		System.out.println(hashSet);
//		
//		for(String item: hashSet) {
//			System.out.println(item);
//		}
//		
		
//		TREESET : Sorting & Duplicate 
//		
//		TreeSet<String> treeSet = new TreeSet<>();
//		treeSet.add("S");
//		treeSet.add("U");
//		treeSet.add("S");
//		treeSet.add("H");
//		treeSet.add("I");
//		treeSet.add("L");
//		
//		System.out.println(treeSet);
		
		
//		MAPS : for key value sort kind of arrangements; 
		
//		Map<String, Integer> map = new HashMap<>();
//		
//		map.put("S", 30);
//		map.put("U", 20);
//		map.put("S", 25);
//		map.put("H", 50);
//		
//		System.out.println("size of map is : " + map.size());
//		System.out.println(map);
//		
//		if(map.containsKey("S")) {
//			Integer a = map.get("S");
//			System.out.println("Value for key " + a);
//		}
//		
//		for(String key : map.keySet()) {
//			System.out.println("Key" + key + ",value: " + map.get(key));
//		}
//		
//		for(Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println("Key" + entry.getKey() + " , value " + entry.getValue());
//		}
//		
		
//	TREEMAP : Automatically Sort according to keys:  	
//		TreeMap<Integer, String> treeMap = new TreeMap<>();
//		
////		treeMap.put(0,  "S");
////		treeMap.put(2,  "B");
////		treeMap.put(1, "C");
////		
////		System.out.println(treeMap);
////		
//		treeMap.put(3, "S");
//		treeMap.put(9, "T");
//		treeMap.put(8, "B");
//		
//		System.out.println(treeMap);
		
//		Stacks : 
		
//		Stack<String> stack = new Stack<>();
//		stack.push("Sushil");
//		stack.push("Krishna");
//		stack.push("Kumar");
//		stack.push("Cisco");
//		
//		stack.push("Bangalore");
//		System.out.println(stack);
//		
//		String poppedElement = stack.pop();
//		System.out.println("Popped element : " + poppedElement);
//		System.out.println("Now the stack tlooks like : " + stack);
//		
//		System.out.println("top element is " + stack.contains("Sushil"));
//		System.out.println("top element is "+ stack.peek());
//		
//		for(String i : stack) {
//			System.out.println(i);
//		}
		
		
//		QUEUE : has concept of head and tail 
//		Queue<String> queue = new PriorityQueue<>();
//		queue.add("India");
//		queue.add("Pakistan");
//		queue.add("Germany");
//		queue.add("Russia");
//		queue.add("Bihar");
//		
//		
//		queue.forEach(element -> System.out.print(element + " "));
//		System.out.println(queue.toString());
//		
//		System.out.println("head of elements is "  + queue.peek());
//		
		
	
		
		
//	}
//
//}

//	CLASSES  
// ........///////////////////////////////////////////
//public class Student{
//	
////	Attributes or Properties  
//	String name; 
//	int age ; 
//	String address; 
//	
////	Constructor : to initialize the classes and objects
//	public Student(String name , int age, String address) {
//		this.name = name; 
//		this.age  = age; 
//		this.address = address; 
//		}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
//	}
//
//	public static void main(String[] args) {
//		Student sushil = new Student("Sushil", 23, "Cisco");
//		System.out.println(sushil.getName());
//		System.out.println(sushil.getAddress());
//		System.out.println(sushil.getAge());
//		
//	}
//}

//public class Cuboid{
//	
//	int width;
//	int height; 
//	int depth;
//	
////	Can create multiple constructor 
//	Cuboid(int width, int height, int depth){
//		this.width = width;
//		this.height = height; 
//		this.depth = depth;
//		
//	}
//	
//	Cuboid(int width, int height){
//		this.width = width;
//		this.height = height;
//		this.depth = 10;
//		
//	}
//	
//	Cuboid(int dimension){
//		width  = dimension;
//		height = dimension;
//		depth = dimension;
//		
//		
//	}
//	
//	Cuboid(){
//		this.width = 10;
//		this.height = 10 ; 
//		this.depth = 10;
//		
//	}
//	
//	int volume() {
//		return width*height*depth;
//	}
//	
//	public static void main(String args[]) {
//		
//		int volume;
//		Cuboid stdCuboid = new Cuboid(10, 30, 15);
//		volume = stdCuboid.volume();
//		System.out.println("volume of a simple cuboid is : " + volume);
//		
//		Cuboid cuboidwithDefaults = new Cuboid(10, 20);
//		volume = cuboidwithDefaults.volume();
//		System.out.println("volume " + volume);
//		
//		Cuboid cube = new Cuboid(10);
//		volume = cube.volume();
//		System.out.println("volume of cube is : " + volume);
//		
//		
////		Remember java will provide default constructor so if no parametrized constuctor then it will create one 
////		It set the default values to each data type
//		
//		Cuboid defaultCuboid = new Cuboid();
//		volume = defaultCuboid.volume();
//		System.out.println("volume of default is: " + volume);
//		
//		
//	}	
//}


//STREAMS : help you to iterate through collection, manipulate 

public class StreamDemo{
	public static void main (String args[]) {
//		List<Integer> numberList = new ArrayList<>();
//		numberList.add(10);
//		numberList.add(20);
//		numberList.add(30);
//		numberList.add(40);
		
//		List<Integer> squaresList = new ArrayList<>();
//		for(Integer i: numberList) {
//			squaresList.add(i*i);
//		}
		
//		It can be written in only few lines 
		//Streaming 
		
//		List<Integer> squaresList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println(squaresList);
//		
//		HashSet<Integer> squareSet = new HashSet<>();
//		for(Integer i : numberList) {
//			squareSet.add(i*i);
//		}
//		System.out.println(squareSet);

		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("scala");
		languages.add("basic");

//		List<String> filterResult = new ArrayList<>();
//		for(String s : languages) {
//			if(s.startsWith("p")) {
//				filterResult.add(s);
//			}
//		}
//		
//		This same above code in one line using stream 
//		List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
//				System.out.println("Languages starting with 'p' is : " + filterResult);
		
//		Using Sorted
//		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("languages sorted alphabetically:" + sortedList);
//		
		
//		Using ForEach 
//		System.out.println("printing all elements one by one: ");
//		languages.stream().forEach(y-> System.out.println("element is : " +y));
//		
//		streams Reduce functionality : Identity, Accumulator & Combiner
		
//		int sum = numberList.stream().reduce(0, (ans,i )-> ans +i);
//		System.out.println("Sum of all elements in the numberList: " + sum);
			
//		Access Modifiers : 
//		public, protected, private
		
		
//		Inheritance 
		
		
	}
}





























