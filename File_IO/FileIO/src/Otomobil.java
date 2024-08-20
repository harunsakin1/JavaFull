import java.io.Serializable;

public class Otomobil implements Serializable {
	String marka;
	String model;
	Integer yil;
	
	public Otomobil(String marka, String model, Integer yil) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public Integer getYil() {
		return yil;
	}
	
	@Override
	public String toString() {
		return "Otomobil{" + "marka='" + getMarka() + '\'' + ", model='" + getModel() + '\'' + ", yil=" + getYil() + '}';
	}
}