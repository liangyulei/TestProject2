package tests;

/**
 * Created by llei on 4/19/2016.
 */
import com.example.llei.testproject.MainActivity;
import com.example.llei.testproject.R;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);

    }
}
