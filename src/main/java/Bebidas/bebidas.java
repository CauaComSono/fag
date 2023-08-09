package Bebidas;
import java.util.ArrayList;
import java.util.List;
public class bebidas {
    private static String tipo;

    private static String precoBebida;

    private List<refrigerantes> bebida;



    public bebidas(){
        this.bebida = new ArrayList<>();
        this.bebida.addAll(List.of(refrigerantes.values()));
    }
    public List<refrigerantes> getTipoBebida(){
        return bebida;
    }




    public static String getBebida() {
        return tipo;
    }

    public static void getBebidasa(String tipo) {
        bebidas.tipo = tipo;
    }

    public static String getPrecoBebidasa() {
        return precoBebida;
    }

    public static void setPrecoBebidasa(String precoBebida) {
        bebidas.precoBebida = precoBebida;

    }
}
