package com.dreamguys.truelysell;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.dreamguys.truelysell.adapters.ViewPagerAdapter;
import com.dreamguys.truelysell.fragments.phase3.ServiceActiveInActiveFragment;
import com.dreamguys.truelysell.utils.AppUtils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyProviderServicesActivitynew extends BaseActivity implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.tab_my_service)
    TabLayout tabMyService;
    @BindView(R.id.viewpager_my_service)
    CustomViewPager viewpagerMyService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_services_new);
        uiInit();
    }

    private void uiInit() {
        ButterKnife.bind(this);
        setToolBarTitle(AppUtils.cleanLangStr(this,
                homeStringsList.getLblMyServices().getName(), R.string.txt_my_providers));
        ivSearch.setVisibility(View.GONE);
        ivUserlogin.setVisibility(View.GONE);

        if (AppUtils.isThemeChanged(this)) {
            tabMyService.setSelectedTabIndicatorColor(AppUtils.getPrimaryAppTheme(this));
            tabMyService.setTabTextColors(ColorStateList.valueOf(AppUtils.getPrimaryAppTheme(this)));
        }

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        ServiceActiveInActiveFragment activeFragment = new ServiceActiveInActiveFragment(this, "1");
        adapter.addFragment(activeFragment, AppUtils.cleanLangStr(this,"Active",
                R.string.txt_active_services));

        ServiceActiveInActiveFragment inActiveFragment = new ServiceActiveInActiveFragment(this, "2");
        adapter.addFragment(inActiveFragment, AppUtils.cleanLangStr(this, "In Active",
                R.string.txt_inactive_services));

        viewpagerMyService.setAdapter(adapter);
        viewpagerMyService.setOffscreenPageLimit(2);
        viewpagerMyService.disableScroll(true);

        //Tab
        tabMyService.setupWithViewPager(viewpagerMyService);
        tabMyService.setOnTabSelectedListener(this);

        viewpagerMyService.setOnPageChangeListener(new CustomViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 2) {
                    viewpagerMyService.disableScroll(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}


    /*public void showUserLoginDialog() {
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dialog_change_service_statustype, null);
        alertDialogBuilder.setView(view);
        alertDialogBuilder.setCancelable(true);
        TextView tvStatusType = view.findViewById(R.id.tv_statustype);
        tvStatusType.setBackgroundTintList(ColorStateList.valueOf(AppUtils.getPrimaryAppTheme(this)));

        tvStatusAll = view.findViewById(R.id.tv_status_all);
        tvStatusInProgress = view.findViewById(R.id.tv_status_inprogress);
        tvStatusCompleted = view.findViewById(R.id.tv_status_completed);

        try {
            tvStatusType.setText(AppUtils.cleanLangStr(this,
                    homeStringsList.getLblFilterStatusType().getName(), R.string.txt_change_status_type));
            tvStatusAll.setText(AppUtils.cleanLangStr(this,
                    homeStringsList.getLblFilterAll().getName(), R.string.txt_all));
            tvStatusInProgress.setText(AppUtils.cleanLangStr(this,
                    homeStringsList.getLblFilterActive().getName(), R.string.txt_active));
            tvStatusCompleted.setText(AppUtils.cleanLangStr(this,
                    homeStringsList.getLblFilterInactive().getName(), R.string.txt_inactive));
        } catch (Exception e) {
            e.printStackTrace();
        }

        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.60);

        final AlertDialog dialog = alertDialogBuilder.create();
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //style id
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.show();
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        dialog.getWindow().setLayout(width, LinearLayout.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        tvStatusAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "0";
                getMyServicesList(type);
                dialog.dismiss();
            }
        });
        tvStatusInProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "1";
                getMyServicesList(type);
                dialog.dismiss();
            }
        });
        tvStatusCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = "2";
                getMyServicesList(type);
                dialog.dismiss();
            }
        });
    }

    @OnClick(R.id.iv_filter)
    public void onViewClicked() {
        showUserLoginDialog();
    }*/
