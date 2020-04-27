/*
BottomNavigationLayout Example
© 2020 Dark Tornado, All rights reserved.
*/

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final BottomNavigationLayout layout = new BottomNavigationLayout(this);

        final LinearLayout left = leftLayout();
        final LinearLayout center = centerLayout();
        final LinearLayout right = rightLayout();

        layout.addView(left);

        layout.addBottomButton("LEFT", android.R.drawable.ic_menu_camera, getRippleDrawable(), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.replace(left);
            }
        });
        layout.addBottomButton("CENTER", android.R.drawable.ic_menu_search, getRippleDrawable(), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.replace(center);
            }
        });
        layout.addBottomButton("RIGHT", android.R.drawable.ic_menu_save, getRippleDrawable(), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.replace(right);
            }
        });
        layout.setBackgroundColor(Color.GRAY);

        setContentView(layout);
    }

    private RippleDrawable getRippleDrawable() {
        return new RippleDrawable(ColorStateList.valueOf(Color.LTGRAY), new ColorDrawable(Color.GRAY), null);
    }

    private LinearLayout leftLayout() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);

        for (int n = 0; n < 15; n++) {
            TextView txt = new TextView(this);
            txt.setText("LEFT");
            txt.setTextSize(23);
            txt.setTextColor(Color.BLACK);
            txt.setGravity(Gravity.CENTER);
            layout.addView(txt);
        }
        return layout;
    }

    private LinearLayout centerLayout() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);

        for (int n = 0; n < 15; n++) {
            TextView txt = new TextView(this);
            txt.setText("CENTER");
            txt.setTextSize(23);
            txt.setTextColor(Color.BLACK);
            txt.setGravity(Gravity.CENTER);
            layout.addView(txt);
        }
        return layout;
    }

    private LinearLayout rightLayout() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);

        for (int n = 0; n < 15; n++) {
            TextView txt = new TextView(this);
            txt.setText("RIGHT");
            txt.setTextSize(23);
            txt.setTextColor(Color.BLACK);
            txt.setGravity(Gravity.CENTER);
            layout.addView(txt);
        }
        return layout;
    }

}

