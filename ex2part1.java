package newfrist;
import java.util.Scanner;
public class ex2part1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir la température en degrés Celsius
        System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = scanner.nextDouble();
        
        // Conversion en Fahrenheit et Kelvin
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        
        // Affichage des résultats
        System.out.println("Température en Fahrenheit : " + fahrenheit);
        System.out.println("Température en Kelvin : " + kelvin);
        
        scanner.close();
    }


	}

