package com.lumyjuwon.richwysiwygeditor.WysiwygUtils;

import android.app.Activity;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import com.esafirm.imagepicker.features.ImagePicker;

public class ImgPicker {

    private static ImagePicker imagePicker;

    private static ImagePicker getImagePicker(View view) {
        imagePicker = ImagePicker.create((Activity) view.getContext());

        return imagePicker.limit(10) // max images can be selected (99 by default)
                .showCamera(true) // show camera or not (true by default)
                .imageDirectory("Camera")   // captured image directory name ("Camera" folder by default)
                .imageFullDirectory(Environment.getExternalStorageDirectory().getPath()); // can be full path
    }

    public static void start(View view) {
        getImagePicker(view).start(); // start image picker activity with request code
    }

}