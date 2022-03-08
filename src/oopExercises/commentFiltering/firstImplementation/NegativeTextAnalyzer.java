package oopExercises.commentFiltering.firstImplementation;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] negative = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {
        return getLabel(text);
    }

    @Override
    public String[] getKeywords() {
        return negative;
    }

    @Override
    public Label getLabel(String text) {
        for(String emoticon : getKeywords()) {
            if(text.contains(emoticon)) return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}
