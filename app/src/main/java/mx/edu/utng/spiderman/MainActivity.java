package mx.edu.utng.spiderman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_tobey,btn_andrew,btn_tom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tobey=(Button) findViewById(R.id.btn_tobey);
        btn_andrew= (Button) findViewById(R.id.btn_andrew);
        btn_tom=(Button) findViewById(R.id.btn_tom);

    }

    public void foto(View view) {
        switch (view.getId()){
            case R.id.btn_tobey:
                Intent intentTobey = new Intent(MainActivity.this,tobey.class);
                startActivity(intentTobey);
                Toast.makeText(MainActivity.this, "SpiderMan de Tobey", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_andrew:
                Intent intentAndrew= new Intent(MainActivity.this,andrew.class);
                startActivity(intentAndrew);
                Toast.makeText(MainActivity.this, "SpiderMan de Andrew", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_tom:
                Intent intentTom= new Intent(MainActivity.this,tom.class);
                startActivity(intentTom);
                Toast.makeText(MainActivity.this, "SpiderMan de Tom", Toast.LENGTH_LONG).show();
                break;
        }
    }
}