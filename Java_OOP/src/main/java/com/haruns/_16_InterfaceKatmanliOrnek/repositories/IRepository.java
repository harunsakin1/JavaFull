package com.haruns._16_InterfaceKatmanliOrnek.repositories;

import java.io.ObjectStreamException;

public interface IRepository {
	void kaydet(Object o);
	void guncelle(Object o);
	void sil(int index);
	void listele();
	void ara(Object o);
}