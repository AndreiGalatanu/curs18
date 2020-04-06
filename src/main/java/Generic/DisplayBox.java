package Generic;

public class DisplayBox<T extends Displayble> {

    private final T item;

    public DisplayBox(T item) {
        this.item = item;
    }

    public String displayItem() {
        return item.display();
    }
}
