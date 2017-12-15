package linhmil.oop.hcmiu.rescuepets.entities.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import linhmil.oop.hcmiu.rescuepets.R;
import linhmil.oop.hcmiu.rescuepets.entities.model.Pets;

/**
 * Created by Admin on 12/10/2017.
 */

public class PetAdapter extends ArrayAdapter<Pets>{
    private Context con;
    private int layout;
    private ArrayList<Pets> arrPet;


    public PetAdapter(@NonNull Context context, int resource, @NonNull  ArrayList<Pets> objects) {
        super(context, resource, objects);
        con = context;
        layout = resource;
        arrPet = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater view = LayoutInflater.from(con);
        convertView = view.inflate(layout,null);
        ImageView ivItem = (ImageView) convertView.findViewById(R.id.imageView);
        Pets temp = arrPet.get(position);
        ivItem.setImageResource(temp.getPic());

         return convertView;
        //return super.getView(position, convertView, parent);
    }
}
