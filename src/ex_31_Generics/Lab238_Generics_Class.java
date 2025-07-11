package ex_31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericClass g = new GenericClass(10);
        GenericClass g1 = new GenericClass("Pramod");
        GenericClass g2 = new GenericClass(true);
        GenericClass g3 = new GenericClass(3.14);//pi

        // T -> it is placeholder only -> it can be any data type.
        //Get data
        printData(g);
        printData(g1);
        printData(g2);
        printData(g3);

        //Set data
        g.setData(20);
        g1.setData("Dutta");
        g2.setData(false);
        g3.setData(1.61);//golden ratio

        //Get data again after set data
        printData(g);
        printData(g1);
        printData(g2);
        printData(g3);
    }

    // Generic method to print type and value
    public static <T> void printData(GenericClass<T> any) {
        System.out.println("Type: " + any.getData().getClass().getSimpleName());
        System.out.println("Value: " + any.getData());
        System.out.println();
    }

}


class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}