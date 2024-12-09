package newfrist;
import java.util.Scanner;
public class ex2part2if_else {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in) ;
		
		System.out.print("Entrez la température en degrés Celsius : ");
        double celsius = scanner.nextDouble();

		System.out.println("Choisissez le type de conversion :");
        System.out.println("1: Celsius -> Fahrenheit");
        System.out.println("2: Celsius -> Kelvin");
        System.out.println("3: Celsius -> Fahrenheit et Kelvin");
        int choix = scanner.nextInt();
        
        // Conversion avec des conditions if-else
        if (choix == 1) {
            // Conversion en Fahrenheit
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Température en Fahrenheit : " + fahrenheit);
        } else if (choix == 2) {
            // Conversion en Kelvin
            double kelvin = celsius + 273.15;
            System.out.println("Température en Kelvin : " + kelvin);
        } else if (choix == 3) {
            // Conversion en Fahrenheit et en Kelvin
            double fahrenheit = (celsius * 9/5) + 32;
            double kelvin = celsius + 273.15;
            System.out.println("Température en Fahrenheit : " + fahrenheit);
            System.out.println("Température en Kelvin : " + kelvin);
        } else {
            System.out.println("Choix non valide.");
        }
        
        scanner.close();
    }
}


