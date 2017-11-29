package linhmil.oop.hcmiu.listviewadvance.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import linhmil.oop.hcmiu.listviewadvance.R;
import linhmil.oop.hcmiu.listviewadvance.model.Music;

/**
 * Created by Admin on 10/7/2017.
 */

public class MusicAdapter extends ArrayAdapter<Music>{
    private Context con;
    private int layout;
    private ArrayList<Music> arrMusic;
    private TextView tvLyric;

    public MusicAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Music> objects,
                        TextView tvLyric) {
        super(context, resource, objects);
        con=context;
        layout = resource;
        arrMusic = objects;
        this.tvLyric = tvLyric;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater view = LayoutInflater.from(con);
        convertView = view.inflate(R.layout.row_music,null);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvSinger = (TextView) convertView.findViewById(R.id.tvSinger);
        TextView tvTime = (TextView) convertView.findViewById(R.id.tvTime);
        TextView tvCode = (TextView) convertView.findViewById(R.id.tvCode);
        ImageView ivSinger = (ImageView) convertView.findViewById(R.id.ivSinger);

        Music temp = arrMusic.get(position);
        tvTitle.setText(temp.getTitle());
        tvSinger.setText(temp.getSinger());
        tvTime.setText(temp.getTime());
        tvCode.setText(temp.getCode());

        int code = temp.getId();
        if(code==-1) ivSinger.setVisibility(View.GONE);
        else ivSinger.setVisibility(View.VISIBLE);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //return super.getView(position, convertView, parent);
        return convertView;
    }
}
