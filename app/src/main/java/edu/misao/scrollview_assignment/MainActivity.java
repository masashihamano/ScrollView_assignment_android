package edu.misao.scrollview_assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        btn1 = findViewById( R.id.btnangkor );
        btn2 = findViewById( R.id.btncappadocia );
        btn3 = findViewById( R.id.btneverest );
        btn4 = findViewById( R.id.btngrand_canyon );
        btn5 = findViewById( R.id.btnpetra );
        btn6 = findViewById( R.id.btnmaldives );
        btn7 = findViewById( R.id.btnmachu_picchu );
        btn8 = findViewById( R.id.btnuluru );
        btn9 = findViewById( R.id.btnuyuni );
        btn10 = findViewById( R.id.btnvenezia );

        btn1.setOnClickListener( this );
        btn2.setOnClickListener( this );
        btn3.setOnClickListener( this );
        btn4.setOnClickListener( this );
        btn5.setOnClickListener( this );
        btn6.setOnClickListener( this );
        btn7.setOnClickListener( this );
        btn8.setOnClickListener( this );
        btn9.setOnClickListener( this );
        btn10.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnangkor:      Intent a = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Angkor_Wat") );startActivity(a);break;
            case R.id.btncappadocia:  Intent b = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Cappadocia") );startActivity(b);break;
            case R.id.btneverest:     Intent c = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Mount_Everest" ) );startActivity( c );break;
            case R.id.btngrand_canyon:Intent d = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Grand_Canyon") );startActivity( d );break;
            case R.id.btnpetra:       Intent e = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Petra") );startActivity( e );break;
            case R.id.btnmaldives:    Intent f = new Intent( Intent.ACTION_VIEW,Uri.parse( "https://en.wikipedia.org/wiki/Tourism_in_the_Maldives" ) );startActivity(f);break;
            case R.id.btnmachu_picchu:Intent g = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Machu_Picchu") );startActivity( g );break;
            case R.id.btnuluru:       Intent h = new Intent( Intent.ACTION_VIEW,Uri.parse( "https://en.wikipedia.org/wiki/Uluru" ) );startActivity( h );break;
            case R.id.btnuyuni:       Intent i = new Intent( Intent.ACTION_VIEW,Uri.parse( "https://en.wikipedia.org/wiki/Uyuni" ));startActivity( i );break;
            case R.id.btnvenezia:     Intent j = new Intent( Intent.ACTION_VIEW,Uri.parse("https://en.wikipedia.org/wiki/Venice") );startActivity( j );break;

        }

    }

}

