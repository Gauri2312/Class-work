package com.datastructuresexamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList();
		q.add("Apple");
		q.add("Banana");
		q.add("Cherry");
		
		String first=q.poll();
		//String second=q.poll();
		
		System.out.println(first);
		//System.out.println(second);
	    System.out.println(q);
	}

}
