package level2.exercise1.runner;

import level2.exercise1.model.Smartphone;

public class ProgramRunner {

    public void run() {

        Smartphone sPhone = new Smartphone("Super Phone", "XCD159");

        System.out.println(sPhone + sPhone.takePic() + sPhone.alarm() + sPhone.call("+54-735-215-872"));
    }

}
