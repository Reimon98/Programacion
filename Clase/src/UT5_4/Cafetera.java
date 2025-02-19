package UT5_4;

public class Cafetera {
	private long _capacidadMaxima;
	private long _capacidadActual;
	
	public Cafetera() {
		_capacidadMaxima=1000;
		_capacidadActual=0;
	}

	public Cafetera(long _capacidadMaxima) {
		this._capacidadMaxima=_capacidadMaxima;
		_capacidadActual=_capacidadMaxima;
	}
	
	public Cafetera(long _capacidadMaxima, long _capacidadActual) {
		this._capacidadMaxima=_capacidadMaxima;
		this._capacidadActual=_capacidadActual;
		if (_capacidadActual>_capacidadMaxima) {_capacidadActual=_capacidadMaxima;}
	
	
	
	}

	public long get_capacidadMaxima() {
		return _capacidadMaxima;
	}

	public void set_capacidadMaxima(long _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
		if (_capacidadMaxima>1000) {_capacidadMaxima=1000;}
	}

	public long get_capacidadActual() {
		return _capacidadActual;
	}

	public void set_capacidadActual(long _capacidadActual) {
		this._capacidadActual = _capacidadActual;
		if (_capacidadActual>_capacidadMaxima) {_capacidadActual=_capacidadMaxima;}
	}
	
	public void llenarCafetera () {
		_capacidadActual=1000;
	}
	
	public void llenarTaza(int num) {
		_capacidadActual-=num;
		if (_capacidadActual<0) {_capacidadActual=0;}
	}
	
	public void vaciarCafetera() {
		_capacidadActual=0;
	}
	
	public void agregarCafe (int num) {
		_capacidadActual+=num;
	}
	
	
	
}	

