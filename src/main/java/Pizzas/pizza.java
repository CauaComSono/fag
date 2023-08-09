package Pizzas;
import Pizzas.tipos.pizzasdoces;
import Pizzas.tipos.pizzassalgadas;

import java.util.ArrayList;
import java.util.List;

public class pizza {
   private List<pizzassalgadas> sabores;
    private List<pizzasdoces> saboresDoces;






    public pizza(){
        this.saboresDoces = new ArrayList<>();
        this.saboresDoces.addAll(List.of(pizzasdoces.values()));
        this.sabores = new ArrayList<>();
        this.sabores.addAll(List.of(pizzassalgadas.values()));
    }

    public List<pizzasdoces> getSaboresDoces(){
        return this.saboresDoces;
    }


    public List<pizzassalgadas> getSaboresSalgada(){
        return this.sabores;
    }


    public void setNome(String nome) {
    }

}
