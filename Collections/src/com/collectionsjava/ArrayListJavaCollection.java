package com.collectionsjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJavaCollection {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//creating arraylist
		list.add("Ravi");//adding obj in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Vijay");
		//traversing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
