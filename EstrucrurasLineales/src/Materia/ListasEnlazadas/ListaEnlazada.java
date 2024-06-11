package Materia.ListasEnlazadas;

import Materia.Models.Node;

public class ListaEnlazada {
    public Node head;
    private int tamanio = 0;

    public ListaEnlazada() {

    }

    // Agrgar Nodos a las lista
    public void allNode(int value) {
        if (head == null) {
            head = new Node(value);
            return;

        }
        Node curret = head;
        while (curret.next != null) {
            curret = curret.next;
            tamanio++;

        }
        curret.next = new Node(value);
    }

    /// Metodo para eliminar

    public void deleteNode(int value) {
        if (head == null) {
            return;
        } // no hay elementos no hace nada
        if (head.value == value) {
            head = head.next;
            return;

        }
        Node current = head;

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;

            }
            current = current.next;

        }

    }

    public int size() {
        return 1;

    }

    public void print() {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.println("Node-> " + current.value);
            current = current.next;

        }
        System.out.println("Node-> " + current.value);
        System.out.println("Fin de la Lista");
        System.out.println("El tamanio es ");
    }

}
