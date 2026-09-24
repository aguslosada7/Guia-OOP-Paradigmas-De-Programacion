package objetos.ej04;

public class Cubo {

	private double lado;
	private double areaCara;
	private double volumen;
	
    public Cubo (double longitudLado) {
    	if(longitudLado > 0) {
    		lado = longitudLado;
    		areaCara = Math.pow(longitudLado, 2);
    		volumen = Math.pow(longitudLado, 3);
    	}
    }

    public double obtenerLado() {
    	return lado;
    }
    
    public void cambiarLado(double longitudLado) {
    	if(longitudLado > 0) {
    		lado = longitudLado;
    		areaCara = Math.pow(longitudLado, 2);
    		volumen = Math.pow(longitudLado, 3);
    	}
    }
    
    public double obtenerAreaCara() {
    	return areaCara;
    }
    
    public void cambiarAreaCara(double areaCara) {
    	if(areaCara > 0) {
    		this.areaCara = areaCara;
    		lado = Math.sqrt(areaCara);
    		volumen = Math.pow(areaCara, 1.5);
    	}
    }

    public double obtenerVolumen() {
    	return volumen;
    }

    public void cambiarVolumen(double volumen) {
    	if(volumen > 0) {
    		this.volumen = volumen;
    		lado = Math.cbrt(volumen);
    		areaCara = Math.pow(lado, 2);
    	}
    }
}
