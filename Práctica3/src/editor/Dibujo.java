package editor;

import java.util.*;

public class Dibujo {

	List<Figura> listFiguras = new ArrayList<>();
	
	public void addFigura(Figura figura) {
		listFiguras.add(figura);
	}
	
	public Figura getFigura(int x, int y) {
		for(Figura f: listFiguras) {
			if(f.contiene(x, y)) {
				return f;
			}
		}
		return null;
	}
	
	public void dibujar() {
		for(Figura f: listFiguras) {
			f.dibujar();
		}
	}

}
