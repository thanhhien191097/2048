package linhmil.oop.hcmiu.rescuepets.map;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.GridView;

/**
 * Created by Admin on 12/13/2017.
 */

public class CusGrid extends GridView{

    public CusGrid(Context context) {
        super(context);
    }

    public CusGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CusGrid(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CusGrid(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        return super.onTouchEvent(ev);
    }
}
