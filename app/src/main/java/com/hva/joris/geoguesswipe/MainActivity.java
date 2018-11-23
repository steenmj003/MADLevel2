package com.hva.joris.geoguesswipe;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StreetviewObject> streetviewObjects = new ArrayList<>();

        for (int i = 0; i < StreetviewObject.PRE_DEFINED_IMAGES.length; i++) {
            streetviewObjects.add(new StreetviewObject(StreetviewObject.PRE_DEFINED_IMAGES[i],
                    StreetviewObject.PRE_DEFINED_OBJECT_IN_EUROPE[i]));
        }

        final RecyclerView recyclerView =  findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        StreetviewObjectAdapter adapter = new StreetviewObjectAdapter(this, streetviewObjects);
        recyclerView.setAdapter(adapter);

        ItemTouchHelper.SimpleCallback simpleItemTouchCallback =
                new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
                    @Override
                    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder
                            target) {
                        return false;
                    }
                    //Called when a user swipes left or right on a ViewHolder
                    @Override
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                        //Get the index corresponding to the selected position
                        int position = (viewHolder.getAdapterPosition());

                        if(StreetviewObject.PRE_DEFINED_OBJECT_IN_EUROPE[position] && swipeDir == 4){
                            Snackbar.make(recyclerView, "Correct!", Snackbar.LENGTH_LONG).show();
                        } else if (!StreetviewObject.PRE_DEFINED_OBJECT_IN_EUROPE[position] && swipeDir == 8){
                            Snackbar.make(recyclerView, "Correct!", Snackbar.LENGTH_LONG).show();
                        } else {
                            Snackbar.make(recyclerView, "Incorrect!", Snackbar.LENGTH_LONG).show();
                        }
                    }
                };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }
}
