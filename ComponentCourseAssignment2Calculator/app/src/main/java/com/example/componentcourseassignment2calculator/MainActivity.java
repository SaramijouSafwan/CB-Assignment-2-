package com.example.componentcourseassignment2calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.resultText);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        registerForContextMenu(result);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        EditText num1 = (EditText)findViewById(R.id.numText1);
        EditText num2 = (EditText)findViewById(R.id.numText2);
        switch (item.getItemId()) {
            case R.id.add:
                float add = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(add));
                break;
            case R.id.sub:
                float sub = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(sub));
                break;
            case R.id.div:
                float div = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(div));
                break;
            case R.id.mul:
                float mul = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(mul));
                break;
            case R.id.mul3:
                float mul3 = Float.parseFloat(result.getText().toString()) * 3;
                result.setText(String.valueOf(mul3));
                break;
            case R.id.mul4:
                float mul4 = Float.parseFloat(result.getText().toString()) * 4;
                result.setText(String.valueOf(mul4));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_contex, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        EditText num1 = (EditText)findViewById(R.id.numText1);
        EditText num2 = (EditText)findViewById(R.id.numText2);
        switch (item.getItemId()) {
            case R.id.add:
                float add = Float.parseFloat(num1.getText().toString()) + Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(add));
                break;
            case R.id.sub:
                float sub = Float.parseFloat(num1.getText().toString()) - Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(sub));
                break;
            case R.id.div:
                float div = Float.parseFloat(num1.getText().toString()) / Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(div));
                break;
            case R.id.mul:
                float mul = Float.parseFloat(num1.getText().toString()) * Float.parseFloat(num2.getText().toString());
                result.setText(String.valueOf(mul));
                break;
        }
        return super.onContextItemSelected(item);
    }
}
