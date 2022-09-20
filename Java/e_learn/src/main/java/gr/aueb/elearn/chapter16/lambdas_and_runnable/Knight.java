package gr.aueb.elearn.chapter16.lambdas_and_runnable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Knight implements IKnight, Runnable {
    private final String name;

    @Override
    public void run() {
        synchronized (IKnight.missions) {
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }

    @Override
    public void embarkOnMission(IMission iMission) {
        System.out.printf("Knight name: %s\n", this.getName() + " mission started!");
        iMission.embark();
        iMission.setStatus(MissionStatus.STARTED);
    }

}
