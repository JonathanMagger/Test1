package com.make;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Visa
{
	int passport_number;
	String passport_name;
	String passport_city;
	public Visa (int number, String name, String city) {
		//local into Instance
		this.passport_number = number;
		this.passport_name = name;
		this.passport_city = city;
	}
}
public class Lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Collection List in Generic form
		List<Visa> l1 = new ArrayList<Visa>();
		l1.add(new Visa(101,"rob","jakarta"));
		l1.add(new Visa(102,"Arya","jakarta"));
		l1.add(new Visa(103,"wabula","jember"));
		l1.add(new Visa(104,"Aryani","jakarta"));
		l1.add(new Visa(105,"Bayu","Bandung"));
		l1.add(new Visa(106,"Dia","Purwakarta"));
		l1.add(new Visa(107,"Akira","Jombang"));
		l1.add(new Visa(108,"bonbon","Bekasi"));
		
		Collections.sort(l1,(a1,a2)->{
			return a1.passport_city.compareToIgnoreCase(a2.passport_city);
		});
		
		for (Visa vv:l1)
		{
			System.out.println(vv.passport_number+"--"+vv.passport_name+"--"+vv.passport_city);
		}
	}

}
