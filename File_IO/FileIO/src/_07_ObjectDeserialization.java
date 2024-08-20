import java.io.*;

public class _07_ObjectDeserialization {
	public static void main(String[] args) {
		//tekOtoOkuma();
		tumOtolariOkuma();
	}
	
	private static void tumOtolariOkuma() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			// Burası FIFO gibi çalışır. Queue yapısına benzer.
			Otomobil okunanOto ;
			while ((okunanOto = (Otomobil) ois.readObject())!=null){
				System.out.println(okunanOto);
			}
			
		}catch (EOFException e){
			System.out.println("Dosya okuma tamamlandı.");
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void tekOtoOkuma() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("otomobil.bin"))){
			// Burası FIFO gibi çalışır. Queue yapısına benzer.
			Otomobil okunanOto = (Otomobil) ois.readObject();
			System.out.println(okunanOto);
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}