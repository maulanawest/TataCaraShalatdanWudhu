package com.example.tatacarashalatdanwudhu;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

public class MessageAleertDialog {

    public static void alet_message(Context context, String title, String message) {
        //AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

        //setDialogTitile
        alertDialog.setTitle(title);

        //setDialogMessage
        alertDialog.setMessage(message);

        //set Ok Btn
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                
                dialogInterface.dismiss();
            }
        });

        alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });

        AlertDialog alert = alertDialog.create();
        alertDialog.show();
    }
}
