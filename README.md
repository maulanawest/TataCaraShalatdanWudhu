# WUDHU TAYAMUM DAN SHALAT
Project Program Skripsi Univ. Pamulang

## Priview
![untitled](https://user-images.githubusercontent.com/43386555/66543459-a1c56700-eb5f-11e9-860d-a43811ab5020.gif)

## USECASE
![Picture1](https://user-images.githubusercontent.com/43386555/66482230-b73d8100-eacc-11e9-98b4-7fa9cd933335.png)


## no priview background white in splashscreen

1. res/value.style.xml

   a. Addition code in theme
   
        <item name="android:windowDisablePreview">true</item>
        <item name="android:windowContentOverlay">@null</item>
        
   b. Example this theme
   
        <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
            <!-- Customize your theme here. -->
            <item name="colorPrimary">@color/colorPrimary</item>
            <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
            <item name="colorAccent">@color/colorAccent</item>
            
            //add not priview white screen before SplashscreenActivity
            <item name="android:windowDisablePreview">true</item>
            <item name="android:windowContentOverlay">@null</item>
        </style>
       
## Priview
![untitled2](https://user-images.githubusercontent.com/43386555/66545406-cec84880-eb64-11e9-9318-b97892a7d5f4.gif)   
        
2. PopUp Dialog

   a. Create file new XML with name alert_dialog.xml
      1. Example XML Code
      
        <?xml version="1.0" encoding="utf-8"?>
          <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:background="@drawable/bg_alertdialog"
              android:gravity="center"
              android:orientation="vertical">

              <RelativeLayout
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:padding="24dp">

                  <TextView
                      android:id="@+id/title"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:gravity="center"
                      android:text="@string/title_confirmdialog"
                      android:textSize="18sp"
                      android:textStyle="bold" />

                  <TextView
                      android:id="@+id/message"
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_below="@id/title"
                      android:layout_marginLeft="16dp"
                      android:layout_marginTop="16dp"
                      android:layout_marginRight="16dp"
                      android:gravity="center"
                      android:text="@string/message_dialog"
                      android:textAlignment="center"
                      android:textSize="18sp" />

                  <LinearLayout
                      android:layout_width="match_parent"
                      android:layout_height="wrap_content"
                      android:layout_below="@+id/message"
                      android:layout_marginTop="32dp"
                      android:orientation="horizontal">

                      <Button
                          android:id="@+id/dialogButtonYES_ID"
                          android:layout_width="wrap_content"
                          android:layout_height="wrap_content"
                          android:layout_margin="10dp"
                          android:layout_weight="1"
                          android:background="@drawable/bg_alertdialog"
                          android:text="Yes" />

                      <Button
                          android:id="@+id/dialogButtonCANCLE_ID"
                          android:layout_width="wrap_content"
                          android:layout_height="wrap_content"
                          android:layout_margin="10dp"
                          android:layout_weight="1"
                          android:background="@drawable/bg_alertdialog"
                          android:text="Cancle" />

                  </LinearLayout>

              </RelativeLayout>

          </RelativeLayout>
      
   b. create varible global
   
          public class MainActivity extends AppCompatActivity {
          
          //variable global
          Dialog dialog;
          
   c. initialize Dialog class
   
          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);
              
              //initialize Button
              dialogButtonYES_ID = (Button) findViewById(R.id.dialogButtonYES_ID);
              dialogButtonCANCLE_ID = (Button) findViewById(R.id.dialogButtonCANCLE_ID);

          }
          
    d. Create Class Dialog          
        
        //dialog
        public void openDialog() {

            dialog = new Dialog(MainActivity.this);
            
            //no title window
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            
            //ttanparent backgroud
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(false);

            //get Layout Custom Dialog
            dialog.setContentView(R.layout.alert_dialog);
            
            dialogButtonYES_ID = (Button) dialog.findViewById(R.id.dialogButtonYES_ID);
            dialogButtonYES_ID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    MainActivity.this.finish();
                }
            });

            dialogButtonCANCLE_ID = (Button) dialog.findViewById(R.id.dialogButtonCANCLE_ID);
            dialogButtonCANCLE_ID.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    dialog.dismiss();
                }
            });
            dialog.show();
        }
        
    e. Put Class dialog in button tutup_id
    
          private View.OnClickListener onClickListener = new View.OnClickListener() {
          
          @Override
          public void onClick(View v) {

              int id = v.getId();

              Intent goToActivity;

              switch (id) {
                  case R.id.tataCara_id:
                      //untuk ke activity berikutnya
                      goToActivity = new Intent(getApplicationContext(), TataCaraActivity.class);
                      startActivity(goToActivity);
                      break;
                  case R.id.video_id:
                      //DO something
                      goToActivity = new Intent(getApplicationContext(), VideoActivity.class);
                      startActivity(goToActivity);
                      break;
                  case R.id.tentang_id:
                      //DO something
                      goToActivity = new Intent(getApplicationContext(), TentangActivity.class);
                      startActivity(goToActivity);
                      break;

                  case R.id.tutup_id:
                      
                      //class dialog
                      openDialog();
                      //end class dialog
                      break;

              }
          }
        };
