package edu.shahisjsu.sagar.randomme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int WELCOME_TIME = 4000;
    private ImageButton Food, Chill;
    private ImageView owlImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Food = (ImageButton) findViewById(R.id.Food);
        Chill = (ImageButton) findViewById(R.id.Chill);
        owlImage = (ImageView) findViewById(R.id.OwlImage);
        ViewGroup parent =(ViewGroup) owlImage.getParent();

        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This is Click", Toast.LENGTH_LONG).show();

            }
        });



        for (int i=0; i<5; i++){
            ImageButton myButton = new ImageButton(this);
            myButton.setId(i);
            myButton.setImageResource(R.mipmap.owl);
            myButton.setBackgroundResource(R.drawable.roundedbutton);

            LinearLayout previousPlaces = (LinearLayout) findViewById(R.id.previousPlaces);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.MATCH_PARENT);
            lp.leftMargin = 30;
            lp.rightMargin = 30;
            myButton.setLayoutParams(lp);

            previousPlaces.addView(myButton,lp);
        }
        boolean x = true;
        if(x){
            parent.removeView(owlImage);
        }
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent welcomeIntent = new Intent(MainActivity.this, FirstScreenActivity.class);
//                startActivity(welcomeIntent);
//                finish();
//            }
//        },WELCOME_TIME);
    }
}
