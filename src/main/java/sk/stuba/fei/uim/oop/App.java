package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String [] args) {
        for(int a=0;a<6;a++){
        switch (a) {
            case 1:
                System.out.println("a is one");
                break;
            case 2:
                System.out.println("a is two");
                break;
            case 3:
                System.out.println("a is 3 or 4");
                break;
            default:
                //System.out.println("a is "+a); //toto je dobry sposob ale nie vzdy funguje
                System.out.println(String.format("a is %d", a));

             }
        }
    }
}
