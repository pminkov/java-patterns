package behavioral.mediator.after;

interface Button {
  void press();
}

interface  Light {
  void turnOn();
  void turnOff();
}

interface AbstractMediator {
  void processButtonPress(Button button);
  void processLightManualTurnOff(Light light);
}

class Mediator implements AbstractMediator {
  BlueLight blueLight;
  RedLight redLight;
  BigButton bigButton;
  SmallButton smallButton;

  public void setBlueLight(BlueLight blueLight) {
    this.blueLight = blueLight;
  }

  public void setRedLight(RedLight redLight) {
    this.redLight = redLight;
  }

  public void setBigButton(BigButton bigButton) {
    this.bigButton = bigButton;
  }

  public void setSmallButton(SmallButton smallButton) {
    this.smallButton = smallButton;
  }

  @Override
  public void processButtonPress(Button button) {
    if (button == smallButton) {
      blueLight.turnOn();
    }

    if (button == bigButton) {
      blueLight.turnOn();
      redLight.turnOn();
    }
  }

  @Override
  public void processLightManualTurnOff(Light who) {
    if (who == redLight) {
      blueLight.turnOff();
      redLight.turnOff();
    }
  }
}

class SmallButton implements Button {
  AbstractMediator mediator;

  public SmallButton(AbstractMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void press() {
    System.out.println("Pressed the small button");
    mediator.processButtonPress(this);
  }
}

class BigButton implements Button {
  AbstractMediator mediator;

  public BigButton(AbstractMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void press() {
    System.out.println("Pressed the big button");
    mediator.processButtonPress(this);
  }
}

class BlueLight implements Light {
  AbstractMediator mediator;

  public BlueLight(AbstractMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void turnOn() {
    System.out.println("Blue light turned on");
  }

  public void turnOff() {
    System.out.println("Blue light turned off");
  }
}

class RedLight implements Light {
  AbstractMediator mediator;

  public RedLight(AbstractMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void turnOn() {
    System.out.println("Red light turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("Red light turn off");
  }

  public void manualTurnOff() {
    System.out.println("Manually turning off the red light");
    mediator.processLightManualTurnOff(this);
  }
}

public class MediatorAfter {
  public static void main(String args[]) {
    Mediator mediator = new Mediator();

    BlueLight blueLight = new BlueLight(mediator);
    RedLight redLight = new RedLight(mediator);
    SmallButton smallButton = new SmallButton(mediator);
    BigButton bigButton = new BigButton(mediator);

    mediator.setBlueLight(blueLight);
    mediator.setRedLight(redLight);
    mediator.setBigButton(bigButton);
    mediator.setSmallButton(smallButton);

    smallButton.press();
    bigButton.press();
    redLight.manualTurnOff();
  }
}
