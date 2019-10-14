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


## Class ather Dialog
### 1. Create Package [dialog]

![Screen Shot 2019-10-14 at 1 39 01 PM](https://user-images.githubusercontent.com/43386555/66733217-0139b480-ee89-11e9-9658-6cf173de8f62.png)

### 2. Create new Class with name DialogRedudant.java

      public class DialogRedudant {

          public static class Builder {
              private String title, message, positiveBtnText, negativeBtnText, pBtnColor, nBtnColor;
              private Activity activity;
              private DialogListener pListener, nListener;
              private boolean cancel;

              //constructor
              public Builder(Activity activity) {
                  this.activity = activity;
              }

              //
              public Builder setTitle(String title) {
                  this.title = title;
                  return this;
              }

              public Builder setMessage(String message) {
                  this.message = message;
                  return this;
              }

              //Setter PositiveBtn builder
              public Builder setPositiveBtnText(String positiveBtnText) {
                  this.positiveBtnText = positiveBtnText;
                  return this;
              }

              //background color
              public Builder setPositiveBackground(String pBtnColor) {
                  this.pBtnColor = pBtnColor;
                  return this;
              }

              //Setter NegativeBtn builder
              public Builder setNegativeBtnTex(String negativeBtnText) {
                  this.negativeBtnText = negativeBtnText;
                  return this;
              }

              //background color
              public Builder setNegativeBackground(String nBtnColor) {
                  this.nBtnColor = nBtnColor;
                  return this;
              }

              //set Positive OnClickListener from class DialogListener
              public Builder OnPositiveClickListener(DialogListener pListener) {
                  this.pListener = pListener;
                  return this;
              }

              //set Negatice OnClickListener from class DialogListener
              public Builder OnNegativeClickListener(DialogListener nListener) {
                  this.nListener = nListener;
                  return this;
              }

              //bolean cancel
              public Builder isCancellable(boolean cancel) {
                  this.cancel = cancel;
                  return this;
              }

              //get this Class and create variable build
              public DialogRedudant build() {
                  TextView message1, title1;
                  Button pBtn, nBtn;

                  //create class Object
                  final Dialog dialog = new Dialog(activity);
                  dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                  dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                  //get Cancllable and parameter
                  dialog.setCancelable(cancel);
                  //get custome layout
                  dialog.setContentView(R.layout.alert_dialog);


                  //inisialisasi ID
                  title1 = dialog.findViewById(R.id.title);
                  message1 = dialog.findViewById(R.id.message);
                  pBtn = dialog.findViewById(R.id.positiveBtn);
                  nBtn = dialog.findViewById(R.id.negativeBtn);

                  //proocessing OnClickListener
                  title1.setText(title);
                  message1.setText(message);

                  //positive
                  //setTex btn name
                  if (positiveBtnText != null) {
                      pBtn.setText(positiveBtnText);

                      if (pBtnColor != null) {
                          GradientDrawable bgShape = (GradientDrawable) pBtn.getBackground();
                          bgShape.setColor(Color.parseColor(pBtnColor));
                      }

                      pBtn.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              if (pListener != null) pListener.onClick();
                              dialog.dismiss();
                          }
                      });
                  } else {
                      pBtn.setVisibility(View.GONE);
                  }

                  //Negative
                  if (negativeBtnText != null) {
                      nBtn.setText(negativeBtnText);

                      //color btn
                      if (nBtnColor != null) {
                          GradientDrawable bgShape = (GradientDrawable) nBtn.getBackground();
                          bgShape.setColor(Color.parseColor(nBtnColor));
                      }

                      nBtn.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {
                              if (nListener != null) nListener.onClick();
                              dialog.dismiss();
                          }
                      });
                  } else {
                      nBtn.setVisibility(View.GONE);
                  }

                  dialog.show();

                  return new DialogRedudant();
              }
          }
      }
      
### 3. Create class interface to onClick
      public interface DialogListener {

          void onClick();
      }
      
### 4. implementation

      new DialogRedudant.Builder(this)
                .setTitle("Hai.")
                .setMessage("Apakah kamu yakin ingin keluar dari aplikasi ini?")
                .setNegativeBtnTex("Cancel")
                .setNegativeBackground("#e3e3e3")
                .setPositiveBtnText("Ok")
                .setPositiveBackground("#ffffff")
                .isCancellable(false)
                .OnNegativeClickListener(new DialogListener() {
                    @Override
                    public void onClick() {

                    }
                })
                .OnPositiveClickListener(new DialogListener() {
                    @Override
                    public void onClick() {
                        MainActivity.this.finish();
                    }
                })
                .build();
