package chat.sample.groupproj.com.daggerexample;

import android.app.Application;

/**
 * Created by rob2cool on 11/14/15.
 */
public class ApplicationComponents extends Application {

    public static VehicleComponent  component = null;

    public static VehicleComponent getVehicleComponent() {
        return component;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        if (component == null)
     component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
     THISCOMPONENT();
    }
    public VehicleComponent THISCOMPONENT(){
        return component;
    }


}
