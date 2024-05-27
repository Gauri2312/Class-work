package com.collectionsjava;

import java.util.Iterator;
import java.util.Vector;

public class VectorJava {

	public static void main(String[] args) {
		Vector<String> v=new Vector();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Ganima");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
