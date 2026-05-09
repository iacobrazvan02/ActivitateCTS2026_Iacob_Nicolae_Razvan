package ModelDrone.Prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class AutonomousDriving{
    private String version;
    private List<String > decisionRules;

    public AutonomousDriving(String version, List<String> decisionRules) {
        this.version = version;
        this.decisionRules = decisionRules;
    }

    protected AutonomousDriving(){
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDecisionRules(List<String> decisionRules) {
        this.decisionRules = decisionRules;
    }

    public List<String> getDecisionRules(){
        return decisionRules;
    }

    public abstract AutonomousDriving cloneaza();

    protected List<String> copyRules() {
        return new ArrayList<>(this.decisionRules);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutonomousDriving{");
        sb.append("version='").append(version).append('\'');
        sb.append(", decisionRules=").append(decisionRules);
        sb.append('}');
        return sb.toString();
    }
}
