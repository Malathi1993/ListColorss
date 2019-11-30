package com.example.listcolors;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] colors = {"Green","blue","white","black","Red","orange"};
    ListView listView;
    ArrayAdapter<String> adapter;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.lvColors);
        linearLayout = (LinearLayout)findViewById(R.id.llBackground);
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,colors);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.green));
                    Toast.makeText(MainActivity.this, "Green Selected", Toast.LENGTH_SHORT).show();

                }else if (i==1)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.blue));
                    Toast.makeText(MainActivity.this, "blue Selected", Toast.LENGTH_SHORT).show();
                }else if (i==2)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.white));
                    Toast.makeText(MainActivity.this, "whit Selected", Toast.LENGTH_SHORT).show();
                }else if (i==3)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.BLACK));
                    Toast.makeText(MainActivity.this, "black Selected", Toast.LENGTH_SHORT).show();
                }else if (i==4)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.red));
                    Toast.makeText(MainActivity.this, "red Selected", Toast.LENGTH_SHORT).show();
                }else if (i==5)
                {
                    linearLayout.setBackgroundColor(getColor(R.color.orange));
                    Toast.makeText(MainActivity.this, "orange Selected", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
