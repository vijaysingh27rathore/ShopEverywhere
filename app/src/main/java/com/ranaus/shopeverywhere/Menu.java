package com.ranaus.shopeverywhere;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Menu extends AppCompatActivity {

    private BottomNavigationView homeNav;
    private HomeFragment homeFragment;
    private CouponFragment couponFragment;
    private WalletFragment walletFragment;
    private ProfileFragment profileFragment;
    private FrameLayout homeFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        homeNav = (BottomNavigationView) findViewById(R.id.menu_Main);
        homeFrame = (FrameLayout) findViewById(R.id.home_fragment);

        homeFragment = new HomeFragment();
        couponFragment = new CouponFragment();
        walletFragment = new WalletFragment();
        profileFragment = new ProfileFragment();

        setFragment(homeFragment);

        homeNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.home:
                        setFragment(homeFragment);
                        return true;

                    case R.id.coupon:
                        setFragment(couponFragment);
                        return true;

                    case R.id.wallet:
                        setFragment(walletFragment);
                        return true;

                    case R.id.user:
                        setFragment(profileFragment);
                        return true;

                        default:
                            return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.home_fragment,fragment);
        fragmentTransaction.commit();
    }
}
