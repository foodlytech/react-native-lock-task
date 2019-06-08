package com.rnlocktask;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAdmin extends DeviceAdminReceiver{
  @Override
  public void onLockTaskModeExiting(Context context, Intent intent) {
    Intent activityIntent = new Intent(context, MainActivity.class);
    activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(activityIntent);
  }
}
