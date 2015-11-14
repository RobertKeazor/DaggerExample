package chat.sample.groupproj.com.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn= (Button) findViewById(R.id.btn2);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               VehicleComponent component = ApplicationComponents.getVehicleComponent();
               Motor motor = component.provideMotor();
               Toast.makeText(Second.this, motor.getSpeed()+"", Toast.LENGTH_SHORT).show();
           }
       });
    }
}
