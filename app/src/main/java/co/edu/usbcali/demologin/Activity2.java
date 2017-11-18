package co.edu.usbcali.demologin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by usuario on 18/11/17.
 */

public class Activity2 extends AppCompatActivity {

    private TextView txtUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        txtUser = findViewById(R.id.logged_user);

        if(getIntent().getSerializableExtra("user").toString() != null) {
            txtUser.setText(getIntent().getSerializableExtra("user").toString());
        }
    }
}
