package eckbert.von.schleck.calculon.test.cucumber;

import android.test.ActivityInstrumentationTestCase2;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import eckbert.von.schleck.calculon.CalculonActivity;
import eckbert.von.schleck.calculon.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class CalculonSteps extends ActivityInstrumentationTestCase2<CalculonActivity> {

    public CalculonSteps() {
        super(CalculonActivity.class);
    }

    @Given("^the CalculonApp is running$")
    public void the_calculon_app_is_running() {
        assertNotNull(getActivity());
    }

    @Then("^I enter \"([^\"]*)\" into the input field$")
    public void i_enter_into_the_input_field(String text) {
        onView(withId(R.id.editText1)).perform(typeText(text), closeSoftKeyboard());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
