package example.senble.china.com.testmodules;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试修改2
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, example.senble.china.com.products.MainActivity.class));
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("这是一个通知")
                        .setContentText("这是通知内容部分");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(MainActivity.this);
                taskStackBuilder.addParentStack(SecondActivity.class);
                taskStackBuilder.addNextIntent(intent);

                PendingIntent pendingIntent =  taskStackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT,null);
                builder.setContentIntent(pendingIntent);
                NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(MainActivity.this);
                notificationManagerCompat.notify("",1,builder.build());
            }
        });

    }
}
