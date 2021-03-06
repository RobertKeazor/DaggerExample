package chat.sample.groupproj.com.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
 
    Vehicle provideVehicle();
    Motor   provideMotor ();
 
}