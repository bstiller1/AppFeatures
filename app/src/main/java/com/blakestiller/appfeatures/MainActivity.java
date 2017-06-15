package com.blakestiller.appfeatures;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView.setText(editText.getText() + " " +
                editText2.getText());
            }
        });
        final ViewSwitcher viewSwitcher = (ViewSwitcher)findViewById(R.id.viewSwitcher1);
        final View myFirstView = findViewById(R.id.view1);
        final View mySecondView = findViewById(R.id.view2);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (viewSwitcher.getCurrentView() != myFirstView){

                    viewSwitcher.showPrevious();
                } else if (viewSwitcher.getCurrentView() != mySecondView){

                    viewSwitcher.showNext();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (viewSwitcher.getCurrentView() != myFirstView){

                    viewSwitcher.showPrevious();
                } else if (viewSwitcher.getCurrentView() != mySecondView){

                    viewSwitcher.showNext();
                }
            }
        });
    }
}
