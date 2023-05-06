package com.example.exotica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity{
    private Tourism tourism;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        // This is a test, there will be a way to dynamically get the data dynamically from the firebase database
        tourism = new Tourism("Al Bustan", "chedi", "Mutrah, Muscat", 03102024,
                32,
                "Secluded amid an emerald green oasis overlooked by the Al Hajar Mountains, Al Bustan Palace, a Ritz-Carlton Hotel stands proudly as one of the sultanate's landmarks. With the Gulf of Oman beckoning from the edge of its beachfront and the glimmer of an exquisite crystal chandelier in the lobby, this luxury resort in Muscat is a destination of its own. Distinctive venues include fine Chinese cuisine, seaside dining and a new elegant jazz lounge.",
                5.3, 72001823, "hamoodmaawali@gmail.com");

        setInitialData(tourism);
    }

    private void setInitialData(Tourism tourism) {
        TextView tvActivityName = findViewById(R.id.tvActivityName);
        TextView tvActivityLocation = findViewById(R.id.tvActivityLocation);
        TextView tvActivityPrice = findViewById(R.id.tvActivityPrice);
        TextView tvActivityDesc = findViewById(R.id.tvActivityDesc);
        TextView tvActivityContactPhone = findViewById(R.id.tvActivityContactPhone);
        TextView tvActivityContactEmail = findViewById(R.id.tvActivityContactEmail);
        ImageView ivActivityImage = findViewById(R.id.ivActivityImage);

        setTitle(tourism.getActivityName());
        tvActivityName.setText(tourism.getActivityName());
        tvActivityLocation.setText(tourism.getActivityLocation());
        tvActivityPrice.setText(tourism.getActivityPrice() + " OMR");
        tvActivityDesc.setText(tourism.getActivityDesc());
        tvActivityContactPhone.setText(tourism.getActivityContactPhone() + "");
        tvActivityContactEmail.setText(tourism.getActivityContactEmail());

        int resIdImage = getResources().getIdentifier(tourism.getActivityImageName(), "drawable", getPackageName());
        ivActivityImage.setImageResource(resIdImage);
    }
}
