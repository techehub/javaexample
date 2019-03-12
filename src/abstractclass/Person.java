package abstractclass;

public class Person {

    String name;

    void drive (AltoVXI car){

        car.start();
        car.accelerate();
        car.stop();

    }


    void drive (AltoK10 car){

        car.start();
        car.accelerate();
        car.stop();

    }


    void drive (BenzGLA car){

        car.start();
        car.accelerate();
        car.stop();

    }


    void drive (Car car){

        car.start();
        car.accelerate();
        car.stop();

        if (car instanceof  BenzGLA)
            ((BenzGLA)car).heatSeat();

    }

}
