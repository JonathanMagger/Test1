package com.coba;

import java.math.BigDecimal;

class D{
	  int x;
	 void increment()
	 {
		 x++;
	 }
}
class Output {

	public static void main(String args[]) {
		byte a[] = {65,66,67,68,69,70};
		byte b[] = {71,72,73,74,75,76};
System.arraycopy(a, 1, b, 3, 2);
System.out.println(new String(a)+ " " +new String(b));

double c = 0.03;
double d =0.02;
double e = c-d;
double f = d-c;
System.out.println(e);
System.out.println(f);

BigDecimal a1= new BigDecimal("0.03");
BigDecimal a2= new BigDecimal("0.02");
BigDecimal a3=a2.subtract(a1);
System.out.println(a3);
	}
	

}
