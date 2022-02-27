package sk.stuba.fei.uim.oop;

public class App {

    public static void main(String [] args) {
        System.out.println("Dlzka: "+args.length); //dlzka bude 0 lebo nemame ziadne argumenty
        //ale keby si na zaciatku nastavime tak ich spocita
        //vsetko su to ale stringy aj ked zapiseme only cisla
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        
        int[] mojePole=new int [10];

        for(int i=0;i<mojePole.length;i++){
            if(i==0){
                mojePole[i]=1;
                continue;
            }
            mojePole[i]=mojePole[i-1]*2;

        }
        for(int i=0;i<mojePole.length;i++){
            //System.out.println(i+ " : " +mojePole[i]);
            App.vypis(i);
        }

    }
    public static void vypis(int a){
        System.out.println(String.format("Funkcia bola zavolaná %d.krát",a+1)); //a+1 pretoze polia sa indexuju od 0 co je v tomto pripade nedava zmysel
    }
}
