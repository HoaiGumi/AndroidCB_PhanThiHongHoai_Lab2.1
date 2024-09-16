package com.example.animal;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int[] animalImages = {
            R.drawable.img,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3

    };
    private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo mảng màu từ colors.xml
        colors = new int[]{
                ContextCompat.getColor(this, R.color.purple_200),
                ContextCompat.getColor(this, R.color.purple_500),
                ContextCompat.getColor(this, R.color.purple_700),
                ContextCompat.getColor(this, R.color.teal_200),
                ContextCompat.getColor(this, R.color.teal_700)
        };
        ImageView animalImageView = findViewById(R.id.animalImageView);
        TextView textView = findViewById(R.id.textView);
        RelativeLayout layout = findViewById(R.id.layout);

        Random random = new Random();
        int randomAnimal = random.nextInt(animalImages.length);
        int randomColor = random.nextInt(colors.length);

        animalImageView.setImageResource(animalImages[randomAnimal]);
        layout.setBackgroundColor(colors[randomColor]);
    }
}