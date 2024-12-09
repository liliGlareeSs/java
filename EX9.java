package newfrist;
import java.util.ArrayList;
import java.util.Scanner;
public class EX9 {
	
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Entrez une phrase : ");
 String phrase = scanner.nextLine();
   String[] mots = phrase.split(" ");
  ArrayList<String> listeMots = new ArrayList<>();
	for (String mot : mots) {
            listeMots.add(mot);
        }
   System.out.println("Les mots en majuscules sont :");
        for (String mot : listeMots) {
            System.out.println(mot.toUpperCase());
        }
	
	scanner.close();
}}
