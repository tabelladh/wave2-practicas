import java.util.*;

class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

}

class GuardaRopa {
    private Map<Integer, List<Prenda>> listaPrendas = new HashMap<>();
    private int contador = 0;

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        contador++;
        listaPrendas.put(contador, listaDePrenda);
        return contador;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : listaPrendas.entrySet()) {
            System.out.println("Número: " + entry.getKey());
            for (Prenda prenda : entry.getValue()) {
                System.out.println(prenda);
            }
        }
    }
    public List<Prenda> devolverPrendas(Integer numero) {
        return listaPrendas.get(numero);
    }
}

public class Main {
    public static void main(String[] args) {
        GuardaRopa guardaRopa = new GuardaRopa();
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Marca1", "Modelo1"));
        prendas.add(new Prenda("Marca2", "Modelo2"));
        Integer codigo = guardaRopa.guardarPrendas(prendas);
        System.out.println("Código recibido: " + codigo);

        System.out.println("Prendas guardadas bajo el código " + codigo + ": ");
        for (Prenda p : guardaRopa.devolverPrendas(codigo))
        {          System.out.println(p.toString());        }

    }
}
