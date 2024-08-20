import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_FileReader {
	public static void main(String[] args) {
		List<Ogrenci> ogrenciList=new ArrayList<>();
		
		try(Scanner sc=new Scanner(new FileReader("ogrListe.txt"))){
			while (sc.hasNextLine()){
				String satir = sc.nextLine();
				//System.out.println(satir);
				String[] split = satir.split(",");
				Ogrenci ogrenci=new Ogrenci(split[0],Long.parseLong(split[1].trim()));
				ogrenciList.add(ogrenci);
				
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ogrenciList.forEach(System.out::println);
	}
}