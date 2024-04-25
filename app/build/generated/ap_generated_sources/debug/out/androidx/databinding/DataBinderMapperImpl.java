package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.bigOne.adminstayfit.DataBinderMapperImpl());
  }
}
