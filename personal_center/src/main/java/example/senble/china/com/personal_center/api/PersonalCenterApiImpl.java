package example.senble.china.com.personal_center.api;

import example.senble.china.com.message_foundation.ApiRegister;
import example.senble.china.com.message_foundation.personal_center.IPersonalCenterApi;
import example.senble.china.com.personal_center.MainActivity;

/**
 * Created by Administrator on 2017/7/17.
 */

public class PersonalCenterApiImpl implements IPersonalCenterApi {

    public static void register(){
        ApiRegister.getInstance().registerApi(IPersonalCenterApi.class,new PersonalCenterApiImpl());
    }

    //本地暴露给外部的接口实现类
    @Override
    public String getUserName() {
        return "这是用户中心返回的用户名";
    }
}
