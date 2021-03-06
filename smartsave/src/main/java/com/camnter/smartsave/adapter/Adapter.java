package com.camnter.smartsave.adapter;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * @author CaMnter
 */

public interface Adapter<T> {

    View findViewById(T target, int resId);

    String getString(T target, int resId);

    Drawable getDrawable(T target, int resId);

    int getColor(T target, int resId);

    float getDimension(T target, int resId);

    int getDimensionPixelSize(T target, int resId);

}
