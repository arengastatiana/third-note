public class Restante
{
public static void main(String[] args) {
double dineroInicial = 1000.0;

double dineroQueRetiraCadaSemana = 200.0;
int semanasEnUnmes = 4;

 double totalRetiradoEnUnMes = dineroQueRetiraCadaSemana * semanasEnUnmes;
double dineroRestante = dineroInicial - totalRetiradoEnUnMes;

System.out.println("dinero restante en su cuenta despues de un mes: $" + dineroRestante);
}
}

