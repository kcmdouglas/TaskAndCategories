import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    private String mDescription;
    private LocalDateTime mCreatedAt;
    private boolean mCompleted;
    // private int mId;

    public Task(String description) {
        mDescription = description;
        mCreatedAt = LocalDateTime.now();
        mCompleted = false;
        // instances.add(this);
        // mId = instances.size();
    }

    public String getDescription() {
        return mDescription;
    }

    public LocalDateTime getCreatedAt() {
      return mCreatedAt;
    }

    public boolean isCompleted() {
      return mCompleted;
    }
    // 
    // public int getId() {
    //   return mId;
    // }

}
