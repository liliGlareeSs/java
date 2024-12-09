package newfrist;
import java.util.Scanner;
public class ex2part2 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur de saisir la température en degrés Celsius
        System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = scanner.nextDouble();
        
        // Demander à l'utilisateur de choisir le type de conversion
        System.out.println("Choisissez le type de conversion :");
        System.out.println("1: Celsius -> Fahrenheit");
        System.out.println("2: Celsius -> Kelvin");
        System.out.println("3: Celsius -> Fahrenheit et Kelvin");
        int choix = scanner.nextInt();
        
        switch (choix) {
            case 1:
                // Conversion en Fahrenheit
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Température en Fahrenheit : " + fahrenheit);
                break;
                
            case 2:
                // Conversion en Kelvin
                double kelvin = celsius + 273.15;
                System.out.println("Température en Kelvin : " + kelvin);
                break;
                
            case 3:
                // Conversion en Fahrenheit et Kelvin
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                System.out.println("Température en Fahrenheit : " + fahrenheit);
                System.out.println("Température en Kelvin : " + kelvin);
                break;
                
            default:
                System.out.println("Choix non valide.");
        }
        
        scanner.close();
    }


	}


