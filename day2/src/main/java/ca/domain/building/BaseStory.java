package ca.domain.building;

/**
 * @author patria.lukman
 */
public class BaseStory implements Story {


  private int floorNbr;

  //******************* constructors ******************//

  public BaseStory(int floorNbr) {
    this.floorNbr = floorNbr;
  }

  //******************* getter/setter ******************//

  public int getFloorNbr() {
    return floorNbr;
  }
}
