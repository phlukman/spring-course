package ca.learning.spring41.driver;

import static ca.learning.spring41.driver.Constants.HAMILTON;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/**
 * @author patria.lukman
 */

@Component
@Qualifier("hamilton")
public class LewisHamilton implements F1Driver {


  private  String name = "Lewis Hamilton";


  public LewisHamilton() {

    name = HAMILTON;
  }

  //******************* business methods ******************//
  public void drive() {
    System.out.println("This is ".concat(name).concat("/t driving..."));
  }


  public String getName() {
    return name;
  }

  public String getExtraValue() {
    return null;
  }
}
