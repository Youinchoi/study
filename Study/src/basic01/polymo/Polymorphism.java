package polymo;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) { // 다형성 코딩
		
		//		Book b;
		//		Dvd d;
		//		Cd c;
		
		Item i = null; // 부모클래스를 끌어와서 적는게 더 효율적
		
		System.out.print("해당하는 물품번호 (1)책 / (2) DVD / (3) CD >> ");
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 : i = new Book(001,"사피엔스","하라리","코스모출판"); break;
		case 2 : i = new Dvd(002,"헌트","정우성","이정재"); break;
		case 3 : i = new Cd(003,"힐링 클래식","모짜르트"); break;
		
		}
		
		i.output();
		
		sc.close();
		
	}

}
