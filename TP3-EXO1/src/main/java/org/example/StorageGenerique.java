package org.example;

import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {
    private List<T> elements;

    public StorageGenerique(List<T> elements) {
        this.elements = elements;
    }

    public void setValue(List<T> elements) {
        this.elements = elements;
    }

    public List<T> getValue() {
        return elements;
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("out of bound index");
        }
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(elements.get(index));
        } else {
            throw new IndexOutOfBoundsException("out of bound index");
        }
    }

    public int getSize() {
        return elements.size();
    }

    public List<T> getElements() {
        return elements;
    }

}
