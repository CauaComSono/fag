package Pizzas.tipos;

public enum pizzasdoces {
    morango_com_chocolate(23f, "Morango com Chocolate"),

    romeu_e_julieta(23f, "Romeu e Julieta"),

    brigadeiro(23f, "Brigadeiro"),

    nutela_com_morango(23f, "Nutela com morango"),

    sensacao(23f, "Sensação"),

    doce_de_leite(23f, "Doce de Leite"),

    banofe(23f, "Banofe"),

    chocolate_com_sorvete(23f, "Chocolate com Sorvete"),

    sorvete(23f,"Sorvete"),

    seducao(23f, "Sedução");


    private final float precoPizza;
    private final String nomePizza;

    pizzasdoces(float precoPizza, String nomePizza) {
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
