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

public class Practice11PieChartView extends View {

    private Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint1.setColor(Color.RED);
        canvas.drawArc(120f,120f,520f,520f,0f,120f,true,paint1);
        paint2.setColor(Color.GREEN);
        canvas.drawArc(90f,110f,490f,510f,120f,120f,true,paint2);
        paint3.setColor(Color.BLUE);
        canvas.drawArc(100f,100f,500f,500f,240f,120f,true,paint3);

    }
}
