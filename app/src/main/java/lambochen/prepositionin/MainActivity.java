package lambochen.prepositionin;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.ViewFlipper;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final int tag_RUN = 1;
    private final int tag_PUT = 2;
    private final int tag_GET = 3;
    private final int tag_TURN = 4;
    private final int tag_GO = 5;
    private final int tag_GIVE = 6;

    private ArrayList<String> txt = new ArrayList<>();
    private String[] words = {"run", "put", "get", "turn", "go", "give"};
    private int[] ids = {R.layout.run, R.layout.put, R.layout.get, R.layout.turn, R.layout.go, R.layout.give};

    private Button run;
    private Button get;
    private Button put;
    private Button turn;
    private Button go;
    private Button give;

    LayoutInflater layoutInflater;
    private GridView mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //layoutInflater = LayoutInflater.from(this);
        //mainLayout = (GridView) findViewById(R.id.MainGrid);
        /*
        TableRow line1 = (TableRow) findViewById(R.id.line1);
        TableRow line2 = (TableRow) findViewById(R.id.line2);
        TableRow line3 = (TableRow) findViewById(R.id.line3);*/
        /*View viewRun = layoutInflater.inflate(R.layout.run, null);
        View viewPut = layoutInflater.inflate(R.layout.put, null);
        View viewGet = layoutInflater.inflate(R.layout.get, null);
        View viewGo = layoutInflater.inflate(R.layout.go, null);
        View viewGive = layoutInflater.inflate(R.layout.give, null);
        View viewTurn = layoutInflater.inflate(R.layout.turn, null);

        ArrayList<HashMap<String, Object>> items = new ArrayList<>();
        for(String word : words){
            HashMap<String, Object> map = new HashMap<>();
            map.put("Word",word);
            items.add(map);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, items, R.layout.gridview, new String[]{"Word"}, new int[]{R.layout.get});
        mainLayout.setAdapter(simpleAdapter);*/

        run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
        put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
        get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
        go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
        turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
        give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
       /* setContentView(R.layout.test);
        GridView MainGrid = (GridView) findViewById(R.id.MainGridView);
        GridView little_grid = (GridView) findViewById(R.id.little_grid);


        ArrayList<HashMap<String, Object>> items = new ArrayList<HashMap<String, Object>>();
        ArrayList<HashMap<String, Object>> anotherItems = new ArrayList<HashMap<String, Object>>();
        for (int i=0;i<10;i++){
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("Word", "Word"+String.valueOf(i));
            items.add(map);
        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(this, items, R.layout.little_grid, new String[]{"Word"}, new int[]{R.id.Button});
        MainGrid.setAdapter(simpleAdapter);*/



        //simpleAdapter.notifyDataSetChanged();

    }



    public void setButtonLitsener(int src){


        switch (src%10){
            default :
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_RUN:
                Button runOut = (Button) findViewById(R.id.run_out);runOut.setTag(11);runOut.setOnClickListener(this);
                Button runInto = (Button) findViewById(R.id.run_into);runInto.setTag(11);runInto.setOnClickListener(this);
                Button runDown = (Button) findViewById(R.id.run_down);runDown.setTag(11);runDown.setOnClickListener(this);
                Button runOver = (Button) findViewById(R.id.run_over);runOver.setTag(11);runOver.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_PUT:
                Button put_forward = (Button) findViewById(R.id.put_forward);put_forward.setTag(12);put_forward.setOnClickListener(this);
                Button put_off = (Button) findViewById(R.id.put_off);put_off.setTag(12);put_off.setOnClickListener(this);
                Button put_up_with = (Button) findViewById(R.id.put_up_with);put_up_with.setTag(12);put_up_with.setOnClickListener(this);
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_GET:
                Button get_along = (Button) findViewById(R.id.get_along);get_along.setTag(13);get_along.setOnClickListener(this);
                Button get_ahead = (Button) findViewById(R.id.get_ahead);get_ahead.setTag(13);get_ahead.setOnClickListener(this);
                Button get_in = (Button) findViewById(R.id.get_in);get_in.setTag(13);get_in.setOnClickListener(this);
                Button get_off = (Button) findViewById(R.id.get_off);get_off.setTag(13);get_off.setOnClickListener(this);
                Button get_on = (Button) findViewById(R.id.get_on);get_on.setTag(13);get_on.setOnClickListener(this);
                Button get_over = (Button) findViewById(R.id.get_over);get_over.setTag(13);get_over.setOnClickListener(this);
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_TURN:
                Button turn_against = (Button) findViewById(R.id.turn_against);turn_against.setTag(14);turn_against.setOnClickListener(this);
                Button turn_into = (Button) findViewById(R.id.turn_into);turn_into.setTag(14);turn_into.setOnClickListener(this);
                Button turn_out = (Button) findViewById(R.id.turn_out);turn_out.setTag(14);turn_out.setOnClickListener(this);
                Button turn_over = (Button) findViewById(R.id.turn_over);turn_over.setTag(14);turn_over.setOnClickListener(this);
                Button turn_to = (Button) findViewById(R.id.turn_to);turn_to.setTag(14);turn_to.setOnClickListener(this);
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_GO:
                Button go_after = (Button) findViewById(R.id.go_after);go_after.setTag(15);go_after.setOnClickListener(this);
                Button go_ahead = (Button) findViewById(R.id.go_ahead);go_ahead.setTag(15);go_ahead.setOnClickListener(this);
                Button go_back_on = (Button) findViewById(R.id.go_back_on);go_back_on.setTag(15);go_back_on.setOnClickListener(this);
                Button go_between = (Button) findViewById(R.id.go_between);go_between.setTag(15);go_between.setOnClickListener(this);
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                give = (Button) findViewById(R.id.give);give.setTag(tag_GIVE);give.setOnClickListener(this);
                break;
            case tag_GIVE:
                Button give_off = (Button) findViewById(R.id.give_off);give_off.setTag(16);give_off.setOnClickListener(this);
                Button give_away = (Button) findViewById(R.id.give_away);give_away.setTag(16);give_away.setOnClickListener(this);
                Button give_in = (Button) findViewById(R.id.give_in);give_in.setTag(16);give_in.setOnClickListener(this);
                Button give_out = (Button) findViewById(R.id.give_out);give_out.setTag(16);give_out.setOnClickListener(this);
                Button give_rise = (Button) findViewById(R.id.give_rise);give_rise.setTag(16);give_rise.setOnClickListener(this);
                Button give_up = (Button) findViewById(R.id.give_up);give_up.setTag(16);give_up.setOnClickListener(this);
                run = (Button) findViewById(R.id.run);run.setTag(tag_RUN);run.setOnClickListener(this);
                put = (Button) findViewById(R.id.put);put.setTag(tag_PUT);put.setOnClickListener(this);
                get = (Button) findViewById(R.id.get);get.setTag(tag_GET);get.setOnClickListener(this);
                go = (Button) findViewById(R.id.go);go.setTag(tag_GO);go.setOnClickListener(this);
                turn = (Button) findViewById(R.id.turn);turn.setTag(tag_TURN);turn.setOnClickListener(this);
                break;
        }
    }

    public void onClick(View v){
        int tag = (Integer) v.getTag();
        System.out.println("tag in onClick: " + tag);
        switch (tag){
            case tag_RUN :
                actionRun();
                break;
            case tag_PUT :
                actionPUT();
                break;
            case tag_GET :
                actionGET();
                break;
            case tag_TURN :
                actionTURN();
                break;
            case tag_GO :
                actionGO();
                break;
            case tag_GIVE :
                actionGIVE();
                break;
            default:
                Button b = (Button)findViewById(v.getId());
                tag = actionTxt(b);
                break;
        }
        //this.setButtonLitsener(tag);

        this.setButtonLitsener(tag);
    }

    public void actionRun(){
        /*View view1 = layoutInflater.inflate(R.layout.activity1, null);
        mainLayout.removeAllViews();
        mainLayout.addView(view1);*/
        setContentView(R.layout.activity1);
    }

    public void actionPUT(){
        /*View view2 = layoutInflater.inflate(R.layout.activity2, null);
        mainLayout.removeAllViews();
        mainLayout.addView(view2);*/
        setContentView(R.layout.activity2);
    }

    public void actionGET(){
        /*View view3 = layoutInflater.inflate(R.layout.activity3, null);
        mainLayout.addView(view3);
        mainLayout.removeViewAt(0);*/
        setContentView(R.layout.activity3);
    }

    public void actionTURN(){
        /*View view4 = layoutInflater.inflate(R.layout.activity4, null);
        mainLayout.addView(view4);
        mainLayout.removeViewAt(0);*/
        setContentView(R.layout.activity4);
    }

    public void actionGO(){
        /*View view5 = layoutInflater.inflate(R.layout.activity5, null);
        mainLayout.addView(view5);
        mainLayout.removeViewAt(0);*/
        setContentView(R.layout.activity5);
    }

    public void actionGIVE(){
        /*View view6 = layoutInflater.inflate(R.layout.activity6, null);
        mainLayout.addView(view6);
        mainLayout.removeViewAt(0);*/
        setContentView(R.layout.activity6);
    }

    public ArrayList<String> readTxtFileIntoStringArrList(int word, String msg)
    {
        ArrayList<String> list = new ArrayList<>();
        String preposition = msg.toLowerCase().split(" ")[1];
        try
        {
            InputStreamReader inputReader = new InputStreamReader(getResources().openRawResource(word), "ISO-8859-1");
            BufferedReader bufReader = new BufferedReader(inputReader);
            String line="";
            while((line = bufReader.readLine()) != null){
                String[] sentences = line.split(";");
                if((sentences[0].toLowerCase()).equals(preposition)){
                    list.add(msg);
                    list.add(sentences[1]);
                    list.add(sentences[2]);
                    list.add(sentences[3]);
                }
                //list.add(line);
            }
            inputReader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        this.txt = list;
        System.out.println(txt);
        return list;
    }

    public int actionTxt(Button button){
        int tag = 0;
        ArrayList<String> messages = new ArrayList<>();
        String buttonTxt = (String)button.getText();
        if(buttonTxt.contains("Run")){
            tag = 11;
            messages = readTxtFileIntoStringArrList(R.raw.run,buttonTxt);
        }else if(buttonTxt.contains("Put")){
            tag = 12;
            messages = readTxtFileIntoStringArrList(R.raw.put,buttonTxt);
        }else if(buttonTxt.contains("Get")){
            tag = 13;
            messages = readTxtFileIntoStringArrList(R.raw.get,buttonTxt);
        }else if(buttonTxt.contains("Turn")){
            tag = 14;
            messages = readTxtFileIntoStringArrList(R.raw.turn,buttonTxt);
        }else if(buttonTxt.contains("Go")){
            tag = 15;
            messages = readTxtFileIntoStringArrList(R.raw.go,buttonTxt);
        }else if(buttonTxt.contains("Give")){
            tag = 16;
            messages = readTxtFileIntoStringArrList(R.raw.give,buttonTxt);
        }else {
            tag = -1;
            System.out.println("error");
        }
       // Intent intent=new Intent(MainActivity.this,DialogActivity.class);
        //startActivity(intent);
        //overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        new DialogActivity(this, messages);
        System.out.println("Button clicked : "+buttonTxt);

        return tag;
    }
}
