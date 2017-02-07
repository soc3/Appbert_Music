package com.example.prakhargupta.appbert_music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by PRAKHAR GUPTA on 08-09-2016.
 */


class SongAdt2 extends BaseAdapter {
    private String[] songs;
    private LayoutInflater songInf;

    public SongAdt2(Context c, String[] theSongs){
        songs=theSongs;
        songInf=LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return songs.length;
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout)songInf.inflate
                (R.layout.song2, parent, false);
        //get title and artist views
        TextView songView = (TextView)songLay.findViewById(R.id.song_title2);
        //TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        String currSong = songs[position];
        //get title and artist strings
        songView.setText(currSong);
        // artistView.setText(currSong.getArtist());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }


}
