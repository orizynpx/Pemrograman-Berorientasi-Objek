package Meeting9;

public abstract class Building {
    private String address;
    private int size;
    private int numberOfFloors;

    public int getSize() {
        return this.size;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public abstract double calculateTax();
}

class Skyscraper extends Building {
    @Override
    public double calculateTax() {
        return getNumberOfFloors() * 50000;
    }
}

class House extends Building {
    @Override
    public double calculateTax() {
        return 1000 + getNumberOfFloors() * 200;
    }
}

class Store extends Building {
    private int yearlyNumberOfCustomers;

    @Override
    public double calculateTax() {
        return this.yearlyNumberOfCustomers * 5000 + getSize() * 500;
    }
}