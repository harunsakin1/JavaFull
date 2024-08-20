package Logger;

import java.io.*;
import java.util.ArrayList;

public class DosyaIslemleri<T> {
	
	public void writeToBinary(T t,String fileName){
		File file=new File(fileName);
		try(ObjectOutputStream oos = file.exists() ?
				new MyObjectOutputStream(new FileOutputStream(file, true)) :
				new ObjectOutputStream(new FileOutputStream(file, true)))
		{
			oos.writeObject(t);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<T> readFromBinary(String fileName){
		File file=new File(fileName);
		ArrayList<T> readedDataList=new ArrayList<>();
		T readedData=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file))){
			while ((readedData=(T)ois.readObject())!=null){
			readedDataList.add(readedData);
			}
		}
		catch (EOFException e){
			System.out.println("File read completed.");
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return readedDataList;
	}
}