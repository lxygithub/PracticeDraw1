package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        canvas.drawArc(100f,100f,500f,500f,25f,150f,true,paint);//连接到圆心就是扇形，否则就是弧形

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(500f,100f,1000f,300f,0,150f,true,paint);//连接到圆心就是扇形，否则就是弧形

        canvas.drawArc(500f,300f,1000f,600f,0,150f,false,paint);//连接到圆心就是扇形，否则就是弧形
    }
}
