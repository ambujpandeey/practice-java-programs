package customClasses;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList<T> implements Iterable<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    private void expandCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomArrayListIterator();
    }

    private class CustomArrayListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return get(currentIndex++);
        }
    }

    public static void main(String[] args) {
        CustomArrayList<String> myList = new CustomArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
		myList.add("2");
		myList.add("44");
		myList.add("56576");
		myList.add("Or8989ange");
		myList.add("0909");
		myList.add("-086");
		myList.add("56564");
		myList.add("32434");
		myList.add("vcvcb");
		myList.add("fgbfgf");
		myList.add("ghgjhkj");
		myList.add("jlk;lkjkhjghg");
		myList.add("fgjhklhj");
		myList.add("ghkjmhjh");

        System.out.println("Size: " + myList.size()); // Output: Size: 3

        // Iterating over the elements using for-each loop
        for (String element : myList) {
            System.out.println(element);
        }
    }
}


