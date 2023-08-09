package Pizzas.tipos;

public enum pizzassalgadas {
    calabresa(25f, "Calabresa"),

    peperoni(25f, "Peperoni"),

    bacon(25f, "Bacon"),

    frango_catupiry(25f, "Frango Catupiry"),

    portuguesa(25f, "Portuguesa"),

    mucarela(25f, "Muçarela"),

    quatro_estacoes(25f, "Quatro Estações"),

    quatro_queijos(25f, "Quatro Queijos"),

    california(25f,"Califórnia"),

    napotitana(25f, "Napolitana");


    private final float precoPizza;
    private final String nomePizza;

    pizzassalgadas(float precoPizza, String nomePizza) {
        this.precoPizza = precoPizza;
        this.nomePizza = nomePizza;
    }

    public float getPrecoPizza(){
        return precoPizza;
    }
    public String getNomePizza(){
        return nomePizza;
    }
}
