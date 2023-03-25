package com.enumber;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface edata
{
	void m1();
}
class Empdata
{
	
}
class A
{
	void data_Records_FromDatabase()
	{
		System.out.println("Methods- of Class - A");
	}
}
class B extends A
{
	@Deprecated
	void myrecord() {
		System.out.println("no Use Now");
	}
	@Override
	void data_Records_FromDatabase()
	{
		@SuppressWarnings({ "rawtypes", "unused" })
		List l1 = new ArrayList();
		System.out.println("Methods- of Class - B");
	}
}
public class Anota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();	
		a.data_Records_FromDatabase();
		a.myrecord();
	}
}
