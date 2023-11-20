package activities;

import org.openqa.selenium.By;
import ui.Button;
import ui.TextBox;

public class TrackerFormScreen {

    public TextBox trackerForm = new TextBox(By.id("com.razeeman.util.simpletimetracker:id/etChangeRecordTypeName"));
    public Button submitBtn = new Button(By.id("com.razeeman.util.simpletimetracker:id/btnChangeRecordTypeSave"));
}
