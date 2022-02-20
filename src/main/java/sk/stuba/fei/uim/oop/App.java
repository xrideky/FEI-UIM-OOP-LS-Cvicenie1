package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String [] args) {
        System.out.println("6+8 je "+ App.scitaj(6,8)); //mozeme zapisat aj bez App a to ze scitaj je zapisane
                                                              //kurzivou znamena ze volame staticku metodu
                                                              //metody z vlastnej triedy mozeme volat aj bez toho aby
                                                              //sme tam nieco pisali (App)
    }

    public static int scitaj(int a,int b){
        return a+b;
    }
}
