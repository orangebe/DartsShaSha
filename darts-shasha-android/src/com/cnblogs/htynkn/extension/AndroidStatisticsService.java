package com.cnblogs.htynkn.extension;

import com.baidu.mobstat.StatService;

import android.content.Context;

public class AndroidStatisticsService implements IStatisticsService {

	Context context;

	public AndroidStatisticsService(Context context) {
		this.context = context;
	}

	@Override
	public void onResume() {
		StatService.onResume(this.context);
	}
	@Override
	public void onPause() {
		StatService.onPause(this.context);
	}
}
