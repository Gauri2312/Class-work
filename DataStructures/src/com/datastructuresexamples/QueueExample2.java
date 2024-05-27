package com.datastructuresexamples;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {

	public static void main(String[] args) {
		Queue<String> q=new ArrayDeque<>();
		q.add("Apple");
		q.add("Banana");
		q.add("Cherry");
		q.add("Watermelon");
		System.out.println(q);
		String first=q.poll();
		
		System.out.println(first);
	    System.out.println(q);

	}

}
