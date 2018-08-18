package nikolov.com.todoandroidapp;

import android.app.Activity;
import android.os.Bundle;

import nikolov.com.todoandroidapp.utils.Navigator;

public class HomeActivity extends Activity implements Navigator{
    private TodoListFragment mTodoListFragment;
    private TodoDetailsFragment mTodoDetailsFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }

    @Override
    public void navigateWith(String todoName) {

    }
}
