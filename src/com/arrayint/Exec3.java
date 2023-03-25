package com.arrayint;

import java.util.Arrays;

class Plantae{
	public void status() {
		System.out.println("Kingdom");
	}
}
class Dycotyl extends Plantae{
	public void status() {
		System.out.println("Class");
	}
}
class Salak extends Dycotyl{
	public void status() {
		System.out.println("Species");
	}
}
public class Exec3 {

	public static void main(String[] args) {
		
		Plantae [] p = new Plantae[3];
		p[0] = new Plantae();
		p[1] = new Dycotyl();
		p[2] = new Salak();
		
		for (Plantae pp : p)
		{
			System.out.println(pp);
		}
		
		for (Plantae pp : p)
		{
			pp.status();
		}
		System.out.println(Arrays.toString(p));
	}

}
