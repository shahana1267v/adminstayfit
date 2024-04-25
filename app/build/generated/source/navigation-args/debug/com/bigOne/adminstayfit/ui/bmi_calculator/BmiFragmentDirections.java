package com.bigOne.adminstayfit.ui.bmi_calculator;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.bigOne.adminstayfit.R;

public class BmiFragmentDirections {
  private BmiFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionBmiFragmentToBmiCalculator() {
    return new ActionOnlyNavDirections(R.id.action_bmi_fragment_to_bmi_calculator);
  }
}
