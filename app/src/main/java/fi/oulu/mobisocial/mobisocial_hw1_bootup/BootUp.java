package fi.oulu.mobisocial.mobisocial_hw1_bootup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.app.Activity;
import android.widget.Switch;

/**
 * Created by opoku on 19-Jan-17.
 */

public class BootUp extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        switch (action) {

            case Intent.ACTION_BOOT_COMPLETED:

                vibrator.vibrate(1000);

             //Could not get the BOOT_COMPLETed broadcast to work on my phone... but I tested with POWER_CONNECTED
            case Intent.ACTION_POWER_CONNECTED:

                int dot = 200;      // Length of a Morse Code "dot" in milliseconds
                int dash = 500;     // Length of a Morse Code "dash" in milliseconds
                int short_gap = 200;    // Length of Gap Between dots/dashes
                int medium_gap = 500;   // Length of Gap Between Letters
                int long_gap = 1000;    // Length of Gap Between Words

                long[] morseCodePartern = {
                        0,  // Start immediately
                        dot, short_gap, dot, short_gap, dot,    // s
                        medium_gap,
                        dash, short_gap, dash, short_gap, dash, // o
                        medium_gap,
                        dot, short_gap, dot, short_gap, dot,    // s
                        long_gap
                };
                for (int i = 0; i < 3; i++) {
                    vibrator.vibrate(morseCodePartern, -1);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }


        }


    }
}
