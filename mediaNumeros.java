

import java.util.Scanner;

public class mediaNumeros
{
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  double numero1 = scanner.nextDouble();
  double numero2 = scanner.nextDouble();
  double numero3 = scanner.nextDouble();
  
  System.out.print("Introduce el primer número: ");
  System.out.print("Introduce el segundo número: ");
  System.out.print("Introduce el tercer número: ");
  
  double media = (numero1 + numero2 + numero3) /3;
  System.out.println("La media de los tres números es: " + media);
    
  scanner.close();
    }
}
