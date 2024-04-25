package com.bigOne.adminstayfit.ui.bmi_calculator;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.bigOne.adminstayfit.R;

public class BmiCalculatorFragmentDirections {
  private BmiCalculatorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionBmiCalculatorToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_bmi_calculator_to_homeFragment);
  }
}
