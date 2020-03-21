package behavioral.mediator.before;

interface Button {
    void press();
}

interface  Light {
    void turnOn();
}

class SmallButton implements Button {
    BlueLight blueLight;

    public SmallButton(BlueLight blueLight) {
        this.blueLight = blueLight;
    }

    @Override
    public void press() {
        System.out.println("Small button pressed.");
        blueLight.turnOn();
    }
}

class BigButton implements Button {
    BlueLight blueLight;
    RedLight redLight;

    public BigButton(BlueLight blueLight, RedLight redLight) {
        this.blueLight = blueLight;
        this.redLight = redLight;
    }

    @Override
    public void press() {
        System.out.println("Big button pressed.");
        blueLight.turnOn();
        redLight.turnOn();
    }
}

class BlueLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Blue light turned on.");
    }

    public void turnOff() {
        System.out.println("blue light turned off");
    }
}

class RedLight implements Light {
    BlueLight blueLight;

    public RedLight(BlueLight blueLight) {
        this.blueLight = blueLight;
    }

    @Override
    public void turnOn() {
        System.out.println("red light turned on");
    }

    public void manualTurnOff() {
        System.out.println("Turning off red light");
        blueLight.turnOff();
    }
}

public class MediatorBefore  {
    public static void main(String args[]) {
        BlueLight blueLight = new BlueLight();
        RedLight redLight = new RedLight(blueLight);

        SmallButton smallButton = new SmallButton(blueLight);
        BigButton bigButton = new BigButton(blueLight, redLight);

        smallButton.press();
        bigButton.press();
    }
}
