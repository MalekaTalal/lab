import java.util.Objects;

public class GenericArray <T>{

    T arr[];
    int num=0;

    public GenericArray() {
        arr = (T[]) new Object[2];
    }

    public void add(T element ){
        if (num<=arr.length-1){
            arr[num++] = element;
        }
    }


    public  void print(){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        GenericArray<Integer> a1=new GenericArray<>();
        a1.add(11);
        a1.add(12);
        a1.print();
        GenericArray<String> a2=new GenericArray<>();
        a2.add("A");
        a2.add("B");
        a2.print();

    }
}
