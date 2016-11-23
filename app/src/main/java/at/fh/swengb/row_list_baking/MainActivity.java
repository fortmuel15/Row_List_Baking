package at.fh.swengb.row_list_baking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.row_list_baking.model.Cupcake;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Cupcake> listCupcakes;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCupcakes = new ArrayList<>();
        listCupcakes.add(new Cupcake("Chocolatemuffin","Chocolaty", 350, "red"));
        listCupcakes.add(new Cupcake("Fruitmuffin","Fruity", 450, "blue"));
        listCupcakes.add(new Cupcake("Strawberrymuffin","Strawberrily",459, "yellow"));
        listCupcakes.add(new Cupcake("Christmasmuffin","Christmasly",570, "pink"));
        listCupcakes.add(new Cupcake("Fitnessmuffin","Healthy",210, "orange"));


        myListView = (ListView) findViewById(R.id.myCupcakeList);

        myAdapter = new CustomAdapter (this,listCupcakes);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);


    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Cupcake selectedCupcake = listCupcakes.get(i);
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("cupcake",selectedCupcake);
        startActivity(intent);

    }
}
