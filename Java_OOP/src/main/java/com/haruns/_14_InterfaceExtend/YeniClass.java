package com.haruns._14_InterfaceExtend;
/*
Bir sinif extend edilmis bir interface'i implement ederse, o interface'in metotlarini implement ettigi gibi extend edildigi interface'in metotlarini da implement etmek zorunda kalir.
 */
public class YeniClass implements ChildInterface{
	
	@Override
	public void childInterface() {
	
	}
	
	@Override
	public void parentMethod() {
	
	}
}