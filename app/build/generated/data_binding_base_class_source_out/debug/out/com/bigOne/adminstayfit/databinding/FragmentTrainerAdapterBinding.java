// Generated by data binding compiler. Do not edit!
package com.bigOne.adminstayfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bigOne.adminstayfit.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTrainerAdapterBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final AppCompatTextView foodDetails;

  @NonNull
  public final AppCompatTextView titleTv;

  @NonNull
  public final AppCompatImageView userImage;

  protected FragmentTrainerAdapterBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CardView cardView, AppCompatTextView foodDetails,
      AppCompatTextView titleTv, AppCompatImageView userImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.foodDetails = foodDetails;
    this.titleTv = titleTv;
    this.userImage = userImage;
  }

  @NonNull
  public static FragmentTrainerAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_trainer_adapter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTrainerAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTrainerAdapterBinding>inflateInternal(inflater, R.layout.fragment_trainer_adapter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTrainerAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_trainer_adapter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTrainerAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTrainerAdapterBinding>inflateInternal(inflater, R.layout.fragment_trainer_adapter, null, false, component);
  }

  public static FragmentTrainerAdapterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTrainerAdapterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentTrainerAdapterBinding)bind(component, view, R.layout.fragment_trainer_adapter);
  }
}