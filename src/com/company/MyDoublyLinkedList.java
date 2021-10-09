package com.company;

public class MyDoublyLinkedList implements MyList {
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
            node.previous = last;
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
        } else {
            Node current = first.next;
            for (int i = 0; i < index; i++) {

            }
        }

    }

    @Override
    public boolean remove(Object obj) {
        if (first.value == obj) {
            first = first.next;
            size--;
            return true;
        } else {
            Node current = first;
            for (int i = 0; i < size(); i++) {
                if (i == size() - 1) {
                    current.next = null;
                    last = current;
                    size--;
                    return true;
                }
                if (current.value == obj) {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
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
        Node current = first.next;
        if (size() > 0) {
            if (first.value == obj) {
                return true;
            }
            for (int i = 0; i < size() - 2; i++) {
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
