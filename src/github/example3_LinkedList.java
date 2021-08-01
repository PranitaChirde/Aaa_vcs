package github;

import java.util.LinkedList;

public class example3_LinkedList {
public static void main(String[] args) {
	
	LinkedList ll=new LinkedList();
	ll.add("abc");
	ll.add(100);
	ll.add('A');
	ll.add(65.5f);
	ll.add(100);   //4
	ll.add(null);
	ll.add(null);
		
	System.out.println(ll);
	System.out.println(ll.isEmpty());  //false
	System.out.println(ll.contains('A')); //true
	System.out.println(ll.indexOf(100));  //1
	System.out.println(ll.lastIndexOf(100));  //4
	System.out.println(ll.get(2));    //A
	
	System.out.println(ll);
	ll.add(4, 200);       //insert info in between linkedlist
	System.out.println(ll);
	ll.remove(4);      //remove info in between linkedlist
	System.out.println(ll);
	
	
}
}
