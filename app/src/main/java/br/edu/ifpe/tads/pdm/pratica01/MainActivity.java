package br.edu.ifpe.tads.pdm.pratica01;

import static android.content.ClipData.newIntent;

import android.content.Intent;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "Pratica01.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {

        Intent intent =new Intent(this,DisplayMessageActivity.class);

        EditText editText =findViewById(R.id.edit_message);
        String message =editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
            switch (item.getItemId()) {
                case R.id.action_search:
                    openSearch();
                    return true;
                case R.id.action_settings:
                    openSettings();
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

    private void openSearch() {
        Toast.makeText(this, "Não implementada.", Toast.LENGTH_SHORT).show();
    }

    private void openSettings() {
        Toast.makeText(this, "Não implementada.", Toast.LENGTH_SHORT).show();
    }



}