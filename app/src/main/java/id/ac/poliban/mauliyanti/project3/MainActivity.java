package id.ac.poliban.mauliyanti.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvItem;
private String[] namanegara = new String[]{
        "Indonesia", "Malaysia", "Singapore",
        "Italia", "Inggris", "Belanda",
            "Argentina","Chile","Mesir","Uganda"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");
lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity. this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);
lvItem.setAdapter(adapter);

lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
    }
});
    }
}

