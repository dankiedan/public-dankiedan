public class Enums {

    enum Transport{
        PLANE(600), TRAIN(80), CAR(50);

        int speed;

        Transport(int s) {
            speed = s;
        }
    }
    public static void main(String[] args) {

    System.out.println(Transport.CAR);
    System.out.println(Transport.TRAIN.speed);

    }
}
