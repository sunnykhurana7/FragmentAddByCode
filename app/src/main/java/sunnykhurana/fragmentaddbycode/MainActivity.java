package sunnykhurana.fragmentaddbycode;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import layout.First;
import layout.second;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the object of first

        First f = new First();
        second s = new second();

        FragmentManager fragmentManager = getSupportFragmentManager();

        //Transactionss start
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.activity_main, f, "");
        fragmentTransaction.add(R.id.activity_main, s, "");
        // transaction Commit
        fragmentTransaction.commit();
    }
}
