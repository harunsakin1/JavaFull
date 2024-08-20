import java.io.*;

public class _06_ObjectSerialization {
	public static void main(String[] args) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			Otomobil otomobil1=new Otomobil("Honda","S2000",2004);
			Otomobil otomobil2=new Otomobil("Opel","Astra",2018);
			Otomobil otomobil3=new Otomobil("BMW","318",2022);
			// Yazmak istediğimiz objelerin mutlaka Serializable interfacini implemente etmesi gereklidir.
			// java.io.NotSerializableException Aksi halde bu hatayı alırız.
			oos.writeObject(otomobil1);
			oos.writeObject(otomobil2);
			oos.writeObject(otomobil3);
			// oos.writeObject(null);
			
		}
		catch (NotSerializableException e){
			System.err.println("Serializable'den implemente etmeyi unuttun mu ?");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Yazma islemi tamamlandi");
	}
}