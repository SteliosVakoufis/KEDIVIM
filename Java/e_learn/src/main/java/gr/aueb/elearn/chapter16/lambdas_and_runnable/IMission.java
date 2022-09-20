package gr.aueb.elearn.chapter16.lambdas_and_runnable;

public interface IMission {
    MissionStatus getStatus();

    void setStatus(MissionStatus missionStatus);

    void embark();
}
