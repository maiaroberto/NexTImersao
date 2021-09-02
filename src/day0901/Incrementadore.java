package day0901;

public class Incrementadore {
    
    public static void main(String[] args) {

        int i = 0;

        System.out.println("      i++ => " + (i++));
        System.out.println("        i => " + i);

        System.out.println("      ++i => " + (++i));
        System.out.println("        i => " + i);

        System.out.println("i = i + 1 => " + (i = i + 1));
        System.out.println("        i => " + i);

    }
}
