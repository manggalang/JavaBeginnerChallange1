package org.learn.java;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public  void onClickRegisterBtn (View view) {
        EditText firstNameField = findViewById(R.id.inputFirstName);
        EditText lastNameField = findViewById(R.id.inputLastName);
        EditText emailField = findViewById(R.id.inputEmail);

        TextView firstName = findViewById(R.id.txtFirstName);
        TextView lastName = findViewById(R.id.txtLastName);
        TextView email = findViewById(R.id.txtEmail);
        firstName.setText("First Name: " + firstNameField.getText().toString());
        lastName.setText("Last Name: " + lastNameField.getText().toString());
        email.setText("Email: " + emailField.getText().toString());
    }
}