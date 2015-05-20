import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import codylab.cwliu.tryrobo.BuildConfig;
import codylab.cwliu.tryrobo.MainActivity;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class RoboTest {

    @Test
    public void onCreate_shouldInflateLayout() throws Exception {
        final MainActivity activity = Robolectric.setupActivity(MainActivity.class);

//        final Menu menu = shadowOf(activity).getOptionsMenu();
//        assertThat(menu.findItem(R.id.item1).getTitle()).isEqualTo("Menu Item 1");
//        assertThat(menu.findItem(R.id.item2).getTitle()).isEqualTo("Menu Item 2");
    }

//    private ShadowActivity shadowOf(MainActivity activity) {
//    }

//    @Test
//    public void clickMenuItem_shouldDelegateClickToFragment() {
//        final MainActivity activity = Robolectric.setupActivity(MainActivity.class);
//
//        shadowOf(activity).clickMenuItem(R.id.item4);
//        assertThat(ShadowToast.getTextOfLatestToast()).isEqualTo("Clicked Item 4");
//    }
}