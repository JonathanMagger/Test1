package com.enumber;

public class Enpro {
	public enum Animal {ANEMONE, BABOON, Chipmunk, Donkey, Eagle}
	public enum Plant {ALOE(101), BERRY(213), CACTUS(321), DANDLELION(425), EUCALYPTUS(501),FUCHSIA(604);
		int values;
		Plant(int a){
			this.values=a;} //SEMICOLON
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//traversed enum
		for(Animal ww:Animal.values()) {
			System.out.println("Animal is : "+ww);}
		System.out.println();
			//Value of
			System.out.println("Value of Animal is " +Animal.valueOf("BABOON"));
			//ordinal
			System.out.println("Value of Animal is " +Animal.valueOf("BABOON").ordinal());
			System.out.println("Value of Animal is " +Animal.valueOf("Eagle").ordinal());
			Animal aa = Animal.Chipmunk;
			System.out.println();
			System.out.println("Value of Animal is " +aa);
			System.out.println("Value of Animal is " +aa.ordinal());
			System.out.println();
			//GETTING PARTICULAR VALUE
			Plant pp = Plant.FUCHSIA;
			System.out.println("Value of Plant is "+pp);
			System.out.println();
			//traversed Enum
			System.out.println();
			Plant pp2 = Plant.BERRY;
			System.out.println("Plant is "+pp2);
			System.out.println("Plant is "+pp2.values);
			System.out.println("Plant is "+pp.values);
			switch (pp2) {
			case ALOE:
				System.out.println("Plant is ALOE");
				break;
			case BERRY:
				System.out.println("Plant is BERRY");
				break;
			case CACTUS:
				System.out.println("Plant is CACTUS");
				break;
			case DANDLELION:
				System.out.println("Plant is DANDELION");
				break;
			case EUCALYPTUS:
				System.out.println("Plant is EUCALYPTUS");
				break;
			case FUCHSIA:
				System.out.println("Plant is FUCHSIA");
				break;
			default:
				System.out.println("ITS NOT A PLANT");
				break;	
			}
			System.out.println();
			//traversed enum
			for(Plant CC:Plant.values()) {
				System.out.println("Index "+CC.ordinal()+" Plant is : "+CC+ " -- " +"Value is " + CC.values );}
	}

}
