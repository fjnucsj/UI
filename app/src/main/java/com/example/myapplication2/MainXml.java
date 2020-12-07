package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
import android.widget.Toast;
public class MainXml extends AppCompatActivity
{


    private static final int Font_10 = 0x111;
    private static final int Font_16 = 0x114;
    private static final int Font_20 = 0x116;

    private static final int FONT_RED = 0x118;
    private static final int FONT_BLUE = 0x119;
    private static final int FONT_GREEN = 0x120;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml);
        text =findViewById(R.id.txt);
    }
    @Override public boolean onCreateOptionsMenu (Menu menu)
    {
//        getMenuInflater().inflate(R.menu.menu,menu);

        SubMenu fontMenu = menu.addSubMenu("字体大小");
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0,Font_10,0,"10号字体");
        fontMenu.add(0,Font_16,0,"16号字体");
        fontMenu.add(0,Font_20,0,"20号字体");
//        menu.add(0,PLAIN_ITEM,0,"普通菜单");
        SubMenu colorMenu =menu.addSubMenu("字体颜色");
        colorMenu.setHeaderTitle("选择字体颜色");
        colorMenu.add(0,FONT_RED,0,"红色");
        colorMenu.add(0,FONT_GREEN,0,"绿色");
        colorMenu.add(0,FONT_BLUE,0,"蓝色");
        return super.onCreateOptionsMenu(menu);
    }
    @Override public  boolean onOptionsItemSelected(MenuItem mi)
    {
        switch (mi.getItemId())
        {
            case Font_10:text.setTextSize(10*2);break;
            case Font_16:text.setTextSize(16*2);break;
            case Font_20:text.setTextSize(20*2);break;
            case FONT_RED:text.setTextColor(Color.RED);break;
            case FONT_BLUE:text.setTextColor(Color.BLUE);break;
            case FONT_GREEN:text.setTextColor(Color.GREEN);break;

        }
        return true;
    }


}
