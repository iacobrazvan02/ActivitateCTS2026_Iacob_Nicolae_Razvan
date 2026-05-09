package ModelDrone.Prototype;

import java.util.List;

public class ModulAi extends AutonomousDriving{

    public ModulAi(String version, List<String> decisionRules) {
        super(version, decisionRules);
    }

    private ModulAi() {
        super();
    }

    @Override
    public AutonomousDriving cloneaza() {
        ModulAi copie  = new ModulAi();
        copie.setVersion(this.getVersion());
        copie.setDecisionRules(this.getDecisionRules());
        return copie;
    }
}
