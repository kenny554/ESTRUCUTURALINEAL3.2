package Materia;

public class Main3 {
    public static void main(String[] args) {
        Ejercicio_03_linkedLists lista = new Ejercicio_03_linkedLists();

        lista.addNode(5);
        lista.addNode(10);
        lista.addNode(15);
        lista.addNode(19);
        lista.addNode(11);

        System.out.println("Lista actual:");
        lista.print();

        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println("El nodo que esta buscando es:" + lista.getByPos(2));

    }
}
