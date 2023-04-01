package chapter4_8;

import lombok.Getter;

@Getter
public class Computer {
  private int nMemoryCapacity;
  private int nHDDCapacity;
  private boolean qPowered;

  public Computer(int nInputHDDCapacity, int nInputMemoryCapacity) {
    this.qPowered = false;
    this.nHDDCapacity = nInputHDDCapacity;
    this.nMemoryCapacity = nInputMemoryCapacity;
  }

  void powerOn() {
    this.qPowered = true;
  }

  void powerOff() {
    this.qPowered = false;
  }
}
