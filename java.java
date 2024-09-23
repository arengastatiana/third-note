
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
public static void main(String[] args) {
    
 //dinero inicial en lacuenta
 double dineroInicial = 1000.0;
 
 //dinero que retira cada semana
 double dineroQueRetiraCadaSemana = 200.0;
 
 //semanas en un mes
 int semanasEnUnmes = 4;
 
 double totalRetiradoEnUnMes = dineroQueRetiraCadaSemana * semanasEnUnmes;
 double dineroRestante = dineroInicial - totalRetiradoEnUnMes;
 
 System.out.println("dinero restante en su cuenta despues de un mes: $" + dineroRestante);
 }
}
 
