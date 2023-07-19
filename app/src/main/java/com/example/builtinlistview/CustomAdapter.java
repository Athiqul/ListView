package com.example.builtinlistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter <String> {
    private final String[] arr;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource,arr);

        this.arr=arr;

    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view,parent,false
        );
        TextView t=convertView.findViewById(R.id.textView);
        Log.e("Check", "CustomAdapter: "+t );
        t.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"You have clickecd on"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
