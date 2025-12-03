package app.conversionmedidas;

// Clase padre abstracta (Abstracción). Define el molde para las medidas.
public abstract class UnidadMedida {
    
    // Atributo protegido para permitir acceso a las clases hijas (Herencia).
    protected double valor;

    public UnidadMedida() {
        
    }

    // Inicializa el estado del objeto.
    public UnidadMedida(double valor) {
        this.valor = valor;
    }

    // Métodos de acceso controlado (Encapsulamiento).
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}