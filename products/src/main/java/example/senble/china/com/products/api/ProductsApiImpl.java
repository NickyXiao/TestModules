package example.senble.china.com.products.api;

import example.senble.china.com.message_foundation.ApiRegister;
import example.senble.china.com.message_foundation.personal_center.IPersonalCenterApi;
import example.senble.china.com.message_foundation.products.IProductsApi;

/**
 * Created by Administrator on 2017/7/17.
 */

public class ProductsApiImpl implements IProductsApi {

    public static void register(){
        ApiRegister.getInstance().registerApi(IProductsApi.class,new ProductsApiImpl());
    }
}
