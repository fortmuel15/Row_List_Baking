package at.fh.swengb.row_list_baking;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

import at.fh.swengb.row_list_baking.model.Cupcake;

/**
 * Created by 2540p on 22.11.2016.
 */

public class ShowUserActivity extends AppCompatActivity {

    private Cupcake cupcake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cupcake);

        Intent intent = getIntent();
        cupcake = (Cupcake) intent.getExtras().get("cupcake");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewTaste = (TextView) findViewById(R.id.textViewTaste);
        TextView viewCalories = (TextView) findViewById(R.id.textViewCalories);
        TextView viewColorCupcakeCase = (TextView) findViewById(R.id.textViewColorCupcakeCase);

        viewName.setText(cupcake.getName());
        viewTaste.setText(cupcake.getTaste());
        viewCalories.setText(cupcake.getCalories());
        viewColorCupcakeCase.setText(cupcake.getColorCupcakeCase());

    }

    public void showRecipe(View view) {
        // Map point based on address
        Uri location = Uri.parse(cupcake.getName());
        Intent recipeIntent = new Intent(Intent.ACTION_VIEW, location);

        startActivity(recipeIntent);
    }


}