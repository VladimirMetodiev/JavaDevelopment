package oopExercises.commentFiltering.secondImplementation;

/**
 * @author Vladimir Metodiev
 * @version 2.1
 */

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] negative = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    public String[] getKeywords() {
        return negative;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
