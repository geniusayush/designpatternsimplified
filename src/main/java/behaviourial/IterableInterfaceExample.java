package behaviourial;

import java.util.Iterator;
import java.util.function.Consumer;

public class IterableInterfaceExample implements Iterable {
    Object[] arr;

    public Iterator iterator() {
        return new MyIterator(arr);
    }

    public void forEach(Consumer action) {

    }
}

class MyIterator implements Iterator {
    int index=0;
    Object[] arr;
    public MyIterator(Object[] arr) {
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        return !(index==arr.length);
    }

    @Override
    public Object next() {
       return arr[index++];
    }

    @Override
    public void remove() {
        arr[index-1]=null;

    }
}







