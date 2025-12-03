package app.conversionmedidas;

// Clase hija (Herencia). Especializa el comportamiento para medidas de peso/masa.
public class ConversorPeso extends UnidadMedida {

    // Llama al constructor de la clase padre para inicializar el valor.
    public ConversorPeso(double valor) {
        super(valor);
    }

    // Método coordinador. Aplica la lógica de 'Unidad Puente' (Gramos) para estandarizar el cálculo.
    public double convertir(int unidadOrigen, int unidadDestino) {
        double gramos = llevarAGramos(unidadOrigen); 
        return traerDeGramos(gramos, unidadDestino); 
    }

    // Método auxiliar privado (Encapsulamiento). Convierte la unidad de entrada a la base (g).
    private double llevarAGramos(int origen) {
        
        switch (origen) {
            case 0: return this.valor * 1000;          // Kg -> g
            case 1: return this.valor * 453.59237;     // Lb -> g
            case 2: return this.valor;                 // g -> g
            case 3: return this.valor * 28.34952;      // Oz -> g
            default: return 0.0;
        }
    }

    // Método auxiliar privado. Convierte de la base (g) a la unidad de destino.
    private double traerDeGramos(double valorEnGramos, int destino) {
        
        switch (destino) {
            case 0: return valorEnGramos / 1000;
            case 1: return valorEnGramos / 453.59237;
            case 2: return valorEnGramos;
            case 3: return valorEnGramos / 28.34952;
                
            default: return 0.0;
        }
    }
}