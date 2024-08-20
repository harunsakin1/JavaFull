package com.haruns._13_Interface;

public class Olcum {
					// Parametre'ye interface yazma.
	public void nemOlc(INemOlcer nemOlcer){
		System.out.println(nemOlcer.nemOlc());
	}
	// Olcum sinifi icinde yeni bir metot tanimliyoruz.
	// Bu metot geriye ITermometre tipinde bir deger donecek.
	// return kismina ne yazilabilir?
	// ITermometre interface'ini implement eden herhangi bir siniftan olusturulan bir nesne donmelidir.
	public ITermometre termometreOlustur(){
		return new BraunTermometre();
	}
	
	public INemOlcer nemOlcerOlustur() {
		return new SinboTermometre();
	}
}