package dsa.hcmiu.a2048pets.entities.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import dsa.hcmiu.a2048pets.entities.model.Pets;


/**
 * Created by Admin on 3/25/2018.
 */

public class PetAdapter extends ArrayAdapter<Pets>{

    public PetAdapter(Context context, int columnCount) {
        super(context, columnCount);
    }

/*    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_pet, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            convertView.setOnHoverListener();
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.build(getItems().get(position).getPic());
        return convertView;
    }*/

/*    private class ViewHolder {
        private ImageView ivItem;

        private ViewHolder(View view) {
            ivItem = (ImageView) view.findViewById(R.id.imageView);
        }

        void build(int pic) {
            ivItem.setImageResource(pic);
        }
    }*/
}
