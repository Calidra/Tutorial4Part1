package my.tutorial.tutorial4part1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list =  findViewById(R.id.listView);
        String[] values = new String[] {
                "Supreme", "Seafood", "Italian",
                "Meat Lovers", "Ham and pineapple"};
        // use default layout simple_list_item_1
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        list.setAdapter(adapter);

        //short click
        list.setOnItemClickListener((parent, v, position, id) -> {
            String item = (String) list.getAdapter().getItem(position);
            Toast.makeText(getApplicationContext(), item + " selected", Toast.LENGTH_LONG).show();
        });

        //long click
        list.setOnItemLongClickListener((parent, v, position, id) -> {
            String item = (String) list.getAdapter().getItem(position);
            Toast.makeText(getApplicationContext(), item + "   	long clicked", Toast.LENGTH_LONG).show();
            return true;
        });
    }
}