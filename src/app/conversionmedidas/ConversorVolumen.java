package app.conversionmedidas;

// Clase hija (Herencia). Especializa el comportamiento para medidas de volumen.
public class ConversorVolumen extends UnidadMedida {

    // Llama al constructor de la clase padre para inicializar el valor (Reutilización).
    public ConversorVolumen(double valor) {
        super(valor);
    }

    // Método coordinador. Aplica la lógica de 'Unidad Puente' (Mililitros) para estandarizar el cálculo.
    public double convertir(int unidadOrigen, int unidadDestino) {
        
        double mililitros = llevarAMililitros(unidadOrigen);
        return traerDeMililitros(mililitros, unidadDestino);
    
    }

    // Método auxiliar privado (Encapsulamiento). Convierte la unidad de entrada a la base (ml).
    private double llevarAMililitros(int origen) {
        
        switch (origen) {
            case 0: return this.valor * 1000;       // Litro
            case 1: return this.valor;              // Mililitro
            case 2: return this.valor * 240;        // Taza EE.UU (Legal)
            case 3: return this.valor * 236.588;    // Taza EE.UU (Tradicional)
            case 4: return this.valor * 250;        // Taza Métrica
            case 5: return this.valor * 14.7868;    // Cucharada EE.UU
            case 6: return this.valor * 15;         // Cucharada Métrica
            case 7: return this.valor * 5;          // Cucharita Métrica
            
            default: return 0.0;
        }
    }

    // Método auxiliar privado. Convierte de la base (ml) a la unidad de destino.
    private double traerDeMililitros(double valorEnMl, int destino) {
        
         switch (destino) {
            case 0: return valorEnMl / 1000;
            case 1: return valorEnMl;
            case 2: return valorEnMl / 240;
            case 3: return valorEnMl / 236.588;
            case 4: return valorEnMl / 250;
            case 5: return valorEnMl / 14.7868;
            case 6: return valorEnMl / 15;
            case 7: return valorEnMl / 5;
            
            default: return 0.0;
        }
    }
}