package Bebidas;

public enum refrigerantes {
    coca_cola(8f, "Coca Cola"),

    pepsi(7.50f, "Pepsi"),

    fanta_laranja(7f, "Fanta Laranja"),

    guarana(7.50f, "Guarana"),

    kuat(7f, "Kuat");

    private final float precoBebida;
    private final String nomeBebida;

    refrigerantes(float precoBebida, String nomeBebida) {
        this.precoBebida = precoBebida;
        this.nomeBebida = nomeBebida;
    }

    public float getPrecoBebida(){
        return precoBebida;
    }
    public String getNomeBebida(){
        return nomeBebida;
    }
}
