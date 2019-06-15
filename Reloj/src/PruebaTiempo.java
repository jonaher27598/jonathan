import java.util.Scanner;

public class PruebaTiempo {

	private static Scanner sc;

	public static void main(String[] args) {
		int opcion;
		sc = new Scanner(System.in);
		Tiempo tiempo = new Tiempo();

		System.out.println("Bienvenido al Programa para ver un reloj");
		System.out.println("Elija una opcion del menu");
		System.out.println("\n1. Hora completa");
		System.out.println("2. Solo hora");

		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println(tiempo.getHour() + ":" + tiempo.getMinute());
			break;
		case 2:
			System.out.println(tiempo.getHour());
		}

		System.out.println("\nDesea Modificar la hora?");
		System.out.println("1.Si");
		System.out.println("2.No");

		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Ingrese una nueva hora");
			System.out.print("Hora: ");
			int hora = sc.nextInt();
			while(!(hora>=0 && hora<=23)) {
				System.out.println("Digite una hora valida entre 0 y 23: ");
				hora = sc.nextInt();
			}
			System.out.print("Minutos: ");
			int min = sc.nextInt();
			while(!(min>=0 && min<=59)) {
				System.out.println("Digite minutos entre 0 y 59: ");
				min = sc.nextInt();
			}
			System.out.print("Segundos: ");
			
			int seg = sc.nextInt();
			while(!(seg>=0 && seg<=59)) {
				System.out.println("Digite segundos entre 0 y 59: ");
				seg = sc.nextInt();
			}
			tiempo.CambiarHora(hora, min, seg);
			break;
		case 2:
			System.exit(1);
		}

	}

}
