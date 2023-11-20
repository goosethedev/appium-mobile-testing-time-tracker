package activities;

import org.openqa.selenium.By;
import ui.Button;
import ui.Control;
import ui.Label;

public class TrackersScreen {

    public Button newTrackerBtn = new Button(By.xpath("//android.widget.TextView[@text=\"Add\"]"));

    public boolean isTrackerCreated(String name) {
        Label tracker = new Label(By.xpath("//android.widget.TextView[@text=\""+ name +"\"]"));
        System.out.println(tracker);
        return tracker.isControlDisplayed();
    }
}
