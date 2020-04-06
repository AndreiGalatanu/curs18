package Generic;

public class GenericBox<T> {
    private final T item;

    public T getItem() {
        return item;
    }

    public GenericBox(T item) {
        this.item = item;
    }
}
