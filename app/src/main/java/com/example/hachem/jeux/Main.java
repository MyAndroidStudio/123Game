package com.example.hachem.jeux;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main extends Activity {
    public float x1,x2,y1,y2;
    public int h=50;
    public TextView t1;
    public TextView t2;
    public TextView t3;
    public TextView t4;
    public TextView t5;
    public TextView t6;
    public TextView t7;
    public TextView t8;
    public TextView t9;
    public TextView pas;
    public Button start;
    public int v =9;
    public RelativeLayout e;
    public String type="Start";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7);
        t8=(TextView)findViewById(R.id.t8);
        t9=(TextView)findViewById(R.id.t9);
        pas=(TextView)findViewById(R.id.pas);
        e=(RelativeLayout) findViewById(R.id.main);
        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(type.equals("Start"))
                {
                    aleatoire();
                    start.setText("Restart");
                    type="Restart";
                    pas.setText("0");
                }
                else
                {
                    ranger();
                    start.setText("Start");
                    type="Start";
                    pas.setText("0");
                }

            }
        });

        e.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View vr, MotionEvent touchevent) {

                switch (touchevent.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        x1 = touchevent.getX();
                        y1 = touchevent.getY();
                        break;

                    case MotionEvent.ACTION_UP: {
                        x2 = touchevent.getX();
                        y2 = touchevent.getY();

                        if (x1 < x2 && Math.abs(y1 - y2) < h)
                        {
                            coleurOrange();
                            toright();
                            coleurBlanc(v);


                        } else if (x1 > x2 && Math.abs(y1 - y2) < h)
                        {
                            coleurOrange();
                            toleft();
                            coleurBlanc(v);

                        } else if (y1 < y2 && Math.abs(x1 - x2) < h)
                        {
                            coleurOrange();
                            toDown();
                            coleurBlanc(v);

                        } else if (y1 > y2 && Math.abs(x1 - x2) < h)
                        {
                            coleurOrange();
                            toUp();
                            coleurBlanc(v);

                        }
                        break;
                    }
                }
                return true;

            }
        });



    }

    public void toUp()
    {

          switch(v)
          {
              case 1:t1.setText(t4.getText());t4.setText("");v=4;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
              case 2:t2.setText(t5.getText());t5.setText("");v=5;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
              case 3:t3.setText(t6.getText());t6.setText("");v=6;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
              case 4:t4.setText(t7.getText());t7.setText("");v=7;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
              case 5:t5.setText(t8.getText());t8.setText("");v=8;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
              case 6:t6.setText(t9.getText());t9.setText("");v=9;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
          }


    }

    public void toDown()
    {
        switch(v)
        {
            case 7:t7.setText(t4.getText());t4.setText("");v=4;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 8:t8.setText(t5.getText());t5.setText("");v=5;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 9:t9.setText(t6.getText());t6.setText("");v=6;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 4:t4.setText(t1.getText());t1.setText("");v=1;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 5:t5.setText(t2.getText());t2.setText("");v=2;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 6:t6.setText(t3.getText());t3.setText("");v=3;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
        }
    }

    public void toleft()
    {
        switch(v)
        {
            case 1:t1.setText(t2.getText());t2.setText("");v=2;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 4:t4.setText(t5.getText());t5.setText("");v=5;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 7:t7.setText(t8.getText());t8.setText("");v=8;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 2:t2.setText(t3.getText());t3.setText("");v=3;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 5:t5.setText(t6.getText());t6.setText("");v=6;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 8:t8.setText(t9.getText());t9.setText("");v=9;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
        }
    }

    public void toright()
    {
        switch(v)
        {
            case 9:t9.setText(t8.getText());t8.setText("");v=8;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 6:t6.setText(t5.getText());t5.setText("");v=5;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 3:t3.setText(t2.getText());t2.setText("");v=2;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 2:t2.setText(t1.getText());t1.setText("");v=1;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 5:t5.setText(t4.getText());t4.setText("");v=4;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
            case 8:t8.setText(t7.getText());t7.setText("");v=7;pas.setText((Integer.parseInt(pas.getText().toString())+1) + "");break;
        }
    }

    public void aleatoire()
    {
        t1.setText("4");
        t2.setText("7");
        t3.setText("5");
        t4.setText("2");
        t5.setText("");
        t6.setText("1");
        t7.setText("3");
        t8.setText("6");
        t9.setText("8");
        v=5;
        coleurOrange();
        coleurBlanc(v);
    }
    public void ranger()
    {
        t1.setText("1");
        t2.setText("2");
        t3.setText("3");
        t4.setText("4");
        t5.setText("5");
        t6.setText("6");
        t7.setText("7");
        t8.setText("8");
        t9.setText("");
        v=9;
        coleurOrange();
        coleurBlanc(9);
    }
    public void coleurBlanc(int x)
    {
        switch(x)
        {
            case 1:t1.setBackgroundColor(Color.WHITE);break;
            case 2:t2.setBackgroundColor(Color.WHITE);break;
            case 3:t3.setBackgroundColor(Color.WHITE);break;
            case 4:t4.setBackgroundColor(Color.WHITE);break;
            case 5:t5.setBackgroundColor(Color.WHITE);break;
            case 6:t6.setBackgroundColor(Color.WHITE);break;
            case 7:t7.setBackgroundColor(Color.WHITE);break;
            case 8:t8.setBackgroundColor(Color.WHITE);break;
            case 9:t9.setBackgroundColor(Color.WHITE);break;
        }
    }

    public void coleurOrange()
    {
        t1.setBackgroundColor(Color.rgb(255, 167, 5));
        t2.setBackgroundColor(Color.rgb(255, 167, 5));
        t3.setBackgroundColor(Color.rgb(255, 167, 5));
        t4.setBackgroundColor(Color.rgb(255, 167, 5));
        t5.setBackgroundColor(Color.rgb(255, 167, 5));
        t6.setBackgroundColor(Color.rgb(255, 167, 5));
        t7.setBackgroundColor(Color.rgb(255, 167, 5));
        t8.setBackgroundColor(Color.rgb(255, 167, 5));
        t9.setBackgroundColor(Color.rgb(255, 167, 5));

    }
}
