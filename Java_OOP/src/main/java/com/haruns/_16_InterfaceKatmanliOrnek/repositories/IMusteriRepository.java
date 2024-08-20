package com.haruns._16_InterfaceKatmanliOrnek.repositories;

import com.haruns._16_InterfaceKatmanliOrnek.repositories.entities.Musteri;

public interface IMusteriRepository extends IRepository {
	/**
	 * UUID'ye gore aranan musteriyi geri doner.
	 * @param uuid: Aranan musterinin id'si.
	 * @return Musteri nesnesi doner.
	 */
	Musteri getMusteri(String uuid);
	void guncelle(String kullaniciAdi,String ad,String soyAd,String sifre,String adres);
	
	
}