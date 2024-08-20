import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class _09_ArrayListDeserialization {
	public static void main(String[] args) {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
			ArrayList<Ogrenci> okunanOgrenciArrayList = (ArrayList<Ogrenci>) ois.readObject();
			okunanOgrenciArrayList.forEach(System.out::println);
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}