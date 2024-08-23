package com.haruns._02_OCP._00_OCP_Aykiri;
// Sorun : Her yeni database devreye alındığında Manager sınıfındaki metotta değişiklik yapmak zorunda kalıyoruz.
public class Calisan {

}

class OracleDatabase{
	public void ekle(Calisan calisan){
	
	}
}

class MySQLDatabase{
	public void add(Calisan calisan){
	
	}
}

class MongoDatabase{
	public void insert(Calisan calisan){
	
	}
}

class MsSQLDatabase{
	public void insert(Calisan calisan){
	
	}
}

class CalisanManager{
	public void calisanEkle(Object database,Calisan calisan){
		if (database instanceof OracleDatabase){
			((OracleDatabase) database).ekle(calisan);
		}
		else if (database instanceof MySQLDatabase) {
			((MySQLDatabase) database).add(calisan);
		}
		else if (database instanceof MongoDatabase) {
			((MongoDatabase) database).insert(calisan);
		}
		else if (database instanceof MsSQLDatabase) {
			((MsSQLDatabase) database).insert(calisan);
		}
	}
}