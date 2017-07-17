package example.senble.china.com.testmodules;

import android.app.Application;

import example.senble.china.com.personal_center.api.PersonalCenterApiImpl;
import example.senble.china.com.products.api.ProductsApiImpl;

/**
 * Created by Administrator on 2017/7/17.
 */

public class TestModulesApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initModules();
    }

    private void initModules() {
        PersonalCenterApiImpl.register();
        ProductsApiImpl.register();
    }
}
