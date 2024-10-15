public class ejercicio {
    public static void main(String[] args) {
        int mayor = NumeroMayor(10, 20, 5);
        System.out.println("El número mayor es: " + mayor);
    }

    public static int NumeroMayor(int a, int b, int c){
        if (a > b & a > c){
            return a;

        }else if (b > a & b > c){
            return b;
        } else {
            return c;
        }
    }
}