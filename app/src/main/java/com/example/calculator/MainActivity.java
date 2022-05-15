package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView tt;
    TextView rt;
    public String count = null,count1=null;
    boolean check=true;
    public Double resul1=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rt=findViewById(R.id.result);
        tt = findViewById(R.id.txt);

    }

    public void zero(View view)
    {
        count = tt.getText().toString();
        count=count+0;
        tt.setText(count);
    }
    public void one(View view)
    {
        count = tt.getText().toString();
        count=count+1;
        tt.setText(count);
    }
    public void two(View view)
    {
        count = tt.getText().toString();
        count=count+2;
        tt.setText(count);
    }
    public void three(View view)
    {
        count = tt.getText().toString();
        count=count+3;
        tt.setText(count);
    }
    public void four(View view)
    {
        count = tt.getText().toString();
        count=count+4;
        tt.setText(count);
    }
    public void five(View view)
    {
        count = tt.getText().toString();
        count=count+5;
        tt.setText(count);
    }
    public void six(View view)
    {
        count = tt.getText().toString();
        count=count+6;
        tt.setText(count);
    }
    public void seven(View view)
    {
        count = tt.getText().toString();
        count=count+7;
        tt.setText(count);
    }
    public void eight(View view)
    {
        count = tt.getText().toString();
        count=count+8;
        tt.setText(count);
    }
    public void nine(View view)
    {
        count = tt.getText().toString();
        count=count+9;
        tt.setText(count);
    }
    public void multiply(View view)
    {
        count = tt.getText().toString();
        if(!count.contains("+")&&!count.contains("-")&&!count.contains("*")&&!count.contains("/"))
        {
            count=count+"*";
            tt.setText(count);
            check=true;
        }

//        count = tt.getText().toString();
//        operation="*";
//        result=Integer.valueOf(rt.getText().toString());
//        if(result==0)
//        {
//            result=1;
//        }
//        result=Integer.valueOf(count)*result;
//        count1=Integer.toString(result);
//        rt.setText(Integer.toString(result));
//        tt.setText("0");
//        count=null;
//        check=1;
    }
    public void divide(View view)
    {
        count = tt.getText().toString();
        if(!count.contains("+")&&!count.contains("-")&&!count.contains("*")&&!count.contains("/"))
        {
            count=count+"/";
            tt.setText(count);
            check=true;
        }

//        count = tt.getText().toString();
//        operation="*";
//        result=Integer.valueOf(rt.getText().toString());
//        if(result==0)
//        {
//            result=1;
//        }
//        result/=Integer.valueOf(count);
//        rt.setText(Integer.toString(result));
//        tt.setText("0");
//        count=null;
//        check=1;
    }
    public void dot(View view)
    {
        count = tt.getText().toString();
        if(!count.contains("+")&&!count.contains("-")&&!count.contains("*")&&!count.contains("/"))
        {
            if(!count.contains("."))
            {
                count = count + ".";
                tt.setText(count);
            }
        }else
        {
            if(count.contains("+"))
            {
                String[]  sep=count.split("\\+");
                if(!sep[1].contains("."))
                {
                    count = count + ".";
                    tt.setText(count);
                }
            }
            else if(count.contains("-"))
            {
                String[]  sep=count.split("\\-");
                if(!sep[1].contains("."))
                {
                    count = count + ".";
                    tt.setText(count);
                }
            }
            else if(count.contains("*"))
            {
                String[]   sep=count.split("\\*");
                if(!sep[1].contains("."))
                {
                    count = count + ".";
                    tt.setText(count);
                }
            }
            else if(count.contains("/"))
            {
                String[]  sep=count.split("\\/");
                if(!sep[1].contains("."))
                {
                    count = count + ".";
                    tt.setText(count);
                }
            }
        }
    }
    public void clear(View view)
    {
//        count=null;
//        operation=null;
//        result=1;
//        check=0;
//        rt.setText("0");
        tt.setText("0");
    }
    public void plus(View view)
    {
        count = tt.getText().toString();
        if(!count.contains("+")&&!count.contains("-")&&!count.contains("*")&&!count.contains("/"))
        {
            count=count+"+";
            tt.setText(count);
            check=true;
        }
//        count = tt.getText().toString();
//        operation="+";
//        if(result==1&&check==0)
//        {
//            result=0;
//            check=1;
//        }
//        result=Integer.valueOf(count)+result;
//        count1=Integer.toString(result);
//        rt.setText(Integer.toString(result));
//        tt.setText("0");
//        count="0";
    }
    public void subtract(View view)
    {
        count = tt.getText().toString();
        if(!count.contains("+")&&!count.contains("-")&&!count.contains("*")&&!count.contains("/"))
        {
            count=count+"-";
            tt.setText(count);
            check=true;
        }

//        count = tt.getText().toString();
//        operation="-";
//        if(result==1&&check==0)
//        {
//            result=Integer.valueOf(count);
//            rt.setText(Integer.toString(result));
//            check=1;
//        }
//        else
//        {
//            result=result-Integer.valueOf(count);
//            count1=Integer.toString(result);
//            rt.setText(Integer.toString(result));
//        }
//
//        tt.setText("0");
//        count=null;
    }

    public  void back(View v)
    {
        count = tt.getText().toString();
        count=count.substring(0,count.length()-1);
        tt.setText(count);
    }

   public  void  ans(View v)
   {
       if(check==true) {
           count = tt.getText().toString();
           String getanswer = rt.getText().toString();
           Double answertodouble = Double.valueOf(getanswer);
           Double find = answertodouble - answertodouble.intValue();
           if (find == 0) {
               count += Integer.toString(answertodouble.intValue());
           } else {
               count += Double.toString(answertodouble);
           }
           tt.setText(count);
           check=false;
       }
   }
    public void equal(View view)
    {
        count = tt.getText().toString();


       // rt.setText(sep[1]);
        if(count.contains("+"))
        {
            String[] sep=count.split("\\+");
            resul1=Double.valueOf(sep[0])+Double.valueOf(sep[1]);
        }
        else if(count.contains("-"))
        { String[] sep=count.split("\\-");
            resul1=Double.valueOf(sep[0])-Double.valueOf(sep[1]);
        }
        else if(count.contains("*"))
        {
            String[] sep=count.split("\\*");
            resul1=Double.valueOf(sep[0])*Double.valueOf(sep[1]);
        }
        else if(count.contains("/"))
        {
            String[] sep=count.split("\\/");
            resul1=Double.valueOf(sep[0])/Double.valueOf(sep[1]);
        }else
        {
          resul1=Double.valueOf(tt.getText().toString());
        }
        count1=Double.toString(resul1);
        tt.setText("0");
        rt.setText(count1);
        check=true;
    }

}