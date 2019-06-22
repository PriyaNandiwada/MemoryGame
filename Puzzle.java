package com.example.priya.puzzle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Priya on 10/19/2017.
 */

public class Puzzle extends Activity {
    ImageView u1;
    FrameLayout layout;
    ImageView img;
    ImageView u2;
    ImageView u3;
    ImageView u4;
    ImageView u5;
    ImageView u6;
    ImageView u7;
    ImageView u8;
    ImageView u9;
    ImageView u10;
    ImageView u11;
    ImageView u12;
    ImageView u13;
    ImageView u14;
    ImageView u15;
    ImageView u16;
    ImageView u17;
    ImageView u18;
    ImageView u19;
    ImageView u20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzle);
        layout = (FrameLayout) findViewById(R.id.frame);
        u1 = (ImageView) findViewById(R.id.imageView2);
        u2 = (ImageView) findViewById(R.id.imageView3);
        u3 = (ImageView) findViewById(R.id.imageView4);
        u4 = (ImageView) findViewById(R.id.imageView5);
        u5 = (ImageView) findViewById(R.id.imageView6);
        u6 = (ImageView) findViewById(R.id.imageView7);
        u7 = (ImageView) findViewById(R.id.imageView8);
        u8 = (ImageView) findViewById(R.id.imageView9);
        u9 = (ImageView) findViewById(R.id.imageView10);
        u10 = (ImageView) findViewById(R.id.imageView11);
        u11 = (ImageView) findViewById(R.id.imageView12);
        u12 = (ImageView) findViewById(R.id.imageView13);
        u13 = (ImageView) findViewById(R.id.imageView14);
        u14 = (ImageView) findViewById(R.id.imageView15);
        u15 = (ImageView) findViewById(R.id.imageView16);
        u16 = (ImageView) findViewById(R.id.imageView17);
        u17 = (ImageView) findViewById(R.id.imageView18);
        u18 = (ImageView) findViewById(R.id.imageView19);
        u19 = (ImageView) findViewById(R.id.imageView20);
        u20 = (ImageView) findViewById(R.id.imageView21);



        img = (ImageView) findViewById(R.id.imageView);
        int[] res = {R.drawable.u1,R.drawable.u2,R.drawable.u3,R.drawable.u4,R.drawable.u5,R.drawable.u6,R.drawable.u7,R.drawable.u8,R.drawable.u9,R.drawable.u10,R.drawable.u11,R.drawable.u12,R.drawable.u13,R.drawable.u14,R.drawable.u15,R.drawable.u16,R.drawable.u17,R.drawable.u18,R.drawable.u19,R.drawable.u20};
        Random rand = new Random();
        int rndInt = rand.nextInt(res.length);
        Collections.shuffle(Arrays.asList(res));
        /*u1.setImageDrawable(getResources().getDrawable(res[rndInt]));
        u2.setImageDrawable(getResources().getDrawable(res[rndInt+1]));
        u3.setImageDrawable(getResources().getDrawable(res[rndInt+2]));
        u4.setImageDrawable(getResources().getDrawable(res[rndInt+3]));
        u5.setImageDrawable(getResources().getDrawable(res[rndInt+4]));
        u6.setImageDrawable(getResources().getDrawable(res[rndInt+1]));
        u7.setImageDrawable(getResources().getDrawable(res[rndInt+2]));
        u8.setImageDrawable(getResources().getDrawable(res[rndInt+3]));
        u9.setImageDrawable(getResources().getDrawable(res[rndInt+4]));
        u10.setImageDrawable(getResources().getDrawable(res[rndInt+4]));
        u11.setImageDrawable(getResources().getDrawable(res[rndInt+1]));
        u12.setImageDrawable(getResources().getDrawable(res[rndInt+1]));
        u13.setImageDrawable(getResources().getDrawable(res[rndInt+2]));
        u14.setImageDrawable(getResources().getDrawable(res[rndInt+3]));
        u15.setImageDrawable(getResources().getDrawable(res[rndInt+4]));
        u16.setImageDrawable(getResources().getDrawable(res[rndInt+5]));
        u17.setImageDrawable(getResources().getDrawable(res[rndInt+6]));
        u18.setImageDrawable(getResources().getDrawable(res[rndInt+1]));
        u19.setImageDrawable(getResources().getDrawable(res[rndInt+2]));*/

        u1.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u1.setX((int)(StartPT.x+mv.x));
                        u1.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u1.getX(),u1.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u1.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u1.getX(),u1.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u2.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u2.setX((int)(StartPT.x+mv.x));
                        u2.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u2.getX(),u2.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u2.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u2.getX(),u2.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u3.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u3.setX((int)(StartPT.x+mv.x));
                        u3.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u3.getX(),u3.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u3.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u3.getX(),u3.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u4.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u4.setX((int)(StartPT.x+mv.x));
                        u4.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u4.getX(),u4.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u4.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u4.getX(),u4.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u5.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u5.setX((int)(StartPT.x+mv.x));
                        u5.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u5.getX(),u5.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u5.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u5.getX(),u5.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u6.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u6.setX((int)(StartPT.x+mv.x));
                        u6.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u6.getX(),u6.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u6.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u6.getX(),u6.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u7.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u7.setX((int)(StartPT.x+mv.x));
                        u7.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u7.getX(),u7.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u7.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u7.getX(),u7.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u8.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u8.setX((int)(StartPT.x+mv.x));
                        u8.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u8.getX(),u8.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u8.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u8.getX(),u8.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u9.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u9.setX((int)(StartPT.x+mv.x));
                        u9.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u9.getX(),u9.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u9.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u9.getX(),u9.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });
        u10.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u10.setX((int)(StartPT.x+mv.x));
                        u10.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u10.getX(),u10.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u10.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u10.getX(),u10.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u11.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u11.setX((int)(StartPT.x+mv.x));
                        u11.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u11.getX(),u11.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u9.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u11.getX(),u11.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });
        u12.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u12.setX((int)(StartPT.x+mv.x));
                        u12.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u12.getX(),u12.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u12.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u12.getX(),u12.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u13.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u13.setX((int)(StartPT.x+mv.x));
                        u13.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u13.getX(),u13.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u13.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u13.getX(),u13.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u14.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u14.setX((int)(StartPT.x+mv.x));
                        u14.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u14.getX(),u14.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u14.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u14.getX(),u14.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u15.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u15.setX((int)(StartPT.x+mv.x));
                        u15.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u15.getX(),u15.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u15.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u15.getX(),u15.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u16.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u16.setX((int)(StartPT.x+mv.x));
                        u16.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u16.getX(),u16.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u16.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u16.getX(),u16.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u17.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u17.setX((int)(StartPT.x+mv.x));
                        u17.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u17.getX(),u17.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u17.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u17.getX(),u17.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u18.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u18.setX((int)(StartPT.x+mv.x));
                        u18.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u18.getX(),u18.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u18.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u18.getX(),u18.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u19.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u19.setX((int)(StartPT.x+mv.x));
                        u19.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u19.getX(),u19.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u19.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u19.getX(),u19.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        u20.setOnTouchListener(new View.OnTouchListener()
        {

            PointF DownPT = new PointF();
            PointF StartPT = new PointF();
            @Override
            public boolean onTouch(View v,MotionEvent event)
            {
                int eid = event.getAction();
                switch (eid)
                {
                    case MotionEvent.ACTION_MOVE:
                        PointF mv = new PointF(event.getX()-DownPT.x,event.getY()-DownPT.y);
                        u20.setX((int)(StartPT.x+mv.x));
                        u20.setY((int)(StartPT.y+mv.y));
                        StartPT = new PointF(u20.getX(),u20.getY());
                        break;
                    case MotionEvent.ACTION_DOWN:
                        u20.bringToFront();
                        DownPT.x = event.getX();
                        DownPT.y = event.getY();
                        StartPT = new PointF(u20.getX(),u20.getY());
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        break;
                }
                return true;
            }

        });

        DisplayMetrics drm = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            getWindowManager().getDefaultDisplay().getRealMetrics(drm);
        }
        setFrameSize(drm);


    }

    private void setFrameSize(DisplayMetrics drm) {
        int width = drm.widthPixels;
        int height = drm.heightPixels;
        FrameLayout.LayoutParams bkg = new FrameLayout.LayoutParams((int) width, (int) height);
        bkg.setMargins((int) (width * .001), (int) (width * .001), 0, 0);
        img.setLayoutParams(bkg);
        FrameLayout.LayoutParams img1 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img1.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u1.setLayoutParams(img1);

        FrameLayout.LayoutParams img2 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img2.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u2.setLayoutParams(img2);

        FrameLayout.LayoutParams img3 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img3.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u3.setLayoutParams(img3);
        u3.bringToFront();

        FrameLayout.LayoutParams img4 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img4.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u4.setLayoutParams(img4);
        u4.bringToFront();

        FrameLayout.LayoutParams img5 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img5.setMargins((int) (width * .4), (int) (height * .6), 0, 0);
        u5.setLayoutParams(img5);
        u5.bringToFront();

        FrameLayout.LayoutParams img6 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img6.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u6.setLayoutParams(img6);
        u6.bringToFront();

        FrameLayout.LayoutParams img7 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img7.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u7.setLayoutParams(img7);
        u7.bringToFront();

        FrameLayout.LayoutParams img8 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img8.setMargins((int) (width * .4), (int) (height * .6), 0, 0);
        u8.setLayoutParams(img8);
        u8.bringToFront();

        FrameLayout.LayoutParams img9 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img9.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u9.setLayoutParams(img9);
        u9.bringToFront();

        FrameLayout.LayoutParams img10 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img10.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u10.setLayoutParams(img10);
        u10.bringToFront();

        FrameLayout.LayoutParams img11 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img11.setMargins((int) (width * .4), (int) (height * .6), 0, 0);
        u11.setLayoutParams(img11);
        u11.bringToFront();

        FrameLayout.LayoutParams img12 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img12.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u12.setLayoutParams(img12);
        u12.bringToFront();

        FrameLayout.LayoutParams img13 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img13.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u13.setLayoutParams(img13);
        u13.bringToFront();

        FrameLayout.LayoutParams img14 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img14.setMargins((int) (width * .4), (int) (height * .6), 0, 0);
        u14.setLayoutParams(img14);
        u14.bringToFront();

        FrameLayout.LayoutParams img15 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img15.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u15.setLayoutParams(img15);
        u15.bringToFront();

        FrameLayout.LayoutParams img16 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img16.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u16.setLayoutParams(img16);
        u16.bringToFront();

        FrameLayout.LayoutParams img17 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img17.setMargins((int) (width * .4), (int) (height * .6), 0, 0);
        u17.setLayoutParams(img17);
        u17.bringToFront();

        FrameLayout.LayoutParams img18 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img18.setMargins((int) (width * .001), (int) (height * .6), 0, 0);
        u18.setLayoutParams(img18);
        u18.bringToFront();

        FrameLayout.LayoutParams img19 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img19.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u19.setLayoutParams(img19);
        u19.bringToFront();

        FrameLayout.LayoutParams img20 = new FrameLayout.LayoutParams((int) (width * .2), (int) (height * .2));
        img20.setMargins((int) (width * .7), (int) (height * .6), 0, 0);
        u20.setLayoutParams(img20);
        u20.bringToFront();


    }

    private final int restart = Menu.FIRST + 1;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int[] res = {R.drawable.u1,R.drawable.u2,R.drawable.u3,R.drawable.u4,R.drawable.u5,R.drawable.u6,R.drawable.u7,R.drawable.u8,R.drawable.u9,R.drawable.u10,R.drawable.u11,R.drawable.u12,R.drawable.u13,R.drawable.u14,R.drawable.u15,R.drawable.u16,R.drawable.u17,R.drawable.u18,R.drawable.u19,R.drawable.u20};


        int id = item.getItemId();

        if (id == R.id.restart) {
            Toast.makeText(Puzzle.this, "Restart...", Toast.LENGTH_LONG).show();
            Intent game = new Intent(Puzzle.this, Puzzle.class);

            startActivityForResult(game, 0);

        }
        return true;
    }
}





