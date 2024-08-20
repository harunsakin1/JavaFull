package com.haruns._27_Generics.Generic00;
//E, K, V, T
public class Personel<E,T> {
	E ad;
	T dogumTarihi;
	
	@Override
	public String toString() {
		return "Personel{" + "ad=" + ad + ", dogumTarihi=" + dogumTarihi + '}';
	}
}