package labs.ch06;

import java.util.ArrayList;

/**
 * ___3__
 * @param <K>
 * @param <V>
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> arrayList;

    public Table(){
        arrayList=new ArrayList<>();
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    /**
     * получение значения по ключу
     * @param key
     * @return
     */
    public V get(K key) {
        for (Entry<K, V> item : arrayList)
            if (item.getK() == key)
                return item.getVal();

        return null;
    }

    /**
     * есть ли такой ключ
     * @param key
     * @return
     */
    public boolean keyExist(K key) {
        for (Entry<K, V> item : arrayList)
            if (item.getK() == key)
                return true;
        return false;
    }

    /**
     * добавление значения с ключом
     * @param key
     * @param value
     * @return успешно
     */
    public boolean put(K key, V value) {
        if (keyExist(key)){
            Entry<K,V> kostil=null;
            for (Entry<K,V> item : arrayList)
                if (item.getK() == key)
                    kostil=item;
                arrayList.remove(kostil);
        }

        return arrayList.add(new Entry<>(key, value));
    }

    /**
     * удаление значения с ключом
     * @param key
     * @return успешно
     */
    public boolean remove(K key) {
        for (Entry<K, V> item : arrayList)
            if (item.getK() == key)
                return arrayList.remove(item);;

        return false;
    }

}
