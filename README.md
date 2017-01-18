#MobiSocial HW1 BootUp

##Overview
This exercise goal is for you to familiarise yourself with Android Studio and do a simple application. This application will make your phone vibrate for 1 second when it boots up.



##Implementation
* Create a new application in Android Studio for phones and tablets, called BootUp, company name mobisocial.oulu.fi, with a minimum SDK of API 14 (Ice Cream Sandwich). Choose a Add no Activity as the template.
* Create a BootUp class that extends a BroadcastReceiver. When this receiver is triggered, use the Vibrator class to make your phone vibrate for 1 second when the phone has just finished booting up (i.e., restarting).
* Modify the manifest to add the existence of this receiver. Use the action BOOT_COMPLETED and the DEFAULT category in the intent-filter of the receiver. Also add the permission to use the vibration and allow receiving the boot completed.
* Create a BootUpUI class that extends Activity. This activity can be without any specific implementation. Add the existence of this activity to the manifest, with an icon to your app on the launcher. Run the application. You should see a white screen. This is OK. We just want Android to know that from now on, this is a valid application and the manifest should be accepted.


