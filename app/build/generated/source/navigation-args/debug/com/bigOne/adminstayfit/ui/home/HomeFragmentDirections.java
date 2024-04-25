package com.bigOne.adminstayfit.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.bigOne.adminstayfit.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToBmiFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_bmi_fragment);
  }

  @NonNull
  public static ActionHomeFragmentToMealLogFragment actionHomeFragmentToMealLogFragment(
      int mealType) {
    return new ActionHomeFragmentToMealLogFragment(mealType);
  }

  public static class ActionHomeFragmentToMealLogFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToMealLogFragment(int mealType) {
      this.arguments.put("mealType", mealType);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToMealLogFragment setMealType(int mealType) {
      this.arguments.put("mealType", mealType);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("mealType")) {
        int mealType = (int) arguments.get("mealType");
        __result.putInt("mealType", mealType);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_mealLogFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMealType() {
      return (int) arguments.get("mealType");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToMealLogFragment that = (ActionHomeFragmentToMealLogFragment) object;
      if (arguments.containsKey("mealType") != that.arguments.containsKey("mealType")) {
        return false;
      }
      if (getMealType() != that.getMealType()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getMealType();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToMealLogFragment(actionId=" + getActionId() + "){"
          + "mealType=" + getMealType()
          + "}";
    }
  }
}
