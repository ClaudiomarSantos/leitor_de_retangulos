package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();

		System.out.println("Digite a altura do retangulo: ");
		ret.altura = sc.nextDouble();

		System.out.println("Digite a largura do retangulo: ");
		ret.largura = sc.nextDouble();

		System.out.println("Dados do retangulo:");
		System.out.println("Altura: " + ret.altura);
		System.out.println("Largura: " + ret.largura);

		double area, perimetro, diagonal;
		area = ret.area();
		perimetro = ret.perimetro();
		diagonal = ret.diagonal();

		System.out.print("Area: ");System.out.printf("%.2f%n", area);
		System.out.print("Perimetro: ");System.out.printf("%.2f%n", perimetro);
		System.out.print("Diagonal: ");System.out.printf("%.2f%n", diagonal);

		sc.close();
	}

}
