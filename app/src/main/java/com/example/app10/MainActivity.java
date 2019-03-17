package com.example.app10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static SeekBar seekBar;
private static TextView text_seek, text_sami;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar_Method();

    }

public void SeekBar_Method(){
    seekBar=(SeekBar)findViewById(R.id.seekBar);
    text_seek=(TextView)findViewById(R.id.textView_seekbar);
    text_sami=(TextView)findViewById(R.id.textView_Sami);
    text_seek.setText("Covered: "+ seekBar.getProgress()+" / "+seekBar.getMax());

    seekBar.setOnSeekBarChangeListener(
            new SeekBar.OnSeekBarChangeListener() {
                int progress_value;
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    progress_value=progress;
                    text_seek.setText("Covered: "+ progress +" / "+seekBar.getMax());
                    text_sami.setTextSize(progress*2);
                    Toast.makeText(MainActivity.this,"SeekBar in Progress", Toast.LENGTH_LONG).show();

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(MainActivity.this,"SeekBar in StartTrackingTouch", Toast.LENGTH_LONG).show();

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    text_seek.setText("Covered: "+ progress_value +" / "+seekBar.getMax());
                    Toast.makeText(MainActivity.this,"SeekBar in StopTrackingTouch", Toast.LENGTH_LONG).show();




                }
            }
    );


}
}
