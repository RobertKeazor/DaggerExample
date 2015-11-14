package chat.sample.groupproj.com.daggerexample;

import javax.inject.Inject;

/**
 * Created by rob2cool on 11/14/15.
 */
public class Vehicle {

 Motor motor;
@Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public int ToastSpeed (){
     return motor.speed;
    }
}
