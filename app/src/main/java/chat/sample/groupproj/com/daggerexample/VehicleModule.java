package chat.sample.groupproj.com.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor(1);
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(provideMotor());
    }
}
