package com.haruns._16_InterfaceKatmanliOrnek.repositories;

import com.haruns._16_InterfaceKatmanliOrnek.repositories.entities.Urun;

public interface IUrunRepository extends IRepository {
	
	Urun getUrun(int id);
}