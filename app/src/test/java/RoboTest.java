import android.view.Menu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import codylab.cwliu.tryrobo.BuildConfig;
import codylab.cwliu.tryrobo.MainActivity;
import codylab.cwliu.tryrobo.R;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, emulateSdk = 18, reportSdk = 18, manifest = "./src/main/AndroidManifest.xml")
public class RoboTest {

    @Test
    public void onCreate_shouldInflateLayout_1() throws Exception {
        final MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        final Menu menu = shadowOf(activity).getOptionsMenu();
        assertThat(menu.findItem(R.id.item1).getTitle().toString(), is("Menu Item 1"));
    }

    @Test
    public void onCreate_shouldInflateLayout_2() throws Exception {
        final MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        final Menu menu = shadowOf(activity).getOptionsMenu();
        assertThat(menu.findItem(R.id.item2).getTitle().toString(), is("Menu Item 3"));
    }

}