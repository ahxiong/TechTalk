package kh.com.rookiedev.techtalk;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Typeface kantumruy = Typeface.createFromAsset(getAssets(),"Kantumruy.ttf");
        Animation fade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        Animation moveUp = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);

        ImageView logo = (ImageView)findViewById(R.id.appLogo);
        logo.setAnimation(moveUp);

        TextView missionary = (TextView)findViewById(R.id.missionary);
        missionary.setTypeface(kantumruy);
        missionary.setAnimation(fade);

        TextView techTalk = (TextView)findViewById(R.id.techTalk);
        techTalk.setTypeface(kantumruy);
        techTalk.setAnimation(fade);

        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setTypeface(kantumruy);
        btnLogin.setAnimation(fade);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });





    }
}
