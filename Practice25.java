import java.io.*;
import java.util.*;

class Practice25 {
	public static void main (String[] args) {
		if(args.length==1){
			String fileName = args[0];
			TreeSet<String> set = new TreeSet<>();
			File file = new File(fileName);
			try {
				Scanner sc = new Scanner(file);
				while(sc.hasNext()){
					set.add(sc.next());
				}
				System.out.println(set);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Please pass the file name as command line argument");
		}
	}
}