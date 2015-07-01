package ca.domain.building.condition;

import ca.domain.building.Building;
import ca.domain.building.Story;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author patria.lukman
 */
@Component
@Qualifier("secondaryBuilding")
public class SecondaryBuilding implements Building {

  private Story conditionFourthFloor;



  @Autowired
  public SecondaryBuilding(Story conditionFourthFloor) {
    super();
    this.conditionFourthFloor = conditionFourthFloor;

  }

  //******************* getter/setter ******************//
  @Override
  public Story getFirstStory() {
    return null;
  }

  @Override
  public Story getSecondStory() {
    return null;
  }

  @Override
  public Story getThirdStory() {
    return null;
  }

  @Override
  public Story getFourthStory() {
    return null;
  }

  @Override
  public Story getFifthStory() {
    return null;
  }

  public Story getConditionalFourthFloor() {
    return conditionFourthFloor;
  }

  @Override
  public int getNumberOFFloors() {
    return 1;
  }
}
