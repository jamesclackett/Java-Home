package generics.classes;

// 'N extends N' means a generic that can only be subset of Number
public class MyGenericClass<E, N extends Number> {
    E e;

    MyGenericClass(E e){
        this.e = e;
    }

    public E getValue(){
        return e;
    }
}
