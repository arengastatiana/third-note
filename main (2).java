
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;

public class Main
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
