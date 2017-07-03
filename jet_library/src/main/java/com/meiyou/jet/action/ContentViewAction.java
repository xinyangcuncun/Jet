package com.meiyou.jet.action;

import android.app.Activity;

import com.meiyou.jet.annotation.ContentView;

/**
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 17/6/30
 */

public class ContentViewAction extends BaseAction {

//    public ContentViewAction(Class<? extends Activity> activityClass) {
//        super(activityClass);
//    }

    @Override
    public void run(Activity activity) throws Exception {
        super.run(activity);
        Class<? extends Activity> clazz = activity.getClass();
        ContentView contentView = clazz.getAnnotation(ContentView.class);
        if (contentView != null) {
            //doSomethind
        }
    }
}
