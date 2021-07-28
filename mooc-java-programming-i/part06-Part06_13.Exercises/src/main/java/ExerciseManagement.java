
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> list;

    public ExerciseManagement() {
        this.list = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();

        for (Exercise name : this.list) {
            list.add(name.getName());
        }

        return list;
    }

    public void add(String exercise) {
        this.list.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise) {
        for (Exercise ex : this.list) {
            if (ex.getName().equals(exercise)) {
                ex.setCompleted(true);
            }
        }
    }

    public boolean isCompleted(String exercise) {
        for (Exercise ex : this.list) {
            if (ex.getName().equals(exercise)) {
                return ex.isCompleted();
            }
        }

        return false;
    }
    
    public void removeExercise(String exercise) {
        
        int indexToRemove = 0;
        
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getName().equals(exercise)) {
                indexToRemove = i;
                break;
            }
        }
        
        this.list.remove(indexToRemove);
    }
}
