package dev.xesam.android.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class CenterDrawableCompound extends CompoundButton {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CenterDrawableCompound(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CenterDrawableCompound(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CenterDrawableCompound(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CenterDrawableCompound(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        CenterDrawableHelper.preDraw(this, canvas);
        super.onDraw(canvas);
    }
}
