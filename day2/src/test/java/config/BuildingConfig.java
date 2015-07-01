package config;

import ca.domain.building.Building;
import ca.domain.building.FifthStory;
import ca.domain.building.FirstStory;
import ca.domain.building.FourthStory;
import ca.domain.building.SecondStory;
import ca.domain.building.StartupBuilding;
import ca.domain.building.Story;
import ca.domain.building.ThirdStory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author patria.lukman
 */


@Configuration
public class BuildingConfig {


  @Bean
  @Profile("TwoStories")
  Story getFirstStory() {
    return new FirstStory(1);
  }

  @Bean
  @Profile("TwoStories")
  Story getSecondFloor() {
    return new SecondStory(2);
  }

  @Bean
  @Profile("ThreeStories")
  Story getThirdFloor() {
    return new ThirdStory(3);
  }

  @Bean
  @Profile("ThreeStories")
  Story getFourthFloor() {
    return new FourthStory(4);
  }

  @Bean
  @Profile("ThreeStories")
  Story getFifthFloor() {
    return new FifthStory(5);
  }

  @Bean
  @Qualifier("twostoriesBuilding")
  @Profile("TwoStories")
  Building getTwoStoriesBuilding(){
    return new StartupBuilding(getFirstStory(), getSecondFloor());
  }

  @Bean
  @Qualifier("threestoriesBuilding")
  @Profile("ThreeStories")
  Building getThreeStoriesBuilding(){
    return new StartupBuilding(getThirdFloor(), getFourthFloor(),getFifthFloor());
  }


}
