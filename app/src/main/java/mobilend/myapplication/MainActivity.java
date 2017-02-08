package mobilend.myapplication;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView HomePageListView;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomePageListView = (ListView) findViewById(R.id.home_page_list);

        String[] listOptions = new String [] {"Life", "Work", "Business", "Government"};
        ArrayList<String> homeList = new ArrayList<String>();
        homeList.addAll( Arrays.asList(listOptions) );
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, homeList);

        HomePageListView.setAdapter( listAdapter );
    }
}

