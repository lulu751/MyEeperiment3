package com.example.hp.myapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import  android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestActivity1 extends AppCompatActivity {
    private ListView mListView;
    private String[] names = {"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] icons={R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simpleadapter);
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        for(int i=0;i<names.length;i++) {
            Map<String, Object> row = new HashMap<String, Object>();
            row.put("names", names[i]);
            row.put("icons", icons[i]);
            list.add(row);
        }
            mListView = (ListView) findViewById(R.id.lv);
            SimpleAdapter adapter = new SimpleAdapter(this, list, R.layout.list_items, new String[]{"names", "icons"},
                    new int[]{R.id.item_tv, R.id.item_image});

            mListView.setAdapter(adapter);

            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ListView lv = (ListView) parent;
                    //得到数据
                    Map<String, Object> item = (Map<String, Object>) lv.getItemAtPosition(position);

                    Toast.makeText(TestActivity1.this, "" + item.get("names"), Toast.LENGTH_LONG).show();
                }

            });


    }
}
