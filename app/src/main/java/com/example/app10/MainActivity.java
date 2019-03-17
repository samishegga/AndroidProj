package com.example.app10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static ListView list_view;
    private static String names[]={"Ali", "Mohmd", "Usman", "Ahmed","Chala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List_View();
    }


    public void List_View(){
        list_view=(ListView) findViewById(R.id.ListView_id);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.name_list,names);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=(String)list_view.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,"Position: "+position+" Value: "+value,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
