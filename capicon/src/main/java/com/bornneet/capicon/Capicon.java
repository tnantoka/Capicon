package com.bornneet.capicon;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by tnantoka on 8/11/16.
 */
public class Capicon {
    private Paint paint = new Paint();
    int width;
    int height;

    public Capicon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Bitmap bitmap() {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        canvas.drawColor(Color.BLUE);

        canvas.drawBitmap(bitmap, 0, 0, null);

        return bitmap;
    }
}
