package gr.aueb.elearn.chapter16.lambdas_and_runnable;

public class ExploreTheDungeon implements IMission{
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    @Override
    public void embark() {
        System.out.println("Exploring the dungeon!");   
    }
}
