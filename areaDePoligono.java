import java.util.Scanner;

public class areaDePoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el tipo de poligono(triangulo, cuadrado o rectangulo)");
        String poligono =  scanner.next().toLowerCase();

        double area = 0 ;

        switch (poligono) {

        case  "triangulo":
        System.out.println("ingrese la base:");
        double baseTriangulo = scanner.nextDouble();
        System.out.println("ingrese la altura:");
        double alturaTriangulo =scanner.nextDouble();
        area = (baseTriangulo * alturaTriangulo)/2;
        break;

        case "cuadrado":
        System.out.println("ingrese el lado:");
        double lado = scanner.nextDouble();
        area = lado * lado;
        break;

        case "rectangulo":
        System.out.println("ingrese la base:");
        double baseRectangulo = scanner.nextDouble();
        System.out.println("ingrese la altura:");
        double alturaRectangulo =scanner.nextDouble();
        area = (baseRectangulo * alturaRectangulo);
        break;

        default:
        System.out.println("poligono no soportado.");
    }
        if(area > 0);{
            System.out.println("el area del " + poligono + "es:" + area);

        }
        scanner.close();
        }
        
    } 
