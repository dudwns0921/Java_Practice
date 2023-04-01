package chapter4_5;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TV extends Electronics {
  private int size;

  public TV(int nInputSize) {
    this.size = nInputSize;
  }

}
