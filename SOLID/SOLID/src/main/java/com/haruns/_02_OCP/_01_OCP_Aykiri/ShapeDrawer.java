package com.haruns._02_OCP._01_OCP_Aykiri;



public class ShapeDrawer  {
	private String tip;
	
	public ShapeDrawer(String tip) {
		this.tip = tip;
	}
	
	public void draw(){
		if (tip.equals("daire")){
			daireCiz();
		}
		else if (tip.equals("kare")){
			kareCiz();
		}
		else if (tip.equals("ucgen")){
			ucgenCiz();
		}
	}
	
	private void ucgenCiz() {
		System.out.println("Üçgen çizildi...");
	}
	
	private void kareCiz() {
		System.out.println("Kare çizildi...");
	}
	
	private void daireCiz() {
		System.out.println("Daire çizildi...");
	}
	
	
}