package org.perez.Clase6.Models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	Scanner leer = new Scanner(System.in);
	private Double a;
	private Double b;

//Constructor	
	public Calculadora(Double a, Double b) {
		this.a = a;
		this.b = b;
	}

	public Calculadora() {
	}

//getters setters	
	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

//metodos

	public void resultado() {
		Calculadora cal = new Calculadora();
		
		System.out.println("Menu de una calculadora");
		int a, b;
		double resultado = 0.0;
		boolean fin = false;
		while (!fin) {

			try {
				System.out.println("\nIngrese 2 numeros");
				System.out.print("primer nro ");
				setA(leer.nextDouble());
				System.out.print("segundo nro ");
				setB(leer.nextDouble()) ;
				System.out.println("Elija la operacion aritmetica");
				System.out.println("1.- suma");
				System.out.println("2.- resta");
				System.out.println("3.- multiplicacion");
				System.out.println("4.- division");
				System.out.println("5.- salir");
				int opcion = 0;
				opcion = leer.nextInt();
				switch (opcion) {
				case 1:
					System.out.print("El resultado de la suma es : ");
					cal.sumar(getA(), getB());
					break;
				case 2:
					System.out.print("El resultado de la resta es : ");
					cal.restar(getA(),getB());
					break;
				case 3:
					System.out.print("El resultado de la multiplicacion es : ");
					cal.multi(getA(), getB());
					break;
				case 4:
					System.out.print("El resultado de la division es : " );
					cal.division(getA(), getB());
					break;
				case 5:
					fin = true;
					break;
				default:
					System.out.println("vuelva a ingresar la opcion");
				}

			} catch (InputMismatchException e) {
				System.out.println("Ha ocurrido un error. Ingrese números enteros válidos.");
				leer.nextLine(); // Limpiar el buffer de entrada
			}
		}
		leer.close(); // Cerrar el Scanner al finalizar
	}

	public Double sumar(Double a, Double b) {
		Double suma = a + b;
		System.out.print(suma);
	return suma;	
	}

	public Double restar(Double a, Double b) {
		Double resta =  a - b;
		System.out.print(resta);
	return resta;	
	}

	public Double multi(Double a, Double b) {
		Double multi = a * b;
		System.out.print(multi);
		return multi;
	}

	public Double division(Double a, Double b) {
		Double division = 0.0;
		try {

			if (b > 0 || b < 0) {
				division = a / b;
				System.out.print(division);
			} else {
				System.out.println("No se puede dividir entre a cero, elija otro numero");
				
			}

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Cerrando la cesion de divison");
		}
	return division;	
	}
}
