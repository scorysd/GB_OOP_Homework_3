package Task_2;

public class App {
    public static void main(String[] args) {
        Foo foo = new Foo.Builder().arg1(33).arg5("sds").build();
        Foo foo1 = new  Foo.Builder().build();
        Foo foo2 = new  Foo.Builder().arg3(3443.3).arg7("sqwee").build();
        System.out.println(foo);
        System.out.println(foo1);
        System.out.println(foo2);
    }
}

