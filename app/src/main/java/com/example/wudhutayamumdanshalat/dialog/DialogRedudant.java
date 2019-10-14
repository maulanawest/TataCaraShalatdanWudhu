package com.example.wudhutayamumdanshalat.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.wudhutayamumdanshalat.R;

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
