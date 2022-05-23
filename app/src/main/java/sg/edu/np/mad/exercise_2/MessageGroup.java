package sg.edu.np.mad.exercise_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button group1 = findViewById(R.id.group1);

        group1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,Group1Fragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

        Button group2 = findViewById(R.id.group2);
        group2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frameLayout,Group2Fragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}