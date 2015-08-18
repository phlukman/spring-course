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
@ActiveProfiles("TwoStories")
public class TwoStoriesBuildingTestCase {

  @Autowired
  @Qualifier("twostoriesBuilding")
  private Building building;


  @Test
  public void assertThatBuilding_IsBuilt() {

    assertNotNull(building);
  }

  @Test
  public void assertThatBuilding_HasTwoFloors() {

    assertThat(building.getNumberOFFloors(), is(2));
  }

  @Test
  public void assertThatBuilding_HasFirstStory() {

    assertNotNull(building.getFirstStory());
    assertThat(building.getFirstStory().getFloorNbr(), is(3));
  }


  @Test
  public void assertThatBuilding_HasSecondStory() {
    assertNotNull(building.getSecondStory());
    assertThat(building.getSecondStory().getFloorNbr(), is(2));
  }

  @Test
  public void assertThatBuilding_HasNoThirdStory() {
    assertNull(building.getThirdStory());

  }

  @Test
  public void assertThatBuilding_HasNoFourthStory() {
    assertNull(building.getFourthStory());

  }

  @Test
  public void assertThatBuilding_HasNoFifthStory() {
    assertNull(building.getFifthStory());

  }
}
