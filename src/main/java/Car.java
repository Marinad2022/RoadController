public class Car{
    private String number;
    private int height;
    private int weight;
    private boolean hasVehicle;
    private boolean isSpecial;
    public Car(String number, int height, int weight, boolean hasVehicle, boolean isSpecial) {
        this.number = number;
        this.height = height;
        this.weight = weight;
        this.hasVehicle = hasVehicle;
        this.isSpecial = isSpecial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    @Override
    public String toString() {
        return
                "Номер ТС:'" + number + '\'' +
                        ", Высота ТС:'" + height + "мм" + '\'' +
                        ", Вес ТС:'" + weight + "кг" + '\'' +
                        ", Прицеп:'" + hasVehicle + '\'' +
                        ", Спецпропуск:'" + isSpecial + '\'' +
                        '.';
    }
}

