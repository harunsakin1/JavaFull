package com.haruns.ThreadList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class _01_VectorThreadliListe {
	Vector<Integer> list1=new Vector<>();
	Vector<Integer>list2=new Vector<>();
	
	 Random random=new Random();
	public static void main(String[] args) {
		_01_VectorThreadliListe threadsizListe=new _01_VectorThreadliListe();
		long start = System.nanoTime();
		threadsizListe.threadIleDegerEkle();
		long end = System.nanoTime();
		System.out.println("Vector Threadli liste geçen süre : "+(end-start));
	}
	
	public void threadIleDegerEkle()  {
		Thread t1=new Thread(()->{
			listelereDegerEkle();
		});
		Thread t2=new Thread(()->{
			listelereDegerEkle();
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("List1 eleman sayısı : "+list1.size());
		System.out.println("List2 eleman sayısı : "+list2.size());
	}
	
	public void listelereDegerEkle(){
		for (int i = 0; i < 5000; i++) {
			list1eDegerEkle();
			list2yeDegerEkle();
		}
		
	}
	// synchronized : eleman sayısının garantiye alınmasını sağlar.
	// Eğer collection yapımız thread safe olan vector olursa
	// burada synchronized keyword'ü kullanmasakta eleman sayısı garanti altındadır.
	public void list1eDegerEkle(){
		list1.add(random.nextInt(0,101) );
	}
	public void list2yeDegerEkle(){
		list2.add(random.nextInt(0,101) );
	}
}