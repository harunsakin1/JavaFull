package com.haruns._17_Enum;

/**
 * Enum nedir ?
 * Belirlenen tipten, belirli sayıda ve sırada nseneyi tutan yapı.
 * Buradaki tüm alanlar (MUHENDIS) public static ve final'dır.
 * İçindeki nesne değişkenleri private olmalıdır.
 * enum field'ları aralarına virgül(,) konarak yazılır. Field yazımları bittiğinde noktalı virgül(;) koymak gerekir.
 * Enum'larda extends ile kalıtım alınamaz.
 * Enum'larda implement ile interface kullanılabilir.
 * Enum'larda constructor metod private'dır. Public yapılamaz.
 * Önemli metodları :
 * ordinal(): enum içindeki field'ın indexini döner.
 * valueOf(): enum içinde String olarak verilen değer varsa onu geri döner, yoksa hata fırlatır.
 * values(): enum içindeki fieldları dizi olarak döner.
 * Enum içindeki field'ların herbiri için enum içindeki constructor çalışır.
 * Ancak başka bir sınıftan enum'a erişim yoksa, constructor çalışmaz.
 */


public enum Unvanlar {
	MUHENDIS("Mühendis",1),
	MUHASEBECI("Muhasebeci",2),
	HIZMETLI("Hizmetli",3),
	MUDUR("Müdür",4);
	
	private String unvan;
	private int no;
	
	Unvanlar(String unvan, int no) {
		this.unvan = unvan;
		this.no = no;
	}
	
	public String getUnvan() {
		return unvan;
	}
	
	public int getNo() {
		return no;
	}
	
	
}