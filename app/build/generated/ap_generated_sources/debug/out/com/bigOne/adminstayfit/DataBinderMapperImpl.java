package com.bigOne.adminstayfit;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.bigOne.adminstayfit.databinding.FragmentLoginBindingImpl;
import com.bigOne.adminstayfit.databinding.FragmentLoginUserBindingImpl;
import com.bigOne.adminstayfit.databinding.FragmentTrainerAdapterBindingImpl;
import com.bigOne.adminstayfit.databinding.FragmentTrainerBindingImpl;
import com.bigOne.adminstayfit.databinding.FragmentUserAdapterBindingImpl;
import com.bigOne.adminstayfit.databinding.ListItemBindingImpl;
import com.bigOne.adminstayfit.databinding.ListTrainerItemBindingImpl;
import com.bigOne.adminstayfit.databinding.ListUserItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTLOGIN = 1;

  private static final int LAYOUT_FRAGMENTLOGINUSER = 2;

  private static final int LAYOUT_FRAGMENTTRAINER = 3;

  private static final int LAYOUT_FRAGMENTTRAINERADAPTER = 4;

  private static final int LAYOUT_FRAGMENTUSERADAPTER = 5;

  private static final int LAYOUT_LISTITEM = 6;

  private static final int LAYOUT_LISTTRAINERITEM = 7;

  private static final int LAYOUT_LISTUSERITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.fragment_login_user, LAYOUT_FRAGMENTLOGINUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.fragment_trainer, LAYOUT_FRAGMENTTRAINER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.fragment_trainer_adapter, LAYOUT_FRAGMENTTRAINERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.fragment_user_adapter, LAYOUT_FRAGMENTUSERADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.list_item, LAYOUT_LISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.list_trainer_item, LAYOUT_LISTTRAINERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bigOne.adminstayfit.R.layout.list_user_item, LAYOUT_LISTUSERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGINUSER: {
          if ("layout/fragment_login_user_0".equals(tag)) {
            return new FragmentLoginUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login_user is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAINER: {
          if ("layout/fragment_trainer_0".equals(tag)) {
            return new FragmentTrainerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trainer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAINERADAPTER: {
          if ("layout/fragment_trainer_adapter_0".equals(tag)) {
            return new FragmentTrainerAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trainer_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUSERADAPTER: {
          if ("layout/fragment_user_adapter_0".equals(tag)) {
            return new FragmentUserAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_user_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM: {
          if ("layout/list_item_0".equals(tag)) {
            return new ListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTTRAINERITEM: {
          if ("layout/list_trainer_item_0".equals(tag)) {
            return new ListTrainerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_trainer_item is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTUSERITEM: {
          if ("layout/list_user_item_0".equals(tag)) {
            return new ListUserItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_user_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/fragment_login_0", com.bigOne.adminstayfit.R.layout.fragment_login);
      sKeys.put("layout/fragment_login_user_0", com.bigOne.adminstayfit.R.layout.fragment_login_user);
      sKeys.put("layout/fragment_trainer_0", com.bigOne.adminstayfit.R.layout.fragment_trainer);
      sKeys.put("layout/fragment_trainer_adapter_0", com.bigOne.adminstayfit.R.layout.fragment_trainer_adapter);
      sKeys.put("layout/fragment_user_adapter_0", com.bigOne.adminstayfit.R.layout.fragment_user_adapter);
      sKeys.put("layout/list_item_0", com.bigOne.adminstayfit.R.layout.list_item);
      sKeys.put("layout/list_trainer_item_0", com.bigOne.adminstayfit.R.layout.list_trainer_item);
      sKeys.put("layout/list_user_item_0", com.bigOne.adminstayfit.R.layout.list_user_item);
    }
  }
}
