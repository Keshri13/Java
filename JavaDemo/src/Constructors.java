
public class Constructors {

    Constructors(){

        System.out.println("In Constructor's Constructor");
        
    }

    public static void createConstructors(){
        B b = new B();
    }

}

class A {

    A(){
        System.out.println("In A's Constructor");
    }
}

class B extends A {

    B(){
        System.out.println("In B's Constructor");
    }

}