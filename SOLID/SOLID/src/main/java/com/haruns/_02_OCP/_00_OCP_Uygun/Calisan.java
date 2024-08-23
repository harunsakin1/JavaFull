package com.haruns._02_OCP._00_OCP_Uygun;

// Sorun : Her yeni database devreye alındığında Manager sınıfındaki metotta değişiklik yapmak zorunda kalıyoruz.
public class Calisan {

}

class OracleDatabase implements IDatabase {
	@Override
	public void add(Calisan calisan) {
	
	}
}

class MySQLDatabase implements IDatabase {
	@Override
	public void add(Calisan calisan) {
	
	}
}

class MongoDatabase implements IDatabase {
	@Override
	public void add(Calisan calisan) {
	
	}
}

class MsSQLDatabase implements IDatabase {
	@Override
	public void add(Calisan calisan) {
	
	}
}

class PostgreSQLDatabase implements IDatabase {
	@Override
	public void add(Calisan calisan) {
	
	}
}

class CalisanManager {
	public void calisanEkle(IDatabase database, Calisan calisan) {
		database.add(calisan);
	}
}