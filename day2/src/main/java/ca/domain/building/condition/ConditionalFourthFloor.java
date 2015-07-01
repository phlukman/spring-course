package ca.domain.building.condition;

import ca.domain.building.BaseStory;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author patria.lukman
 */

@Component
@Conditional(BuildFourthFloorCondition.class)
public class ConditionalFourthFloor extends BaseStory {

  public ConditionalFourthFloor() {
    super(4);
  }
}
