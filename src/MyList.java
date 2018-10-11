import java.lang.Object;
import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public void add(E element){
        if(size== elements.length){
            ensureCapa();
        }
        elements[size++] = element;
    }

    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }
        return elements[index];
    }


}
