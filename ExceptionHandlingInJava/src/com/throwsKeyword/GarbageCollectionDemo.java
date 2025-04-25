package com.throwsKeyword;

public class GarbageCollectionDemo{
	public void finalize()
	{
		System.out.println("Object -> "+this);
	}
	public static void main(String[] args) {
		GarbageCollectionDemo a1 = new GarbageCollectionDemo();
		System.out.println("a1 -> "+a1);
		GarbageCollectionDemo a2 = new GarbageCollectionDemo();
		System.out.println("a2 -> "+a2);
		GarbageCollectionDemo a3 = new GarbageCollectionDemo();
		System.out.println("a3 -> "+a3);
		a1 = a2;
		a2 = a3;
		System.out.println("a1 -> "+a1);
		System.out.println("a2 -> "+a2);
		System.gc();
	}
}
