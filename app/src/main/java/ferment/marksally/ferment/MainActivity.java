package ferment.marksally.ferment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnNewProject;
    private Button btnNewFromTemplate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNewProject = (Button) findViewById(R.id.btnNewProject);
        btnNewProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewProject();
            }

        });

        btnNewFromTemplate = (Button) findViewById(R.id.btnNewFromTemplate);
        btnNewFromTemplate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewFromTemplate();
            }
        });
    }

    public void openNewProject(){
        Intent intent = new Intent(this, NewProject.class);
        startActivity(intent);
    }

    public void openNewFromTemplate(){
        Intent intent = new Intent(this, NewFromTemplate.class);
        startActivity(intent);
    }
}
