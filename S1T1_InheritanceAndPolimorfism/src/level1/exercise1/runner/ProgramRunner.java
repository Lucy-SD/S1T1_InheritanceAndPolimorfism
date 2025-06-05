package level1.exercise1.runner;

import level1.exercise1.model.PercussionInstument;
import level1.exercise1.model.StringedInstrument;
import level1.exercise1.model.WindInstrument;

public class ProgramRunner {

    public void run() {

        WindInstrument saxo = new WindInstrument("saxo", 1874.51f);
        StringedInstrument guitarra = new StringedInstrument("guitarra", 1247.74f);
        PercussionInstument tambor = new PercussionInstument("tambor", 574.17f);

        System.out.println(saxo.play() + saxo + guitarra.play() + guitarra +
                tambor.play() + tambor);

    }
}
