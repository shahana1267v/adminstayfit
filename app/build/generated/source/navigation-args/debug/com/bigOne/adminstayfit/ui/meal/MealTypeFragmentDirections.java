package com.bigOne.adminstayfit.ui.meal;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.bigOne.adminstayfit.R;

public class MealTypeFragmentDirections {
  private MealTypeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMealTypeFragmentToMealLogListSaveFragment() {
    return new ActionOnlyNavDirections(R.id.action_mealTypeFragment_to_mealLogListSaveFragment);
  }
}
