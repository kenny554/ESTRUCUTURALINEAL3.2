import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pilita = new Pila();
        pilita.push(10);
        pilita.push(20);
        pilita.push(30);
        pilita.push(40);

        System.out.println("Elemento en la cima de la  fila es:" + pilita.peek());
        System.out.println("Elemento eliminado de la fila es:" + pilita.pop());
        System.out.println("Elemento en la cima de la fila  es:" + pilita.peek());
        System.out.println("");

        // Implementacion de fila generica
        PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
        pilaPantalla.push(new Pantalla("Home Page", "/home"));
        pilaPantalla.push(new Pantalla("Home Page", "/home/menu"));
        pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t-->" + pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantalla("User Page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());

    }
}
