 package newfrist;

import java.util.Scanner;

public class tb {
    public static void main(String[] args) {

        int nombreAnnees = 0, i = 0;
        double tauxInteret = 0, capitalInitial = 0, capitalFinal = 0;

        Scanner clavier = new Scanner(System.in);

        // Prompt for capital, interest rate, and number of years
        System.out.print("Quel est le montant du capital à placer (en €) ? ");
        capitalInitial = clavier.nextDouble();
        
        System.out.print("Quel est le taux d'intérêt du placement ? ");
        tauxInteret = clavier.nextDouble();
        
        System.out.print("Combien d'années le capital va-t-il être placé ? ");
        nombreAnnees = clavier.nextInt();  // Get number of years

        // Set capitalFinal to the initial amount
        capitalFinal = capitalInitial;

        // Create an array to store the interest for each year
        double tab[] = new double[nombreAnnees];
        
        // Loop to calculate interest for each year
        for (i = 0; i < tab.length; i++) {
            // Compound interest formula for each year
            capitalFinal = (1 + tauxInteret / 100) * capitalFinal;
            
            // Store interest earned that year
            tab[i] = capitalFinal - capitalInitial;

            // Output interest for that year
            System.out.print("Les intérêts acquis au bout de " + (i + 1) + " an(s) sont de ");
            System.out.printf("%6.2f", tab[i]);
            System.out.println(" €");
        }

        clavier.close();
    }
}

