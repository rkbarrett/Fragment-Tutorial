package com.msi.fragmentsession;

import android.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends ActionBarActivity
    // <MAC> Implement UserListFragmentListener
    implements UserListFragment.UserListFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // <MAC> - Instantiate the UserListFragment
        UserListFragment userListFragment = new UserListFragment();

        // <MAC> - Get the FragmentManager and add  UserListFragment
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.mainContainer, userListFragment)
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // <MAC> - Realize the interface method from UserListFragmentListener
    public void onUserSelected(UserInfo userInfo) {
        /* <MAC-HW> Do something interesting here. Suggestions (easiest to hardest):
        1. Make a Toast!
        2. Create a public method in the UserListFragment to pass back data. You will need to
        assign your UserListFragment instance to a class scoped attribute so you can get to it.
        3. Launch another Fragment (hint use FragmentManager and "replace" instead of "add" your
        new Fragment)! Do something interesting in that Fragment.
        4. Launch another Fragment. Get some data from the User (hint EditText with a Button).
        Pass that data back to the Activity and have the Activity pass it to the other Fragment.
         */
    }
}
