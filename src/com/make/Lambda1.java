package com.make;
@FunctionalInterface
interface Records
{
	int sales (int a, int b);
}

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//without return
		Records rr = (a,b) -> (a+b);
		System.out.println("Cost is : " +rr.sales(300, 180));
		System.out.println();

		//with return
		/*return (int)((a+b)*0.02)+a+b;
		a = 50
		b = 30
		Tax = 2%
		2/100 =0.02
		
		pro 1 + pro2 = 80
		Tax = 80*0.02 =3
		Total Tax amounty is : 80+3 =>83*/
		Records er = (c,d) -> {
			return (int)((c+d)*0.02)+c+d;
		};
		System.out.println(("Cost of : ")+ er.sales(300, 180));
		
		Records er1 = (c,d) ->((int)((c+d)*0.02)+c+d);

		System.out.println(("Cost of : ")+ er1.sales(300, 180));
		
	}

}
