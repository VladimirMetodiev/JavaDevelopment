package oopExercises.commentFiltering.firstImplementation;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        return getLabel(text);
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel(String text) {
        for(String keyword : getKeywords()) {
            if(text.contains(keyword)) return Label.SPAM;
        }
        return Label.OK;
    }
}
