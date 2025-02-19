package ejercicioStreaming;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Musica m = new Musica("Thriller");
		Pelicula p = new Pelicula("Avatar");
		Serie s = new Serie ("Juego de tronos", 4);
		Podcast pc = new Podcast ("Podcast", 4);
		
		boolean menu = true;
		while (menu) {
			System.out.println("Introduzca qué tipo de contenido quiere ver: MUSICA, PELICULA, SERIE, PODCAST");
			System.out.println(" ");
			
			String tipo = entrada.next();
			TipoContenido tipoElegido = TipoContenido.valueOf(tipo);
			switch (tipoElegido) {
			
			case MUSICA: 
				boolean menu2 = true;
				while (menu2) {
				System.out.println("Pulse 1 para reproducir, 2 para pausar, 3 para cambiar o 4 para apagar el programa");
				int decision = entrada.nextInt();
				switch (decision) {
				case (1): m.reproducir();
				break;
				
				case(2): m.pausar();
				break;
				
				case(3): System.out.println("Volviendo al menú");
				menu2= false;
				break;
				
				case (4): System.out.println("Apagando Nerflis");
				menu = false;
				break;
				
				default: System.out.println("Comando no válido");
				break;
				}
				}
			case PELICULA: 
				menu2 = true;
				while (menu2) {
				System.out.println("Pulse 1 para reproducir, 2 para pausar, 3 para cambiar o 4 para apagar el programa");
				int decision = entrada.nextInt();
				switch (decision) {
				case (1): p.reproducir();
				break;
				
				case(2): p.pausar();
				break;
				
				case(3): System.out.println("Volviendo al menú");
				break;
				
				case (4): System.out.println("Apagando Nerflis");
				menu = false;
				break;
				
				default: System.out.println("Comando no válido");
				break;
				}
				}
			case SERIE: 
				menu2 = true;
				while (menu2) {
				System.out.println("Pulse 1 para reproducir, 2 para pausar, 3 para cambiar o 4 para apagar el programa");
				int decision = entrada.nextInt();
				switch (decision) {
				case (1): s.reproducir();
				break;
				
				case(2): s.pausar();
				break;
				
				case(3): System.out.println("Volviendo al menú");
				break;
				
				case (4): System.out.println("Apagando Nerflis");
				menu = false;
				break;
				
				default: System.out.println("Comando no válido");
				break;
				}
				}
			case PODCAST: 
				menu2 = true;
				while (menu2) {
				System.out.println("Pulse 1 para reproducir, 2 para pausar, 3 para cambiar o 4 para apagar el programa");
				int decision = entrada.nextInt();
				switch (decision) {
				case (1): pc.reproducir();
				break;
				
				case(2): pc.pausar();
				break;
				
				case(3): System.out.println("Volviendo al menú");
				break;
				
				case (4): System.out.println("Apagando Nerflis");
				menu = false;
				break;
				
				default: System.out.println("Comando no válido");
				break;
				}
				}
		}

	}
	}
	
}
