package ca.learning.spring41.driver;

import static ca.learning.spring41.driver.Constants.ALONSO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @author patria.lukman
 */

@Component
@Qualifier("alonso")
public class FernandoAlonso implements F1Driver {


  private  String name = "Fernando Alonso";

  @Value("${test.com}")
  private String extraValue;


  public FernandoAlonso() {
    this.name = ALONSO;
  }

  //******************* business methods ******************//

  public void drive() {
    System.out.println("This is ".concat(name).concat("/t driving..."));
  }



  //******************* getter/setter ******************//
  public String getName() {
    return name;
  }

  public String getExtraValue() {
    return extraValue;
  }
}
