package eclipse;

import java.util.Scanner;

public class Programa{

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
	//Conta matheus = new Conta();
	ContaPoupanca maria = new ContaPoupanca();
    //Conta jose = new Conta();
    Titular c = new Titular();
    //matheus.cliente = c;
    //jose.cliente = c;
    maria.saque(1);
}
}    


