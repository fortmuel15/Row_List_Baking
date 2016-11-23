package at.fh.swengb.row_list_baking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

import at.fh.swengb.row_list_baking.model.Cupcake;

/**
 * Created by 2540p on 22.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Cupcake> listCupcakes;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Cupcake> listCupcakes) {
        this.context = applicationContext;
        this.listCupcakes= listCupcakes;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listCupcakes.size();
    }

    @Override
    public Object getItem(int i) {
        return listCupcakes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewTaste=(TextView)view.findViewById(R.id.textViewListTaste);
        TextView viewCalories=(TextView)view.findViewById(R.id.textViewListCalories);
        TextView viewColorCupcakeCase = (TextView)view.findViewById(R.id.textViewColorCupcakeCase);

        Cupcake cupcake = listCupcakes.get(i);
        viewName.setText(cupcake.getName());
        viewTaste.setText(cupcake.getTaste());
        viewCalories.setText(cupcake.getCalories());
        viewColorCupcakeCase.setText(cupcake.getColorCupcakeCase());

        return view;
    }
}

