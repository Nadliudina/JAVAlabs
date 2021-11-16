package labs.ch06;

import java.util.ArrayList;

/**
 * __1__
 * @param <E>
 */
public class Stack<E> {
    private ArrayList<E> arrayList;

    public Stack() {
        arrayList = new ArrayList<E>();
    }

    /**
     * добавление элемента
     * @param val
     * @return успешно?
     */
    public boolean push(E val) {
        return arrayList.add(val);
        }

    /**
     * удаление элемента
     * @return удалнный элемент
     */
    public E pop() {
        if (arrayList.size() == 0)
            return null;
        E returnVal = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        return returnVal;
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

}
