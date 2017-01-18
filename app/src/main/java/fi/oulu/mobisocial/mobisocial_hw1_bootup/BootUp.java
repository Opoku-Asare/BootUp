package fi.oulu.mobisocial.mobisocial_hw1_bootup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.app.Activity;

/**
 * Created by opoku on 19-Jan-17.
 */

public class BootUp extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == Intent.ACTION_BOOT_COMPLETED) {
            Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(1000);
        }
    }
}
