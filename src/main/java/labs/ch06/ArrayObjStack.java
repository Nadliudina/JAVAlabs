package labs.ch06;

import java.util.function.IntFunction;

/**
 * __2__
 * @param <T>
 */
public class ArrayObjStack<T> {
    Object[] array;
    int size;
    int pos;

    public ArrayObjStack() {
        size = 0;
        pos = -1;
    }

    /**
     * добавение элемента
     * @param val
     * @return успешно
     */
    public boolean push(T val) {
        Object newArray[];
        pos++;
        if (pos == size) {
            newArray = new Object[size + 1];
            if (size != 0)
                System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            size++;
        }

        array[pos] = val;
        return true;
    }

    /**
     * удаление
     * @return удаленный элемент
     */
    public T pop() {
        if (pos == -1)
            return null;
        pos--;
        return (T) array[pos + 1];
    }

    public boolean isEmpty() {
        return pos == -1;
    }
}
