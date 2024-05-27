package com.datastructuresexamples;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> p=new PriorityQueue<>();
		p.offer(5);
		p.offer(1);
		p.offer(3);
		
		Integer highestPriority=p.poll();//removes and returns 1
		System.out.println(highestPriority);//output

	}

}
