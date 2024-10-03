
package cat.boscdelacoma.uf4git;

/**
 *
 * @author guillemexposito
 */
public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    // Getters y setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

}

