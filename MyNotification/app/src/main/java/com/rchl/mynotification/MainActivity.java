package com.rchl.mynotification;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final String channel_id = "Personal Notifications";
    private final int notification_id = 01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickforNotification(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,channel_id);
        builder.setSmallIcon(R.drawable.ic_notifications_white_24dp);
        builder.setContentTitle("New Notification");
        builder.setContentText("This is for notification text");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(notification_id,builder.build());
    }
}
