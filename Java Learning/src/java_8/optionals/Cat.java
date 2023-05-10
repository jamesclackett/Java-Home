package java_8.optionals;

public class Cat {
    String name;
    int age;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}
