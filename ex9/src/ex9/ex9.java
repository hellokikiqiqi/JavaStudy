package ex9;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class ex9 {

	public static void main(String[] args) throws IOException{
		//1.
		// �½�ͼ�����
		/*Book b1 = new Book("0001","aa",23,"kiki");
		Book b2 = new Book("0010","bb",17,"qiqi");
		Book b3 = new Book("0100","cc",35,"kiki");
		Book b4 = new Book("0011","dd",30,"kiki");*/
		
		// �������
		/*List<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		System.out.println("���\t����\t����\t������");
		Iterator it = books.iterator();
		
		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.print(book.getNumber() + "\t");
			System.out.print(book.getName() + "\t");
			System.out.print(book.getPrice() + "\t");
			System.out.println(book.getPublisher());
		}*/
		
		/*for (Book book : books) {
			System.out.println(book.getName());
		}*/
		
		// ӳ����
		/*Map<String,Book> books = new HashMap<String,Book>();
		
		books.put(b1.getNumber(), b1);
		books.put(b2.getNumber(), b2);
		books.put(b3.getNumber(), b3);
		books.put(b4.getNumber(), b4);
		
		System.out.println("���\t����\t����\t������");
		
		Iterator it = books.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			System.out.print(entry.getKey() + "\t");
			System.out.print(((Book)entry.getValue()).getName() + "\t");
			System.out.print(((Book)entry.getValue()).getPrice() + "\t");
			System.out.println(((Book)entry.getValue()).getPublisher());
		}*/
		
		//2.
		System.out.println("������ѧ�ţ�����������:");
		Scanner input = new Scanner(System.in);
		Map<Integer,Student> students = new TreeMap<Integer,Student>();
		File fin = new File("students.txt");
		PrintWriter pw = new PrintWriter(fin);
		
		while (true) {
			String id = input.next();
			
			if (id.equals("exit")) break;
			
			String name = input.next();
			int age = input.nextInt();
			
			students.put(age, new Student(id,name,age));
		}
		
        Iterator it = students.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			pw.print(entry.getValue() + "\n");
			
			System.out.println(entry.getValue());
			//System.out.print(entry.getKey() + "\t");
			//System.out.println(entry.toString());
			
		}
		
		pw.close();
	}
}