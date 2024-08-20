import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
BURSASPOR
GALATASARAY
FENERBAHCE
BESIKTAS
ESKISEHIR
ANKARAGUCU
GOZTEPE
 */
public class _05_BufferedWriter {
	public static void main(String[] args) {
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("Takimlar",true))){
			writer.write("\nTRABZONSPOR");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Yazma islemi tamamlandi.");
	}
}