package techtest;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

  /*  @Given("^I cook some chicken poppers$")
    public void i_cook_some_chicken_poppers(int poppers) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Belly belly = new Belly();
        belly.eat(poppers);
    }*/

    @Given("^I cook (\\d+) chicken poppers$")
    public void i_cook_chicken_poppers(int poppers) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        Belly belly = new Belly();
        belly.eat(poppers);
    }

    @When("^I eat the poppers$")
    public void i_eat_the_poppers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I will be full$")
    public void i_will_be_full() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

}
