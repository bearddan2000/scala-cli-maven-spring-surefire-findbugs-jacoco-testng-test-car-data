import io.cucumber.java.ParameterType;
import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
class RunCucumberTest {

  @ParameterType("car")  // regexp
  def car(all: String): example.model.Car ={  // type, name (from method)
    val service = new example.service.CarServiceImpl();
    val car = service.createCar();
    return car;       // transformer function
  }
}
