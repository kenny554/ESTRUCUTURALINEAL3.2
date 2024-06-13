package Materia;

import java.util.NoSuchElementException;

import Materia.Models.Node;

public class Ejercicio_03_linkedLists {
    private Node head;
    private int size;

    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
        }
        size++;
    }

    public void deleteNode(int value) {
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println("Node-> " + current.value);
            current = current.next;
        }
        System.out.println("Fin de la Lista");
    }

    public int getByPos(int position) {
        if (head == null || position < 0 || position >= size) {
            throw new NoSuchElementException("La Lista está vacía o la posición es inválida");
        }

        int index = size - 1 - position;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

}
