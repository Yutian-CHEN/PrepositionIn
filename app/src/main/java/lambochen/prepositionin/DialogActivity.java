package lambochen.prepositionin;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

/**
 * Created by YUTIAN on 01/05/2017.
 */

public class DialogActivity extends Activity {

    private LayoutInflater layoutInflater;
    private ViewFlipper viewFilpper;
    private TextView txt;

    public DialogActivity(Context context, ArrayList<String> messages){

        layoutInflater = LayoutInflater.from(context);
        Dialog dialog = new Dialog(context);
        View popView = layoutInflater.inflate(R.layout.popupwindow, null);
        dialog.setContentView(popView);
        dialog.setCancelable(true);
        viewFilpper = (ViewFlipper) popView.findViewById(R.id.viewFlipper);
        txt = (TextView) popView.findViewById(R.id.dialogtxt);
        //viewFilpper.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.menu_in));
        //viewFilpper.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.menu_out));
        viewFilpper.setFlipInterval(60000);
        dialog.setTitle(messages.get(0));
        txt.setText(messages.get(1)+"\r\n\r\n"+messages.get(2)+"\r\n\r\n"+messages.get(3));

        dialog.show();
        viewFilpper.startFlipping();
    }

    public boolean onTouchEvent (MotionEvent event) {
        this.finish();
        return super.onTouchEvent(event);
 }
}
