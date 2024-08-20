import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _04_BufferedReader {
	public static void main(String[] args) {
		//tekSatirOkuma();
		dosyaninTamaminiOkuma();
	}
	
	private static void dosyaninTamaminiOkuma() {
		try(BufferedReader reader=new BufferedReader(new FileReader("Takimlar"))){
			String okunanSatir;// readLine() ile satır satır okuma yapılabilir.
			int sayac=1;
			while ((okunanSatir = reader.readLine()) != null)
			{
				System.out.println(sayac+" - "+okunanSatir);
				sayac++;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void tekSatirOkuma() {
		try(BufferedReader reader=new BufferedReader(new FileReader("Takimlar"))){
			String okunanSatir = reader.readLine();// readLine() ile satır satır okuma yapılabilir.
			System.out.println(okunanSatir);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}