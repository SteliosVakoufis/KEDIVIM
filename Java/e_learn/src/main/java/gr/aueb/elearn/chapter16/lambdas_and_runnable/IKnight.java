package gr.aueb.elearn.chapter16.lambdas_and_runnable;

@FunctionalInterface
public interface IKnight {
    IMission[] missions = {
        new SaveThePrincess(),
        new ExploreTheDungeon(),
        new KillTheDragon()
    };

    void embarkOnMission(IMission iMission);
}
