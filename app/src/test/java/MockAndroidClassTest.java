import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import codylab.cwliu.tryrobo.MainActivity;
import codylab.cwliu.tryrobo.R;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockAndroidClassTest {

    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString(){
        when(mMockContext.getString(R.string.hello_world)).thenReturn(FAKE_STRING);

        MainActivity activity = new MainActivity();
        String result = activity.getHelloWorldString(mMockContext);

        assertThat(result, is(FAKE_STRING));
    }
}


