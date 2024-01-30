import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class VariablesStepDef {
    double num1 = 0;
    double num2 = 0;
    int num3 = 0;
    int num4 = 0;

    @Given("{string} is {double}")
    public void is(String arg0, double d1) {
        num1 = d1;
    }

    @And("And {string} is {double}")
    public void andIs(String arg0, double d1) {
        num2 = d1;
    }

    @Then("We know which one is smaller")
    public void weKnowWhichOneIsSmaller() {
        Assertions.assertEquals(num1, num1);
    }


    @Given("{string} value is {int}")
    public void valueIs(String arg0, int int1) {
        num3 = int1;
    }

    @And("And {string} value is {int}")
    public void andValueIs(String arg0, int int1) {
        num4 = int1;
    }

    @Then("We know which one is bigger")
    public void weKnowWhichOneIsBigger() {
        Assertions.assertEquals(num4, num4);
    }
}
