package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente();
        cliente.nombre = "Marcelo";
        cliente.edad = 30;
        cliente.telefono = 981544;
        cliente.credito = true;

        System.out.println("Nombre del cliente : "+cliente.nombre);
        System.out.println("Edad : "+cliente.edad);
        System.out.println("Telefono : "+cliente.telefono);
        System.out.println("Credito : "+cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Marcelo";
        trabajador.edad = 30;
        trabajador.telefono = 4565465;
        trabajador.salario = 150000;

        System.out.println("Nombre del trabajador : "+trabajador.nombre);
        System.out.println("Edad : "+trabajador.edad);
        System.out.println("Telefono : "+trabajador.telefono);
        System.out.println("Salario : "+trabajador.salario);
    }
}
class Persona {
    int edad;
    int telefono;
    String nombre;
}
class Cliente extends Persona {
    Boolean credito;
}
class Trabajador extends Persona {
    double salario;
}
