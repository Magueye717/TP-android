package com.example.magueye.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TestTodolistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_todolist);

        final String[] classList = new String[]{"MGG", "Khoussa", "Thiere", "Ndiaté", "Rolland"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classList);

        ListView myClasslist = (ListView) findViewById(R.id.lv_ClassList);
        myClasslist.setAdapter(adapter);

        myClasslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TestTodolistActivity.this, "Ya ngui guiss: "+classList[position], Toast.LENGTH_LONG).show();
            }
        });
    }

}
