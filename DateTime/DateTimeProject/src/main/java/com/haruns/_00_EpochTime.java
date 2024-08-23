package com.haruns;
/*
Tarih-zaman bilgisi programlarda nerelerde kullanılabilir.
Yapılan işlemin zamanını tutmak için
Rezervasyon işlemlerinde
Doğum günü ile yaş hesaplama
Doğum tarihi
Hangi kullanıcı işlemi ne kadar sürede gerçekleştirdi
Programın çalışma süresi
Hata oluşma anı

Unix Epoch Time : 1.1.1970 00:00:00:0000 zamanını başlangıç kabul eden bir sistem. Zone bilgisi yok.
1_000_000_000 nanosaniye  -> 1sn
1_000 milisaniye ----------> 1sn
60 saniye -----------------> 1dk
60 dakika -----------------> 1saat
24 saat -------------------> 1gün

Long veri tipinde tutulur.
Long veri tipinde tutmak daha az yer kaplar ve hesaplama işlemlerinde çok daha efektik sonuç alınabilir.
 */
public class _00_EpochTime {
	public static void main(String[] args) {
		double gun=((double) System.currentTimeMillis() /86_400_000);
		System.out.println("Şuanki zaman : "+System.currentTimeMillis());
		System.out.println("1970'den bugüne kadar geçen gün sayısı : "+gun);
	}
}