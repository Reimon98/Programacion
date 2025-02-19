package UT5_EjercicioAgenda;
import java.util.ArrayList;

public class Agenda {
	private int anyo;
	private Pagina paginaActual;
	private ArrayList <Pagina> paginas = new ArrayList<>();
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	public Agenda(int anyo, Pagina paginaActual, ArrayList<Pagina> paginas) {
		super();
		this.anyo = anyo;
		this.paginaActual = paginaActual;
		this.paginas = paginas;
	}
	
	public void leerPagina(Pagina p) {
		System.out.println(p.toString());
		
	}
	
	public void avanzarPagina() {
		for (Pagina p : paginas) {
			if (p.getDia()==(paginaActual.getDia()+1)){
				paginaActual=p;
				System.out.println(paginaActual.toString());
				break;
			}
		}
	}
	
	public void retrocederPagina() {
		for (Pagina p:paginas) {
			if (p.getNumeroPagina()==(paginaActual.getNumeroPagina()-1)){
				paginaActual=p;
				System.out.println(paginaActual.toString());
				break;
			}
		}
	}
	

}
