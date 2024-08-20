package com.haruns._10_AbstractClass;

public class Runner {
	public static void main(String[] args) {
		Kedi tekir=new Kedi("Tekir", 60, 4);
		tekir.sesCikar();
		
		Kopek karabas=new Kopek("Karabas", 110, 6);
		karabas.sesCikar();
		
		Hayvan h1=new Kedi("Sarman", 65, 5);
		h1.sesCikar();
		
		h1=new Kopek("Jolly", 120, 7);
		h1.sesCikar();
		
		h1=new Kus("Duman",20,1);
		h1.sesCikar();
	}
}