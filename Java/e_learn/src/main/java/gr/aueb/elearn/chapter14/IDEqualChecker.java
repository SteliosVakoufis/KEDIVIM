package gr.aueb.elearn.chapter14;

@FunctionalInterface
public interface IDEqualChecker {
    /*
     * boolean functions are called predicates
     */
    boolean checkEqualId(Student student);
}
