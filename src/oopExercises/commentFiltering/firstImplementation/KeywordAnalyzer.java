package oopExercises.commentFiltering.firstImplementation;

public abstract class KeywordAnalyzer {
    public abstract String[] getKeywords();
    public abstract Label getLabel(String text);
}
