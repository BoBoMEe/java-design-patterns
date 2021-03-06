package com.java.bobomee.java_design_patterns_module.template;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.java.bobomee.java_design_patterns_module.BaseActivity;
import com.java.bobomee.java_design_patterns_module.R;

/**
 * Created on 16/8/26.下午11:52.
 *
 * @author bobomee.
 * @description:
 */
public class TemplateActivity extends BaseActivity {

  @BindView(R.id.btn_click) Button mBtnClick;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.btn_layout);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.btn_click)
  public void setBtnClick(){
    AbsComputer absComputer = new CoderCumputer();

    absComputer.start();

    absComputer = new MilitaryComputer();
    absComputer.start();
  }
}
