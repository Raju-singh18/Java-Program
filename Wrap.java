public class Wrap {
    public static void main(String[] args) {
        int x = Integer.parseInt("1234");
        System.out.println(x);
        Integer it = Integer.valueOf("1234");
        int y = it.intValue();
        System.out.println(y);
        Integer i = Integer.valueOf("10110", 2);
        int z = i.intValue();
        System.out.println(z);

        Double x1 = Double.valueOf("56");
        double z1 = x1.doubleValue();
        System.out.println(z1);

        int num = 100;
        // Autoboxing
        Integer obj = num;
        System.out.println("Primitive: " + num);
        System.out.println("Wrapper Object: " + obj);


        Integer obj1 = 200;
        // Unboxing
        int num1 = obj;
        System.out.println("Wrapper Object: " + obj1);
        System.out.println("Primitive: " + num1);

        //! Convert String to Different Primitive Types
        String s1 = "100";
        String s2 = "12.5";
        String s3 = "true";
        int il = Integer.parseInt(s1);
        double d = Double.parseDouble(s2);
        boolean b = Boolean.parseBoolean(s3);
        System.out.println(il);
        System.out.println(d);
        System.out.println(b);

        // !Compare Wrapper Objects
        Integer a = 100;
        Integer e = 100;
        Integer c = 200;
        System.out.println(a.equals(e));
        System.out.println(a.equals(c));

        // !Using Different Wrapper Class Methods
        Integer nu = 25;
        System.out.println("Byte Value : " + nu.byteValue());
        System.out.println("Short Value: " + nu.shortValue());
        System.out.println("Int Value  : " + nu.intValue());
        System.out.println("Long Value : " + nu.longValue());
        System.out.println("Float Value: " + nu.floatValue());
        System.out.println("Double Value: " + nu.doubleValue());
    }
}

