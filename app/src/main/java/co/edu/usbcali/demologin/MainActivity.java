package co.edu.usbcali.demologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String user;
    private String password;

    private EditText edtUser;
    private EditText edtPassword;

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = getResources().getString(R.string.user);
        password = getResources().getString(R.string.password);

        edtUser = findViewById(R.id.edt_user);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUser = edtUser.getText().toString();
                String inputPassword = edtPassword.getText().toString();

                if (inputUser.matches("")) {
                    showToast("Ingresa un usuario");
                    return;
                }

                if (inputPassword.matches("")) {
                    showToast("Ingresa una contraseña");
                    return;
                }

                if (inputUser.equals(user) && inputPassword.equals(password)) {
                    Intent intentActivity2 = new Intent();
                    intentActivity2.putExtra("user", user);
                    startActivity(intentActivity2);
                } else {
                    showToast("Usuario o contraseña incorrecta");
                }
            }
        });
    }

    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
