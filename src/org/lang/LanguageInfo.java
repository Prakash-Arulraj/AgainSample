package org.lang;
//public class child class extends parent class
public class LanguageInfo extends StateDetails{
	

	public void arulBranch() {
		System.out.println("This is Arul Branch");
		
	}	

	public void arunBrach() {
		System.out.println("This is Arun");


	}
	
	
	public void tamilLanguage() {
		System.out.println("This is tamil language");

	}
	
	public void englishLanguage() {
		System.out.println("This is english language");

	}
	
	public void hindiLanguage() {
		System.out.println("This is hindi language");

	}
	public static void main (String [] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
		//parent class
		l.southIndia();
		l.northIndia();
		
	}

}
