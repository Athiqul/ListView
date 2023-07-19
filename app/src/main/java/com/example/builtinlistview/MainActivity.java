package com.example.builtinlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private final String[] items ={"item1","item2","item3","Athiqul","Hasan","Momin","SHakib","AL","Hasan","Tamim","Iqbal","takljf","kljdfas","kjdfaskj","kjdfaskjdfajs" ,"kjldfaskj","uidrfhjiadf","dkljdfa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get Listview by id
        ListView listView = (ListView) findViewById(R.id.listView);
        //built in Listview
//        ArrayAdapter <String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//       listView.setAdapter(adapter);
       //Custom List view

        CustomAdapter adapter= new CustomAdapter(this,R.layout.custom_list_view,items);
        listView.setAdapter(adapter);


    }
}