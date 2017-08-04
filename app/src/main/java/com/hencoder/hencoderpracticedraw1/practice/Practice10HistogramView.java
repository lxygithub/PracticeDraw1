package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View
{

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Random random = new Random();
    private String[] languages = {"java","C","C++","C#","Python","PHP","R"};

    public Practice10HistogramView(Context context)
    {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setColor(Color.WHITE);
        canvas.drawLine(100f, 100f, 100f, 600f, paint);
        canvas.drawLine(100f, 600f, 1000f, 600f, paint);

        canvas.drawLine(100f, 100f, 90f, 130f, paint);
        canvas.drawLine(100f, 100f, 110f, 130f, paint);

        canvas.drawLine(1000f, 600f, 970f, 590f, paint);
        canvas.drawLine(1000f, 600f, 970f, 610f, paint);


        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.GREEN);

        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(Color.WHITE);
        paint2.setTextSize(30f);
        for (int i = 0; i < 7; i++)
        {

            canvas.drawRect(120f*i+120,600f,120f*i+220,(random.nextInt(5)+1)*100f,paint1);
            canvas.drawText(languages[i],120f*i+120,600f+30f,paint2);
        }
    }
}
