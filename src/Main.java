import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> Lista = new ArrayList<>();
        Lista.add("Manolo");
        Lista.add("Ana");
        Lista.add("Pepe");
        Lista.add("Lucy");
        Lista.add("Romeo");

        System.out.println("List original: " + Lista);

        Iterator<String> iterator = Lista.iterator();
        while (iterator.hasNext()) {
            String palabra = iterator.next();
            if(palabra.length()<4){
                iterator.remove();
            }
        }

        System.out.println("Nueva lista: " + Lista);
    }
}
