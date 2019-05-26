package com.example.fragmentpractice;

import android.app.Activity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.util.Log;

import com.example.fragmentpractice.dummy.DummyContent;

public class MainActivity extends Activity implements BuildingFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Log.v("potato", "Item detail is: \n" + item.details);
        FragmentManager fm = getFragmentManager();
        BlankFragment fragment = (BlankFragment) fm.findFragmentById(R.id.fragment2);
        fragment.updateDetails (item.details);
    }
}
