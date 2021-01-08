package Homeworkten;
import java.io.*;
public class Filecopyone {

	public static void main(String[] args) throws IOException{
		if(args.length!=2) {
			System.out.println("û������������ļ�");
			System.exit(1);
		}
		File sourceFile=new File(args[0]);
		if(!sourceFile.exists()) {
			System.out.println("�ļ� " + args[0] + " ������");
			System.exit(2);
		}
		File targetFile=new File(args[1]);
		if(targetFile.exists()) {
			System.out.println("�ļ� " + args[1] + " ����");
			System.exit(3);
		}
		
		try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));){
			int r,numberOfBytesCopied=0;
			while((r=input.read()) != -1) {
				output.write((byte)r);
				numberOfBytesCopied++;
			}
			System.out.println("�����ֽڻ�����");
			System.out.println(numberOfBytesCopied + " byte copied");
		}
		
		
	}

}
