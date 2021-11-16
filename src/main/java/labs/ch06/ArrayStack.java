package labs.ch06;

import java.util.function.IntFunction;

/**
 *__2__
 */
public class ArrayStack<T> {
    T[] array;
    int size;
    int pos;

    public ArrayStack() {
        size = 0;
        pos = -1;
    }

    /**
     * добавение элемента
     * @param val
     * @param intFunction функция инициализации
     * @return успешно
     */
    public boolean push(T val, IntFunction<T[]> intFunction) {
        T newArray[];
        pos++;
        try {
            if (pos == size) {
                newArray = intFunction.apply(size + 1);
                if(size!=0)
                    System.arraycopy(array,0,newArray,0,size);
                array=newArray;
                size++;
            }
        }
        catch(Exception e){
            throw e;
        }

        array[pos]=val;
        return true;
    }

    /**
     * удаление
     * @return удаленный элемент
     */
    public T pop() {
        if (pos==-1)
            return null;
        pos--;
        return array[pos+1];
    }

    public boolean isEmpty() {
        return pos==-1;
    }

}
