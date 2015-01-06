package com.example.pwriverlevels;

import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	protected Context mContext;
		
	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		Intent intent = new Intent();
		switch (position) {
		case 0:
	        intent.setData(Uri.parse(mContext.getString(R.string.arizona_web_address)));
			return new WebFragment(intent);
			
		case 1:
	        intent.setData(Uri.parse(mContext.getString(R.string.california_web_address)));
			return new WebFragment(intent);
			
		case 2:
	        intent.setData(Uri.parse(mContext.getString(R.string.colorado_web_address)));
			return new WebFragment(intent);
			
		case 3:
	        intent.setData(Uri.parse(mContext.getString(R.string.idaho_web_address)));
			return new WebFragment(intent);
			
		case 4:
	        intent.setData(Uri.parse(mContext.getString(R.string.kansas_web_address)));
			return new WebFragment(intent);
		case 5:
	        intent.setData(Uri.parse(mContext.getString(R.string.montana_web_address)));
			return new WebFragment(intent);
			
		case 6:
	        intent.setData(Uri.parse(mContext.getString(R.string.nevada_web_address)));
			return new WebFragment(intent);
			
		case 7:
	        intent.setData(Uri.parse(mContext.getString(R.string.oregon_web_address)));
			return new WebFragment(intent);
			
		case 8:
	        intent.setData(Uri.parse(mContext.getString(R.string.utah_web_address)));
			return new WebFragment(intent);
			
		case 9:
	        intent.setData(Uri.parse(mContext.getString(R.string.washington_web_address)));
			return new WebFragment(intent);
			
		case 10:
	        intent.setData(Uri.parse(mContext.getString(R.string.wyoming_web_address)));
			return new WebFragment(intent);
		}
		return null;
	}

	@Override
	public int getCount() {
		return 11;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return mContext.getString(R.string.title_section2).toUpperCase(l);
		case 2:
			return mContext.getString(R.string.title_section3).toUpperCase(l);
		case 3:
			return mContext.getString(R.string.title_section4).toUpperCase(l);
		case 4:
			return mContext.getString(R.string.title_section5).toUpperCase(l);
		case 5:
			return mContext.getString(R.string.title_section6).toUpperCase(l);
		case 6:
			return mContext.getString(R.string.title_section7).toUpperCase(l);
		case 7:
			return mContext.getString(R.string.title_section8).toUpperCase(l);
		case 8:
			return mContext.getString(R.string.title_section9).toUpperCase(l);
		case 9:
			return mContext.getString(R.string.title_section10).toUpperCase(l);
		case 10:
			return mContext.getString(R.string.title_section11).toUpperCase(l);
		}
		return null;
	}
	
}
