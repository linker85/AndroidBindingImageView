package samples.com.imagebinding2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import samples.com.imagebinding2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Status mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mUser = new Status("http://cdn.meme.am/instances/60677654.jpg");

        binding.setStatus(mUser);
    }
}
