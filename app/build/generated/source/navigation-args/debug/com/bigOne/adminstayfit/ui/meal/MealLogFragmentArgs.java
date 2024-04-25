package com.bigOne.adminstayfit.ui.meal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MealLogFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MealLogFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private MealLogFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealLogFragmentArgs fromBundle(@NonNull Bundle bundle) {
    MealLogFragmentArgs __result = new MealLogFragmentArgs();
    bundle.setClassLoader(MealLogFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("mealType")) {
      int mealType;
      mealType = bundle.getInt("mealType");
      __result.arguments.put("mealType", mealType);
    } else {
      throw new IllegalArgumentException("Required argument \"mealType\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MealLogFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    MealLogFragmentArgs __result = new MealLogFragmentArgs();
    if (savedStateHandle.contains("mealType")) {
      int mealType;
      mealType = savedStateHandle.get("mealType");
      __result.arguments.put("mealType", mealType);
    } else {
      throw new IllegalArgumentException("Required argument \"mealType\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getMealType() {
    return (int) arguments.get("mealType");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("mealType")) {
      int mealType = (int) arguments.get("mealType");
      __result.putInt("mealType", mealType);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("mealType")) {
      int mealType = (int) arguments.get("mealType");
      __result.set("mealType", mealType);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    MealLogFragmentArgs that = (MealLogFragmentArgs) object;
    if (arguments.containsKey("mealType") != that.arguments.containsKey("mealType")) {
      return false;
    }
    if (getMealType() != that.getMealType()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getMealType();
    return result;
  }

  @Override
  public String toString() {
    return "MealLogFragmentArgs{"
        + "mealType=" + getMealType()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull MealLogFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int mealType) {
      this.arguments.put("mealType", mealType);
    }

    @NonNull
    public MealLogFragmentArgs build() {
      MealLogFragmentArgs result = new MealLogFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setMealType(int mealType) {
      this.arguments.put("mealType", mealType);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getMealType() {
      return (int) arguments.get("mealType");
    }
  }
}
