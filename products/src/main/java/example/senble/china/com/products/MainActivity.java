package example.senble.china.com.products;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import example.senble.china.com.message_foundation.ApiRegister;
import example.senble.china.com.message_foundation.personal_center.IPersonalCenterApi;

/**
 * Created by Administrator on 2017/7/14.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = ApiRegister.getInstance().getRegisterInterface(IPersonalCenterApi.class).getUserName();
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
