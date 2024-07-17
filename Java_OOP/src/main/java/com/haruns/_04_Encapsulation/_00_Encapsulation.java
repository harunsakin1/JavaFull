package com.haruns._04_Encapsulation;

/**
 * Encapsulation : Bir sinif icindeki metot ve degiskenleri korumak demektir. Nesne degiskenlerimizin disaridaki
 * siniflardan erisimini gizleriz. Access modifierlardan Private kullanarak bu erisim gizlenir.
 * <p>
 * Nesne degiskenini gizledikten sonra deger atamak ve deger okumak icin Public olarak tanimlanan setter ve getter
 * metotlar kullanilir. Setter metotlar ile nesne degiskenine deger atanirken gerekli kontroller saglanabilir. Getter
 * metodu ile de nesne degiskeninin degeri okunabilir.
 * <p>
 * Encapsulation'da package yapisi da onemlidir. Access modifierlar package yapisina gore davranislar sergiler.
 */
public class _00_Encapsulation {
	private int kdvOrani; //Nesne degiskeni : Private yapilarak sinif disindan erisim engellendi.
	
	public void setKdvOrani(int kdvOrani) {
		if (kdvOrani < 30 && kdvOrani > 0) {
			this.kdvOrani = kdvOrani;
		}
		else {
			System.out.println("Oran 0-30 arasi olmalidir.");
		}
	}
	public int getKdvOrani(){
		return kdvOrani;
	}
	
}