package ca.learning.spring41;

import ca.domain.building.Building;
import config.ConditionalConfiguration;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  Prerequisites:
 *
 *  <li>
 *    Take notice that this class has no JavaConfig based configuration because all dependencies are declared using annotations.
 *  </li>
 *  <li>
 *    In order to activate the system property, please refer to the corresponding pom.xml file and look for {@link @underline build.fourth.floor}
 *  </li>
 *
 * @author patria.lukman
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalConfiguration.class)
public class CreatingFourthFloorTestCase {

  @Autowired
  @Qualifier("secondaryBuilding")
  private Building building;


  @Test
  public void assertThatBuilding_IsBuilt() {

    assertNotNull(building);
  }

  @Test
  public void assertThatBuilding_HasConditionalFourthFloor() {

    assertThat(building.getConditionalFourthFloor().getFloorNbr(), is(4));
  }


}
