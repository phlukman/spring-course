package ca.domain.building;

/**
 * @author patria.lukman
 */
public interface Building {


  Story getFirstStory();

  Story getSecondStory();

  Story getThirdStory();

  Story getFourthStory();

  Story getFifthStory();

  Story getConditionalFourthFloor();

  int getNumberOFFloors();
}
