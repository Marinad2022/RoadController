public class Camera {
    private static String[] numbers = {
            "А100ВР123",
            "В201ОНР123",
            "О102МР123",
            "М103ВР123",
            "Р104ВР123",
            "Н105ВР123",
            "У106ВР123",
            "Х107ВР123",
            "С108ВР123",
            "Т109ВР123",
    };

    public static Car getNextCar() {
        int startForNumber = 0;
        int endForNumber = 9;
        int randomIndexNumber = startForNumber +
                (int) (Math.random() * ((endForNumber + 1) - startForNumber));
        String randomNumber = numbers[randomIndexNumber];

        int startForHeightCar = 1200; //указываем диапазон по высоте
        int endForHeightCar = 4150;
        int randomHeightCar = startForHeightCar +
                (int) (Math.random() * ((endForHeightCar + 1) - startForHeightCar));

        int startForWeightCar = 1500; // указываем диапазон по весу
        int endForWeightCar = 32_000;
        int randomWeightCar = startForWeightCar +
                (int) (Math.random() * ((endForWeightCar + 1) - startForWeightCar));

        int startForVehicle = 0; // прицеп
        int endForVehicle = 1;
        int randomVehicle = startForVehicle +
                (int) (Math.random() * ((endForVehicle + 1) - startForVehicle));
        boolean randomHasVehicle;
        if (randomVehicle == 0) {
            randomHasVehicle = false;
        } else {
            randomHasVehicle = true;
        }


        int startForSpecial = 0; // спецразрешение
        int endForSpecial = 1;
        int randomSpecial = startForSpecial +
                (int) (Math.random() * ((endForSpecial + 1) - startForSpecial));
        boolean randomIsSpecial;
        if (randomSpecial == 0) {
            randomIsSpecial = false;
        } else {
            randomIsSpecial = true;
        }

        Car car = new Car(
                randomNumber, randomHeightCar, randomWeightCar,
                randomHasVehicle, randomIsSpecial
        );
        return car;
    }
}

