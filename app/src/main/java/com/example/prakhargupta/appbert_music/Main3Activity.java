package com.example.prakhargupta.appbert_music;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.HashSet;
import java.util.Set;

public class Main3Activity extends ListActivity {
    MainActivity obj=new MainActivity();
    Set<String> set=new HashSet<String>();
    private ListView artists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        artists=(ListView)findViewById(R.id.listView);
        for(int i=0;i<obj.songList.size();i++)
        {
            set.add(obj.songList.get(i).getTitle());
        }
        String[] s= (String[])set.toArray();
        SongAdt2 songAdt2 = new SongAdt2(this, s);
        artists.setAdapter(songAdt2);
    }
}
