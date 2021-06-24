package com.company.DynamicArray;

public class SimpleList<T> {
    private Object[] array;
    private int count;

    public SimpleList() {
        array = new Object[10];
        count = 0;
    }

    public void add(T value) {
        if (count < array.length) {
            array[count] = value;
            count++;
        } else {
            Object[] newArray = new Object[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[newArray.length - 1] = value;
            array = newArray;
            count++;
        }
    }
    private void checkIndex(int index){
        if(index < 0){
            throw new IndexOutOfBoundsException();
        }
        if(index >= count){
            throw new IndexOutOfBoundsException();
        }
    }


    public void remove(int index) {
        checkIndex(index);
        for(int i = index; i < count - 1; i++){
            array[i] = array[i + 1];
        }
        count--;
    }

    public void remove(T item) {
        remove(indexOf(item));
    }

    @SuppressWarnings("unchecked")
    public T getReturn(int index) {
        return (T) array[index];
    }

    public int lastIndexOf(T item) {
        for (int i = count - 1; i >= 0; i--) {
            if (array[i].equals(item))
                return i;
        }
        return -1;
    }

    private int indexOf(T obj){
        for(int i = 0; i < count; i++){
            if(array[i] == obj){
                return i;
            }
            if(array[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return count;
    }

    public boolean contains(T item) {
        for (int i = 0; i < count; i++)
            if (array[i].equals(item))
                return true;
        return false;
    }

    public void swap(int index1, int index2) {
        T temp = (T) array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void removeAll(T[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < count; i++) {
                if (array[i].equals(array[j])) {
                    remove(i);
                    break;
                }
            }
        }

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(i + " -> " + array[i] + " |");
        }
    }

    public void reverse() {
        Object[] newArray = new Object[count];
        int j = 0;
        for (int i = count - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }
        array = newArray;
    }

    public boolean compare(SimpleList<T> obj) {
        if (obj.size() == this.size()) {
            for (int i = 0; i < count; i++) {
                if (obj.getReturn(i).equals(this.getReturn(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void join(SimpleList<T> obj) {
        Object[] newArray = new Object[obj.count + this.count];
        System.arraycopy(this.array, 0, newArray, 0, this.count);
        System.arraycopy(obj.array, 0, newArray, this.count, obj.count);
        this.array = newArray;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            result.append(array[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
