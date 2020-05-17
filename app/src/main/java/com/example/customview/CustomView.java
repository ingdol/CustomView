package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;

import java.util.jar.Attributes;

public class CustomView extends View {
    //View를 상속받아 CustomView 클래스를 작성한다.
    public CustomView(Context context) { //customView 클래스에서 생성자 context를 정의한다.
        super(context); //context 정보를 상위클래스로 전달한다.
        setBackgroundColor(Color.YELLOW); //배경색을 노랑으로 한다.
    }
    public CustomView(Context context, AttributeSet attrs){ //xml에서 이 뷰를 참조하기 위해 반드시 생성자를 구현해준다.
        super(context); //정보를 상위클래스로 전달한다.
        setBackgroundColor(Color.YELLOW); //배경색을 노랑으로 한다.
    }

    @Override
    protected void onDraw(Canvas canvas){ //캔버스에 그려진다.
        Paint paint = new Paint(); //paint 객체를 생성한다.
        paint.setColor(Color.RED); //paint 색은 빨강으로한다.
        canvas.drawArc(new RectF(10, 10, 600, 600), 45, 320, true, paint);
        // 원호를 그린다.
    }

}
