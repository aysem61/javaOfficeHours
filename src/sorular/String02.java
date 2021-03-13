package sorular;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		
		
		//startsWith()
		String str1="Ayse Demirkan";
		
		System.out.println(str1.startsWith("A"));//true
		System.out.println(str1.startsWith("D",5));	//true	
		System.out.println(str1.startsWith("Ay"));//true
		
		//endWith()
		System.out.println(str1.endsWith("n"));//true
		System.out.println(str1.endsWith("kan"));//true
		
		//isEmpty()
		String s="";
		System.out.println(s.isEmpty());//true
		
		//replace()
		String str2="Ayse Demirkan";
		System.out.println(str2.replace("e", "o"));//Ayso Domirkan
		System.out.println(str2);//Ayse Demirkan
		System.out.println(str2.replace("m", ""));//Ayse Deirkan
		
		//replaceFirst()
		String str3="Ayse Demirkan";
		System.out.println(str3.replaceFirst("y", "k"));//Akse Demirkan
		System.out.println(str3.replaceFirst("d", "b"));//Ayse Demirkan
		
		//replaceAll()
		
		
		//indexOf()
		String str="Java is easy if you study";
		System.out.println(str.indexOf("a"));//1 ('i')=/1
		System.out.println(str.indexOf("k"));//-1
		System.out.println(str.indexOf("i", 8));//13
		System.out.println(str.indexOf("u", 19));//22
		
		
		//lastIndexOf()
		String t="Java ah Java!";
		System.out.println(t.lastIndexOf("v"));//10
		System.out.println(t.lastIndexOf("J", 5));//0
		System.out.println(t.lastIndexOf("a", 8));//5
		
		 //INTERWIEV SORUSU
        /*Ask user to give you a String and a character.
         * If the character does not exist in the String or exist just once print"Not good!"
         * If the character is used multiple times print "Woow!".
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the enter String and a character");
		String x=scan.next();
		char ch=scan.next().charAt(0);
		
		if(x.indexOf(ch)==-1 || x.indexOf(ch)==s.lastIndexOf(ch)) {
			System.out.println("Not good!");
		}else {
			System.out.println("Woow!");
		}
		if(s.indexOf(ch)!=s.lastIndexOf(ch)) {
			System.out.println("Woow!");
			
			//contains()
			String r="Ayse Demirkan";
			System.out.println(r.contains("e"));
			//true
		}
	}

}
