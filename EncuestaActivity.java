package curso.umg.gt.miapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class EncuestaActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Spinner edad, sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
    }
//
    //
    public void onClick(View view) {

        Intent miIntent=new Intent(EncuestaActivity.this, EncuestaActivitysig.class);
        startActivity(miIntent);
            edad=(Spinner) findViewById(R.id.spn1);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array, R.layout.simple_spinner_item);
        edad.setAdapter(adapter);

        Intent mIntent=new Intent(EncuestaActivity.this, EncuestaActivitysig.class);
        startActivity(miIntent);
        sexo=(Spinner) findViewById(R.id.spn1);

        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this, R.array, R.layout.simple_spinner_item);
        sexo.setAdapter(adapter1);
        }

    }
