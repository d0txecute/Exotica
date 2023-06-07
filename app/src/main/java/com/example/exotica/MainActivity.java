package com.example.exotica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Tourism> tourismList= new ArrayList<>();
    private TourismAdapter tourismAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        tourismAdapter= new TourismAdapter();


       setSampleTourismData();
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(tourismAdapter);


    }



    // I added this from now so we dont have to mess around with it later - database has been set up
//    // Write a message to the database
//    FirebaseDatabase database = FirebaseDatabase.getInstance();
//    DatabaseReference myRef = database.getReference("message");
//
//    myRef.setValue("Hello, World!");
//
//    // Set Database Persistence
//    database.setPersistenceEnabled(true);

    // Read from the database
//    myRef.addValueEventListener(new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//            // This method is called once with the initial value and again
//            // whenever data at this location is updated.
//            String value = dataSnapshot.getValue(String.class);
//            Log.d(TAG, "Value is: " + value);
//        }
//
//        @Override
//        public void onCancelled(DatabaseError error) {
//            // Failed to read value
//            Log.w(TAG, "Failed to read value.", error.toException());
//    }

//    Buttons to go to other pages
    public void btn_bookHotel(View view) {
        Intent intent = new Intent(this, Hotel.class);
        startActivity(intent);
    }

    public void btn_findActivity(View view) {
        Intent intent = new Intent(this, Tourism.class);
        startActivity(intent);
    }

    private class TourismAdapter extends RecyclerView.Adapter<TourismAdapter.TourismViewHolder> {


        @NonNull
        @Override
        public TourismViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView= LayoutInflater.from(MainActivity.this)
                    .inflate(R.layout.tourism_list_row,parent,false);
            return new TourismViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull TourismViewHolder holder, int position) {
            Tourism tourism = tourismList.get(position);
            holder.tvActivityName.setText(tourism.getActivityName());
            int resId = getResources().getIdentifier(tourism.getActivityImageName(),"drawable",getPackageName());
            holder.ivActivityImageName.setImageResource(resId);
        }

        @Override
        public int getItemCount() {
            if (tourismList.size() >0)
                return tourismList.size();
            else
                return 0;
        }

        @Override
        public void OnClick(View view, int position) {

            Intent intent = new Intent(this,DetailActivity.class); //go to second page
            Tourism tourism = tourismList.get(position);
            intent.putExtra("TourismObject",tourism);

            startActivity(intent); }

        public class TourismViewHolder extends RecyclerView.ViewHolder {

            private TextView tvActivityName;
            private ImageView ivActivityImageName;

            public TourismViewHolder(@NonNull View itemView) {
                super(itemView);

                tvActivityName = itemView.findViewById(R.id.tvActivityName);
                ivActivityImageName = itemView.findViewById(R.id.ivactivityImageName);

            }
        }
    }

    private void setSampleTourismData() {

            Tourism tourism = new Tourism("Turtle Watching", "turtle.jpg");
            tourismList.add(tourism);

            Tourism tourism1 = new Tourism("Snorkling", "snorkling.jpg");
            tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Quad Biking", "quadbike.jpg");
        tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Desert Drifting", "drifting.jpg");
        tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Hiking", "hiking.jpg");
        tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Paragliding", "paragliding.jpg");
        tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Parasailing", "parasailing.jpg");
        tourismList.add(tourism);

        Tourism tourism1 = new Tourism("Boat Trip", "boat.jpg");
        tourismList.add(tourism);


            tourismAdapter.notifyDataSetChanged();

        }
    }











