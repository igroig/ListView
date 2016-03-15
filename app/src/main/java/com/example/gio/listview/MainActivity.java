package com.example.gio.listview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new VivzAdapter(this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                switch(position) {
                    case 0:
                    Toast.makeText(getBaseContext(), "0", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "1", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "2", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), "3", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), "4", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), "5", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(getBaseContext(), "6", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(getBaseContext(), "7", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("http://stackoverflow.com/questions/3004515/android-sending-an-intent-to-browser-to-open-specific-url"));
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
