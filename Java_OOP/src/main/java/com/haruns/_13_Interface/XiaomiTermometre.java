package com.haruns._13_Interface;

/**
 * Bir sinif icerisinde hem bir sinifi extend hem de bir cok sinifi implement edebilir.
 */
public class XiaomiTermometre extends Termometre implements ITermometre,INemOlcer{
	@Override
	public double nemOlc() {
		return 0;
	}
	
	@Override
	public int havaKalitesiOlc() {
		return 0;
	}
	
	@Override
	public String tarihGoster() {
		return "";
	}
	
	@Override
	public String saatGoster() {
		return "";
	}
	
	@Override
	public int sicaklikOlc() {
		return 0;
	}
}