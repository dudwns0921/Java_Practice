package chapter3_4;

import chapter3_1.Electronics;

public class TV extends Electronics {
  private int nSize = 0;

  public void setsize(int new_size) {
    this.nSize = new_size;
  }

  public int getSize() {
    return this.nSize;
  }
}
