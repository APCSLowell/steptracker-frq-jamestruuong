import java.util.ArrayList;
public class StepTracker
{
private int minSteps;
  private int actDays;
  private int totalSteps;
  private int totDays;

  // Constructor to initialize minSteps
  public StepTracker(int steps) {
    minSteps = steps;
    actDays = 0;
    totalSteps = 0;
    totDays = 0;
  }

  // Method to add steps for a day
  public void addDailySteps(int steps) {
    totalSteps += steps;
    totDays++;
    if (steps >= minSteps) {
      actDays++;
    }
  }

  // Returns number of active days
  public int activeDays() {
    return actDays;
  }

  // Returns average steps per day
 public double averageSteps() {
  if (totDays == 0) return 0.0;
  return (double) totalSteps / totDays;
}
 }
