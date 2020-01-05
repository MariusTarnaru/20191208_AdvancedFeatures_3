package AdvancedFeatures;



public class GenericBox<T> {
    private T item;


    public GenericBox(T item) {
        this.item = item;
    }

    public void setItem(T item){
        this.item = item;
    }


    @Override
    public String toString() {
        return item.toString();
        /*return "GenericBox{" +
                "item=" + item +
                '}';*/
    }

    public T getItem(){
        return item;


    }

}
