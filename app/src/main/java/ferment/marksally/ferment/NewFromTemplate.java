package ferment.marksally.ferment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewFromTemplate extends AppCompatActivity {

    private Button btnTepache;
    private Button btnKombucha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_from_template);

        btnTepache = (Button) findViewById(R.id.btnTepache);
        btnTepache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTepache();
            }

        });

        btnKombucha = (Button) findViewById(R.id.btnKombucha);
        btnKombucha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKombucha();
            }
        });
    }

    public void openTepache(){
        Intent intent = new Intent(this, Tepache.class);
        startActivity(intent);
    }

    public void openKombucha(){
        Intent intent = new Intent(this, Kombucha.class);
        startActivity(intent);
    }
}
