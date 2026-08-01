class Test {

    private Test() {
        System.out.println("Private Constructor");
    }

    public static Test createObject() {
        return new Test();
    }
}

public class PrivateConstructorDemo {
    public static void main(String[] args) {
        Test t = Test.createObject();
    }
}
