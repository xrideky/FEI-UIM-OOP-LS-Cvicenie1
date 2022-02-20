package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String [] args) {
       int a=0;
       while(a<6){
           System.out.println("fake for a = "+a);
           a=a+2; //a++
       }

       System.out.println();

       int b=0;
       do{
           b=b+2;
           System.out.println("fake for b = "+b);
       } while(b<6);

    }
}
