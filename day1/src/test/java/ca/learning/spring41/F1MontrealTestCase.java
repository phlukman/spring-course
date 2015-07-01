package ca.learning.spring41;

import ca.learning.spring41.config.F1MontrealConfig;
import ca.learning.spring41.driver.Constants;
import ca.learning.spring41.driver.F1Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author patria.lukman
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = F1MontrealConfig.class)
public class F1MontrealTestCase {

  @Autowired
  @Qualifier("alonso")
  private F1Driver driver;




  @Test
  public void assertThatDriverIsNotNull(){

      assertNotNull(driver);
  }

  @Test
  public void assertThatDriverIsAlonso(){

    assertEquals(Constants.ALONSO,driver.getName());

  }

  @Test
  public void assertTestVariable(){
    assertEquals(driver.getExtraValue(),"test");
  }
}
