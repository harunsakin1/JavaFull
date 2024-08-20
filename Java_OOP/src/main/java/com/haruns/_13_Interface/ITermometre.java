package com.haruns._13_Interface;

public interface ITermometre {
	// Interface'lerdeki butun metotlar abstract metottur. Abstract keyword'u icermese bile.
	// O yuzden metotlarin govdesi olmaz.
	/*public int sicaklikOlc(){
		return 5;
	}*/
	
	/*public int sicaklikOlc();*/
	
	int sicaklikOlc();
	
	default int sicaklikOlcDerece(){
		return 60;
	}
	
	/*
	Serializable gibi ici bos olan interface'lere Marker interface denir.
	 */
	
	/*
	Bir sinif bir siniftan extend edilebilir.
	Bir sinif birden cok interface'den implemente edilebilir.
	Bir interface bir interface'den extend edilebilir.
	 */
}