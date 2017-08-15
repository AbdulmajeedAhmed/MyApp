package com.abdulmajeed_ahmed.myapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.abdulmajeed_ahmed.myapp.data.model.ApiUtils;
import com.abdulmajeed_ahmed.myapp.data.model.remote_service.SOService;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONObject;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private CoordinatorLayout main_content;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private SOService mService; // for Retrofit
    private TextView jsonTextView;
    private Button delete_json_button;
    String jsonString;
    private ViewPager mViewPager;
    private DatabaseReference mDatabaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mService = ApiUtils.getSOService(); // for Retrofit

        // get the root layout.
        main_content=(CoordinatorLayout)findViewById(R.id.main_content);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Snackbar.make(main_content,R.string.about_message,Snackbar.LENGTH_LONG).setAction("Action", null).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    boolean isRunning;

    /**
     *
     * The enqueue() function send the request and notifies tha app when there is a result,
     * and this is handled in background thread so thet the main UI Thread won't be blocked.
     * @param view
     */
    public void getJSON(View view) {
        jsonTextView= (TextView)findViewById(R.id.json_responce_txt);
        delete_json_button =(Button) findViewById(R.id.delete_json_button);
        workOnThread();
    }

    private void workOnThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                mService.listRepos("http://api.fixer.io/latest").enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            final JSONObject jsonResponse = new JSONObject(response.body().string());
                            jsonString= jsonResponse.toString();
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    jsonTextView.setText(jsonString); // display the json
                                    delete_json_button.setVisibility(View.VISIBLE); //display the button to delete.
                                }
                            });
                        }catch (Exception e){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Toast.makeText(getApplicationContext(), R.string.error_try_later,Toast.LENGTH_LONG).show();
                                }
                            });

                        }
                    }
                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        }).start();
    }

    public void clearJsonResponse(View view) {
        jsonTextView.setText("");
        view.setVisibility(View.INVISIBLE);
    }

    /**
     * Saves the json responce to the database.
     * @param view
     */
    public void uploadToFirebase(View view) {
        mDatabaseReference = FirebaseDatabase.getInstance().getReference(); // firebase database cinnection..
        if(jsonString ==null) {
            Snackbar.make(main_content, R.string.download_json_first, Snackbar.LENGTH_LONG).setAction("Action", null).show();
            return;
        }
        try{
            mDatabaseReference.child("JSON").push().setValue(jsonString).isSuccessful();
            Snackbar.make(main_content, R.string.json_uploaded, Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), R.string.error_try_later, Toast.LENGTH_LONG).show();
           }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) { // my fragments are here..
           switch (position){
               case 0:
                   return new JsonTab();
               case 1:
                   return new MapTab();
           }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.json);
                case 1:
                    return getString(R.string.map);
            }
            return null;
        }
    }
}
