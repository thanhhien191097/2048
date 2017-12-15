package linhmil.oop.hcmiu.rescuepets;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.widget.AutoScrollHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import linhmil.oop.hcmiu.rescuepets.entities.adapter.PetAdapter;
import linhmil.oop.hcmiu.rescuepets.entities.model.Pets;
import linhmil.oop.hcmiu.rescuepets.map.OnSwipeTouchListener;

public class PlayActivity extends Activity {
    GridView gvMatrix;
    int[] arrId;
    int[] arrImage;
    String[] arrPet;
    ArrayList<Pets> arrPets;

    //HIEU
    MediaPlayer mySong,myClick;
    Animation uptodown,downtoup;
    Button button1,button2,button3;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        gvMatrix = (GridView) findViewById(R.id.gridview);
        TypedArray images = getResources().obtainTypedArray(R.array.arrImage);
        //int images[] = new int[]{R.drawable.cat,R.drawable.dog,R.drawable.hamster,R.drawable.tiger,R.drawable.pig};
        arrPet = getResources().getStringArray(R.array.arrPet);
        arrImage = new int[5];
        arrId = new int[5];
        for(int i=0;i<5;i++) {
            arrImage[i]= images.getResourceId(i,-1);
            //arrImage[i]=images[i];
            arrId[i]=i;
        }
        //initialize matrix
        int[][] a= new int[8][8];
        for (int i=0;i<6;i++) {
            for (int j=0;j<8;j++) {
                Random r = new Random();
                a[i][j]=r.nextInt()%4;
                if (a[i][j]<0) a[i][j]*=-1;
            }
        }
        //set item
        if (arrPets==null) arrPets= new ArrayList<>();
        for (int i=0;i<6;i++) {
            int count=0;
            for (int j =0; j<8; j++) {
                Pets temp = new Pets();
                int pos=a[i][j];
                temp.setId(arrId[pos]);
                temp.setName(arrPet[pos]);
                temp.setPic(arrImage[pos]);
                arrPets.add(temp);
            }
        }
        PetAdapter adapter = new PetAdapter(this, R.layout.item_pet, arrPets);
        gvMatrix.setAdapter(adapter);
        gvMatrix.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //HIEU

        //sound
        mySong= MediaPlayer.create(PlayActivity.this,R.raw.song);
        myClick= MediaPlayer.create(PlayActivity.this,R.raw.click);
        //callButtono
        button1 = (Button) findViewById(R.id.bMenuPlay);
        button2 = (Button) findViewById(R.id.bStore);
        button3 = (Button) findViewById(R.id.bMenuSetting);
        //callAnimation

        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);

        button1.setAnimation(downtoup);
        button2.setAnimation(downtoup);
        button3.setAnimation(downtoup);

        //loopSound
        mySong.setLooping(true);
        mySong.start();

    }
    public void playIT(View view){
        myClick.start();
    }
    public void storeIT(View view){
        myClick.start();
    }
    public void settingIT(View view){
        myClick.start();
    }





        /*gvMatrix.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {
                Pets pet = arrPets.get(position);
                Toast.makeText(PlayActivity.this,position+" clicked", Toast.LENGTH_SHORT).show();

                gvMatrix.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent event) {
                        int pos2nd=0;
                        if (event.getAction() == MotionEvent.ACTION_DOWN) {
                            pos2nd=position+8;
                        }
                        if (event.getAction() == MotionEvent.ACTION_UP) {
                            pos2nd = position -8;
                        }
                        if (pos2nd<0) return false;
                        Pets temp = new Pets();
                        temp.assign(arrPets.get(position));
                        arrPets.get(position).assign(arrPets.get(pos2nd));
                        arrPets.get(pos2nd).assign(temp);
                        return true;
                    }
                });
                PetAdapter adapter = new PetAdapter(this, R.layout.item_pet, arrPets);
                gvMatrix.setAdapter(adapter);
            }
        });*/

}
