package com.firozpocyt.sampleuitest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testSubmitButton_expectedValueCorrect(){
        onView(withId(R.id.txt_title)).perform(typeText("firoz"))
        onView(withId(R.id.txt_description)).perform(typeText("shaikh"))

        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.text_massage)).check(matches(withText("Title - firoz | Desc - shaikh")))
    }
}