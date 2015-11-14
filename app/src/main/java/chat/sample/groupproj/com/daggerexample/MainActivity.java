package chat.sample.groupproj.com.daggerexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Vehicle car;
    Motor motor,motor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        car = new Vehicle(new Motor(5));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent component= ApplicationComponents.getVehicleComponent();

        car=component.provideVehicle();
      motor = component.provideMotor();
        motor2=component.provideMotor();
        motor.setSpeed(6);
    }
    public void ButtonClick(View view ){

        Toast.makeText(MainActivity.this, motor2.getSpeed()+"", Toast.LENGTH_SHORT).show();
      Intent intent= new Intent (this,Second.class);
        startActivity(intent);
    }
}
