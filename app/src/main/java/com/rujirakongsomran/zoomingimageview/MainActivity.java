package com.rujirakongsomran.zoomingimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {
    ImageView ibPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();
    }

    private void initInstances() {
        ibPicture = (ImageView) findViewById(R.id.ibPicture);
        PhotoViewAttacher photoViewAttacher = new PhotoViewAttacher(ibPicture);
        photoViewAttacher.update();
    }
}
