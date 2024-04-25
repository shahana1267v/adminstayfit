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

public abstract class FragmentUserAdapterBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final AppCompatImageView loginUser;

  @NonNull
  public final AppCompatTextView titleTv;

  @NonNull
  public final AppCompatTextView userDetails;

  protected FragmentUserAdapterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, AppCompatImageView loginUser, AppCompatTextView titleTv,
      AppCompatTextView userDetails) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.loginUser = loginUser;
    this.titleTv = titleTv;
    this.userDetails = userDetails;
  }

  @NonNull
  public static FragmentUserAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_adapter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentUserAdapterBinding>inflateInternal(inflater, R.layout.fragment_user_adapter, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_user_adapter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentUserAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentUserAdapterBinding>inflateInternal(inflater, R.layout.fragment_user_adapter, null, false, component);
  }

  public static FragmentUserAdapterBinding bind(@NonNull View view) {
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
  public static FragmentUserAdapterBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentUserAdapterBinding)bind(component, view, R.layout.fragment_user_adapter);
  }
}
