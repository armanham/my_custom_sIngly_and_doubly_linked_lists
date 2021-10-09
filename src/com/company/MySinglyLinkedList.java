package com.company;

public class MySinglyLinkedList implements MyList {

    Node first;
    Node last;
    int size;


    @Override
    public Object get(int index) {
        if (size() - 1 < index || index < 0) {
            return false;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void add(Object obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
        } else {
            last.next = node;
            last = node;
            size++;
        }
    }

    @Override
    public void remove(int index) {
        if (size() - 1 < index || index < 0) {
            throw new IllegalArgumentException("Invalid index: ");
        }

        if (index == 0) {
            first = first.next;
            size--;
        } else if (index == size() - 1) {
            Node current = first;
            for (int i = 0; i < size() - 2; i++) {
                current = current.next;
            }
            last = current;
            current.next = null;
            size--;
        } else {
            Node current = first;
            for (int i = 0; i < size() - 3; i++) {
                current.next = current.next.next;
            }
        }
    }


    @Override
    public boolean remove(Object obj) {
        Node current = first;
        if (first.value == obj) {
            first = current.next;
            size--;
            return true;
        } else {
            for (int i = 0; i < size - 1; i++) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                    size--;
                    return true;
                }
                if (current.next.value == obj) {
                    current.next = current.next.next;
                    size--;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object obj) {
        if (size() > 0) {
            if (first.value == obj) {
                return true;
            }
            Node current = first.next;
            for (int i = 0; i < size() - 1; i++) {
                if (current.value == obj) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();

    }

}
