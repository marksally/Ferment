package ferment.marksally.ferment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    private Button btnReg;
    private Button btnFbReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnReg = (Button) findViewById(R.id.btnReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainMenu();
            }

        });

        btnFbReg = (Button) findViewById(R.id.btnFbReg);
        btnFbReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainMenu();
            }

        });
    }

    public void openMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
