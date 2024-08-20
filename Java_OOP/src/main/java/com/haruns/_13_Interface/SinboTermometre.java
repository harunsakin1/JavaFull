package com.haruns._13_Interface;

public class SinboTermometre implements ITermometre,INemOlcer{
	@Override
	public double nemOlc() {
		return 60.20;
	}
	
	@Override
	public int sicaklikOlc() {
		return 27;
	}
	
	
	
	//Bu sinifta baska metotlar da olabilir.
}