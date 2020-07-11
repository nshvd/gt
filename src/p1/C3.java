package p1;

import sun.misc.Unsafe;

public class C3 {
    public static void sayHello(String name){
        System.out.println("Hello: " + name);
        System.out.println("abc");
        int conflict = 122134112;
        System.out.println("GIVE ME A CONFLICT!");
    }
}
