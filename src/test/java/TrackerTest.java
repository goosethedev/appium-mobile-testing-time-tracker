import activities.TrackerFormScreen;
import activities.TrackersScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Session;

public class TrackerTest {
    TrackersScreen trackersScreen = new TrackersScreen();
    TrackerFormScreen trackerFormScreen = new TrackerFormScreen();

    @Test
    public void testCreateNewTracker() {
        trackersScreen.newTrackerBtn.click();
        trackerFormScreen.trackerForm.setText("Test tracker");
        Session.getSession().getDevice().navigate().back();
        trackerFormScreen.submitBtn.click();

        Assertions.assertTrue(trackersScreen.isTrackerCreated("Test tracker"));
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }
}
