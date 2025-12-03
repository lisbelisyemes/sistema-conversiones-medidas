package app.conversionmedidas;

// Clase hija (Herencia). Gestiona la lógica específica para Temperatura.
public class ConversorTemperatura extends UnidadMedida {

    public ConversorTemperatura(double valor) {
        super(valor);
    }

    // Método principal con lógica condicional directa.
    // NOTA: A diferencia de Peso/Volumen, aquí usamos fórmulas directas por la suma/resta (+32).
    public double convertir(int unidadOrigen, int unidadDestino) {
        
        // Optimización: Si origen y destino son iguales, retornamos el valor sin cálculo.
        if (unidadOrigen == unidadDestino) {
            return this.valor;
        }

        // Lógica de conversión específica (0=Celsius, 1=Fahrenheit)
        if (unidadOrigen == 0 && unidadDestino == 1) { // Celsius -> Fahrenheit
            return (this.valor * 9/5) + 32;
        
        } else if (unidadOrigen == 1 && unidadDestino == 0) { // Fahrenheit -> Celsius
            return (this.valor - 32) * 5/9;
        }
        
        return this.valor;
    }
}