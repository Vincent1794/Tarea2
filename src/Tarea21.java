import java.util.Scanner;

public class Tarea21 {

	public static void main(String[] args) {
		float a,b,c;
		int d = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.print("\n\nIngrese el primer numero: ");
				a = sc.nextFloat();
				System.out.print("\nIngrese el segundo numero: ");
				b = sc.nextFloat();
				System.out.print("Ingrese el tercer numero: ");
				c = sc.nextFloat();
				if (a==(b+c)) {
					System.out.println("\n\nEl número "+a+" es la suma de "+b+" + "+c+".");
				}else if(b==(a+c)) {
					System.out.println("\n\nEl número "+b+" es la suma de "+a+" + "+c+".");
				}else if (c==(a+b)) {
					System.out.println("\n\nEl número "+c+" es la suma de "+a+" + "+b+".");
				}else {
					System.out.println("Ningun número es la suma de los otros dos");
				}
				int e =3;
				while (e!=1 && e!=2) {
					try {
						System.out.println("Desea repetir? 1.Si 2.No");
						e=sc.nextInt();
					}catch(Exception f) {
						System.out.println("Usted ingreso un dato no válido, por lo tanto el programa terminara automaticamente.\nError: "+f);
						System.exit(0);
					}
				}
			d=e;
			}catch (Exception t) {
				System.out.println("Usted ingreso un dato no válido, por favor, intentar nuevamente.\nError: "+t);
			}
			
		}while(d!=2);
	}

}
