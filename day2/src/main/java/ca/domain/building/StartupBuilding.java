package ca.domain.building;

import java.util.ArrayList;
import java.util.List;

/**
 * @author patria.lukman
 */


public  class StartupBuilding implements Building {


  private Story firstStory;
  private Story secondStory;
  private Story thirdStory;
  private Story fourthStory;
  private Story fifthStory;



  private List<Story> stories = new ArrayList<Story>();


  //******************* constructors ******************//

  public StartupBuilding() {

  }

  public StartupBuilding(Story firstStory, Story secondStory) {
    this.firstStory = firstStory;
    this.secondStory = secondStory;
    stories.add(firstStory);
    stories.add(secondStory);
  }

  public StartupBuilding(Story thirdStory, Story fourthStory, Story fifthStory) {
    this.thirdStory = thirdStory;
    this.fourthStory = fourthStory;
    this.fifthStory = fifthStory;
    stories.add(thirdStory);
    stories.add(fourthStory);
    stories.add(fifthStory);


  }



  //******************* business methods ******************//


  public int getNumberOFFloors() {
    return stories.size();
  }

  //******************* getter/setter ******************//
  public Story getFirstStory() {
    return firstStory;
  }

  public Story getSecondStory() {
    return secondStory;
  }

  public Story getThirdStory() {
    return thirdStory;
  }

  public Story getFourthStory() {
    return fourthStory;
  }

  public Story getFifthStory() {
    return fifthStory;
  }

  @Override
  public Story getConditionalFourthFloor() {
    return null;
  }
}
