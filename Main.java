import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String [] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Jetta");    
        lista.add("Corsa");    
        lista.add("Fiesta");    
        lista.add("Celta");
        
        System.out.println(lista.get(1));
        String antigo = lista.set(1, "Cruze");
        System.out.println(lista.get(1));

        String removido = lista.remove(1);
        System.out.println(lista.get(1));

        System.out.println("Contains = "+lista.contains("Jetta"));
        System.out.println( lista.size());

        lista.clear();
        System.out.println( lista.size());

        System.out.println("---");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }



    }
}
