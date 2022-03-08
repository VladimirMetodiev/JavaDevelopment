package oopExercises.running;

public class Running {
    private int discipline = 0;
    private double result = 0.0;
    private double[] times = {9.58, 19.19, 43.03, 100.91, 131.96};
    private String[] runners = {"Usain Bolt", "Usain Bolt", "Wayde van Niekerk", "David Rudisha", "Noah Ngeny"};
    private String[] countries = {"Jamaica", "Jamaica", "South Africa", "Kenya", "Kenya"};
    private int[] years = {2009, 2009, 2016, 2012, 1999};
    static final String RECORD = "You set a new world record!";

    public Running() {
    }

    public Running (int discipline, double result) {
        this.discipline = discipline;
        this.result = result;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public void setResult(double result) {
        this.result = result;
    }

    protected void announceTheResult(){
        DetermineResult obj = new DetermineResult();
        System.out.println(obj.compareToRecord(discipline, result));
    }

    class DetermineResult {
        String compareToRecord(int d, double r){
            switch (d){
                case 100: {
                    if (r >= times[0]) return String.format("Your time is %.2f sec.%nThe record %.2f sec, belongs to %s, from %s, since %d.", result, times[0], runners[0], countries[0], years[0]);
                    else return Running.RECORD;
                }
                case 200: {
                    if (r >= times[1]) return String.format("Your time is %.2f sec.%nThe record %.2f sec, belongs to %s, from %s, since %d.", result, times[1], runners[1], countries[1], years[1]);
                    else return Running.RECORD;
                }
                case 400: {
                    if (r >= times[2]) return String.format("Your time is %.2f sec.%nThe record %.2f sec, belongs to %s, from %s, since %d.", result, times[2], runners[2], countries[2], years[2]);
                    else return Running.RECORD;
                }
                case 800: {
                    if (r >= times[3]) return String.format("Your time is %.2f sec.%nThe record %.2f sec, belongs to %s, from %s, since %d.", result, times[3], runners[3], countries[3], years[3]);
                    else return Running.RECORD;
                }
                case 1000: {
                    if (r >= times[4]) return String.format("Your time is %.2f sec.%nThe record %.2f sec, belongs to %s, from %s, since %d.", result, times[4], runners[4], countries[4], years[4]);
                    else return Running.RECORD;
                }
                default: return "Wrong sport discipline!";
            }
        }
    }
}
