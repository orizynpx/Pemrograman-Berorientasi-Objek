package Meeting9;

public interface Rechargeable {
    void recharge();
}

class Smartphone implements Rechargeable {
    private boolean hasSimCard;

    @Override
    public void recharge() {
        System.out.println("Recharging phone until 100%");
    }
}

class Laptop implements Rechargeable {
    @Override
    public void recharge() {
        System.out.println("Recharging laptop until 80%, then switch to direct power");
    }
}

class Flashlight implements Rechargeable {
    private int lightIntensity;

    @Override
    public void recharge() {
        System.out.println("Recharging flashlight");
    }
}