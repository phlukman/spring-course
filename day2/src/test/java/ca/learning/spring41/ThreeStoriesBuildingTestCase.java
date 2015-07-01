package ca.learning.spring41;

import ca.domain.building.Building;
import config.BuildingConfig;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author patria.lukman
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BuildingConfig.class)
@ActiveProfiles("ThreeStories")
public class ThreeStoriesBuildingTestCase {

  @Autowired
  @Qualifier("threestoriesBuilding")
  private Building building;


  @Test
  public void assertThatBuilding_IsBuilt() {

    assertNotNull(building);
  }


  public void assertThatBuilding_HasThreeFloors() {

    assertThat(building.getNumberOFFloors(), is(3));
  }

  @Test
  public void assertThatBuilding_HasThirdStory() {

    assertNotNull(building.getThirdStory());
    assertThat(building.getThirdStory().getFloorNbr(), is(3));
  }


  @Test
  public void assertThatBuilding_HasFourthStory() {
    assertNotNull(building.getFourthStory());
    assertThat(building.getFourthStory().getFloorNbr(), is(4));
  }


  @Test
  public void assertThatBuilding_HasFifthStory() {
    assertNotNull(building.getFifthStory());
    assertThat(building.getFifthStory().getFloorNbr(), is(5));
  }


  @Test
  public void assertThatBuilding_HasNoFirstStory() {
    assertNull(building.getFirstStory());

  }

  @Test
  public void assertThatBuilding_HasNoSecondStory() {
    assertNull(building.getSecondStory());

  }


}
