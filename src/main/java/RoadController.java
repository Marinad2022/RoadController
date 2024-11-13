import java.util.Scanner;

public class RoadController {
    private static int passengerCarMaxWeight = 3500; //kg макс вес легкового авто
    private static int cargoCarMaxWeight = 30_000; //kg макс вес грузового авто
    private static int passengerCarMaxHeight = 2000; //mm макс высота легкового авто
    private static int controllerMaxHeight = 4000; //mm мак высота конторольного пункта
    private static int passengerCarPrice = 3000; //rub стоимость легкового авто
    private static int cargoCarPrice = 4000; //rub стоимость грузового авто
    private static int vehicleAdditionalPrice = 200; //rub стоимость прицепа

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");
        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 1; i <= carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println("Текущая машина имеет параметры: \n" + car.toString());

            if (car.isSpecial()) {
                System.out.println("Проезд разрешен! " + " Счастливого пути!");
                continue;
            }

            int endPrice = calculatePrice(car);
            if (endPrice == -1) {
                System.out.println("Проезд запрещен!!! " +
                        "\nПараметры вашего транспортного средства не подходят для пропуска:(");
                continue;
            }
            System.out.println( "Проезд разрешен! " + "\nЦена текущего автомобиля равна: " + endPrice + "руб");
        }
    }

    public static int calculatePrice(Car car) {
        int currentHeight = car.getHeight();
        int currentPrice = 0;
        int currentWeight = car.getWeight();

        if (currentHeight >= controllerMaxHeight) {
            currentPrice = -1;
            return currentPrice;
        } else if (currentWeight > passengerCarMaxWeight) {
            currentPrice = cargoCarPrice;
            if (car.isHasVehicle()) {
                currentPrice += vehicleAdditionalPrice;
            }
        } else {
            currentPrice = passengerCarPrice;
            if (car.isHasVehicle()) {
                currentPrice += vehicleAdditionalPrice;
            }
        }
        return currentPrice;
    }
}

