import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        car car=new car();
        System.out.println("1-Car");
        car.company="Mercedes Benz";
        car.name="Mercedes benz w210";
        car.speed="300";
        car.price=6000;
        car.getInfo();
        System.out.println("-------------------------------------\n2-Car");

        car car2=new car();
        car2.company="Toyota";
        car2.name="Toyota camry lx 75";
        car2.speed="280";
        car2.price=3000;
        car2.getInfo();
        System.out.println("-------------------------------------\n3-CAr");

        car car3=new car();
        car3.company="Lexus";
        car3.name="Lexus 570";
        car3.speed="240";
        car3.price=4000;
        car3.getInfo();
        System.out.println("-------------------------------------\n4-Car");

        car car4=new car();
        car4.company="Mercedes Benz";
        car4.name="Mercedes benz w210 Brabus";
        car4.speed="360";
        car4.price=2000;
        car4.getInfo();
        System.out.println("-------------------------------------\n5-Car");

        car car5=new car();
        car5.company="Ran Rower";
        car5.name="Ran Rower Sport";
        car5.speed="230";
        car5.price=10000;
        car5.getInfo();
        System.out.println("-------------------------------------");

        car [] cars= new car[5];

        cars[0]= car;
        cars[1]=car2;
        cars[2]=car2;
        cars[3]=car2;
        cars[4]=car2;

        int maxPrice= cars[0].price;
        for (int i = 0; i < cars.length ; i++) {
            if (maxPrice<=cars[i].price){
                maxPrice=cars[i].price;
            }
        }
        for (car car1: cars) {
         if( car.price == maxPrice){
             car1.getInfo();
             break;
         }
        }

    }
}