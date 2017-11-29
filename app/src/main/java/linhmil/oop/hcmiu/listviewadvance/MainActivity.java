package linhmil.oop.hcmiu.listviewadvance;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import linhmil.oop.hcmiu.listviewadvance.adapter.MusicAdapter;
import linhmil.oop.hcmiu.listviewadvance.model.Music;

public class MainActivity extends AppCompatActivity {

    ListView lvMusic;
    String[] arrTitle, arrSinger, arrTime, arrCode;
    int[] arrImage;
    ArrayList<Music> arrMusic;
    TextView tvLyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMusic = (ListView) findViewById(R.id.lvMusic);

        arrTitle = getResources().getStringArray(R.array.arrTitle);
        arrSinger = getResources().getStringArray(R.array.arrSinger);
        arrTime = getResources().getStringArray(R.array.arrTime);
        arrCode = getResources().getStringArray(R.array.arrCode);
        tvLyric = (TextView) findViewById(R.id.tvLyric);
        tvLyric.setText("You don't deaf, do you?");

        TypedArray images = getResources().obtainTypedArray(R.array.arrImage);
        arrImage = new int[arrSinger.length];
        for(int i=0;i<arrImage.length;i++) {
            arrImage[i]= images.getResourceId(i,-1);
        }
        arrMusic = new ArrayList<>();
        Music temp;
        for (int i=0;i<arrImage.length;i++) {
            temp = new Music();
            if (arrSinger[i].equals("Lệ Rơi")) temp.setId(arrImage[0]);
            else temp.setId(-1);
            temp.setCode(arrCode[i]);
            temp.setSinger(arrSinger[i]);
            temp.setTime(arrTime[0]);
            temp.setTitle(arrTitle[i]);
            arrMusic.add(temp);
        }
        MusicAdapter adapter = new MusicAdapter(this, R.layout.row_music, arrMusic,);
        lvMusic.setAdapter(adapter);

    }

}
