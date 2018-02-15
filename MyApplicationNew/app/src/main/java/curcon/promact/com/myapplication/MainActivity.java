package curcon.promact.com.myapplication;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.text.InputType;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Currency Convertor");

    }

    void convertBDTtoothers() {
       try {
           EditText BDT = (EditText) findViewById(R.id.BDT);
           EditText INR = (EditText) findViewById(R.id.INR);
           EditText US = (EditText) findViewById(R.id.US);
           EditText malaysian = (EditText) findViewById(R.id.malaysian);
           EditText russian = (EditText) findViewById(R.id.russian);
           EditText hungarian = (EditText) findViewById(R.id.hungarian);
           EditText japan = (EditText) findViewById(R.id.japan);
           EditText france = (EditText) findViewById(R.id.france);

           BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
           INR.setInputType(InputType.TYPE_CLASS_NUMBER);
           US.setInputType(InputType.TYPE_CLASS_NUMBER);
           malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
           russian.setInputType(InputType.TYPE_CLASS_NUMBER);
           hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
           japan.setInputType(InputType.TYPE_CLASS_NUMBER);
           france.setInputType(InputType.TYPE_CLASS_NUMBER);


           double a = Integer.parseInt(BDT.getText().toString());
           double resultINR = a * 170.895;
           double resultUS = a * 2.6595;
           double result_malaysian = a * 10.4095;
           double result_russian = a * 152.6186;
           double result_hungarian = a * 666.9613;
           double result_japan = a * 289.5963;
           double result_france = a * 2.4839;

           INR.setText(String.valueOf(resultINR));
           US.setText(String.valueOf(resultUS));
           malaysian.setText(String.valueOf(result_malaysian));
           russian.setText(String.valueOf(result_russian));
           hungarian.setText(String.valueOf(result_hungarian));
           japan.setText(String.valueOf(result_japan));
           france.setText(String.valueOf(result_france));
       }
       catch(Exception e)
       {
           Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();
       }

    }
    void convertINRtoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(INR.getText().toString());
            double resultBDT = a * 0.0058;
            double resultUS = a * 0.0155;
            double result_malaysian = a * 0.0608;
            double result_russian = a * 0.8941;
            double result_hungarian = a * 3.9019;
            double result_japan = a * 1.6932;
            double result_france = a * 0.0145;

            BDT.setText(String.valueOf(resultBDT));
            US.setText(String.valueOf(resultUS));
            malaysian.setText(String.valueOf(result_malaysian));
            russian.setText(String.valueOf(result_russian));
            hungarian.setText(String.valueOf(result_hungarian));
            japan.setText(String.valueOf(result_japan));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }

    void convertUStoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(US.getText().toString());
            double resultBDT = a * 0.376;
            double resultINR = a * 64.2903;
            double result_malaysian = a * 3.9126;
            double result_russian = a * 57.4481;
            double result_hungarian = a * 250.8708;
            double result_japan = a * 108.9071;
            double result_france = a * 0.9339;

            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            malaysian.setText(String.valueOf(result_malaysian));
            russian.setText(String.valueOf(result_russian));
            hungarian.setText(String.valueOf(result_hungarian));
            japan.setText(String.valueOf(result_japan));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }


    void convertMalaysiantoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(malaysian.getText().toString());
            double resultBDT = a * 0.0961;
            double resultINR = a * 16.4344;
            double result_US = a * 0.2555;
            double result_russian = a * 14.6633;
            double result_hungarian = a * 64.1226;
            double result_japan = a * 27.8328;
            double result_france = a * 0.2388;


            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            US.setText(String.valueOf(result_US));
            russian.setText(String.valueOf(result_russian));
            hungarian.setText(String.valueOf(result_hungarian));
            japan.setText(String.valueOf(result_japan));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }

    void convertRussiantoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(russian.getText().toString());
            double resultBDT = a * 0.0065;
            double resultINR = a * 1.1197;
            double result_US = a * 0.01742;
            double result_malaysian = a * 0.0682;
            double result_hungarian = a * 4.3702;
            double result_japan = a * 1.8977;
            double result_france = a * 0.0163;

            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            US.setText(String.valueOf(result_US));
            malaysian.setText(String.valueOf(result_malaysian));
            hungarian.setText(String.valueOf(result_hungarian));
            japan.setText(String.valueOf(result_japan));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }

    void convertHungariantoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(hungarian.getText().toString());
            double resultBDT = a * 0.0014;
            double resultINR = a * 0.2561;
            double result_US = a * 0.0032;
            double result_malaysian = a * 0.0156;
            double result_russian = a * 0.2288;
            double result_japan = a * 0.4344;
            double result_france = a * 0.0037;


            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            US.setText(String.valueOf(result_US));
            malaysian.setText(String.valueOf(result_malaysian));
            russian.setText(String.valueOf(result_russian));
            japan.setText(String.valueOf(result_japan));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }



    void convertJapantoothers()
    {
        try {

            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);


            double a = Integer.parseInt(japan.getText().toString());
            double resultBDT = a * 0.0034;
            double resultINR = a * 0.587;
            double result_US = a * 0.0091;
            double result_malaysian = a * 0.0358;
            double result_russian = a * 0.5221;
            double result_hungarian = a * 2.2851;
            double result_france = a * 0.0085;

            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            US.setText(String.valueOf(result_US));
            malaysian.setText(String.valueOf(result_malaysian));
            russian.setText(String.valueOf(result_russian));
            hungarian.setText(String.valueOf(result_hungarian));
            france.setText(String.valueOf(result_france));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }
    }

    void convertFrancetoothers()
    {
        try {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR = (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);

            BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
            INR.setInputType(InputType.TYPE_CLASS_NUMBER);
            US.setInputType(InputType.TYPE_CLASS_NUMBER);
            malaysian.setInputType(InputType.TYPE_CLASS_NUMBER);
            russian.setInputType(InputType.TYPE_CLASS_NUMBER);
            hungarian.setInputType(InputType.TYPE_CLASS_NUMBER);
            japan.setInputType(InputType.TYPE_CLASS_NUMBER);
            france.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a = Integer.parseInt(france.getText().toString());
            double resultBDT = a * 0.4025;
            double resultINR = a * 68.7123;
            double result_US = a * 1.0706;
            double result_malaysian = a * 4.1875;
            double result_russian = a * 61.2213;
            double result_hungarian = a * 267.7758;
            double result_japan = a * 116.6162;

            BDT.setText(String.valueOf(resultBDT));
            INR.setText(String.valueOf(resultINR));
            US.setText(String.valueOf(result_US));
            malaysian.setText(String.valueOf(result_malaysian));
            russian.setText(String.valueOf(result_russian));
            hungarian.setText(String.valueOf(result_hungarian));
            japan.setText(String.valueOf(result_japan));
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Input a number near the button you are clicking", Toast.LENGTH_LONG).show();

        }

    }
    public void click(View view) {
        convertBDTtoothers();
        ImageButton b = (ImageButton) findViewById(R.id.submit);
        b.setEnabled(true);
    }
    public void click1(View view) {
        convertINRtoothers();
        ImageButton b1 = (ImageButton) findViewById(R.id.submit1);
        b1.setEnabled(true);
    }
    public void click2(View view) {
        convertUStoothers();
        ImageButton b2 = (ImageButton) findViewById(R.id.submit2);
        b2.setEnabled(true);
    }
    public void click3(View view) {
        convertMalaysiantoothers();
        ImageButton b3 = (ImageButton) findViewById(R.id.submit3);
        b3.setEnabled(true);
    }
    public void click4(View view) {
        convertRussiantoothers();
        ImageButton b4 = (ImageButton) findViewById(R.id.submit4);
        b4.setEnabled(true);
    }
    public void click5(View view)
    {
        convertHungariantoothers();
        ImageButton b5 = (ImageButton) findViewById(R.id.submit5);
        b5.setEnabled(true);
    }
    public void click6(View view)
    {
        convertJapantoothers();
        ImageButton b6 = (ImageButton) findViewById(R.id.submit6);
        b6.setEnabled(true);
    }
    public void click7(View view)
    {
        convertFrancetoothers();
        ImageButton b7 = (ImageButton) findViewById(R.id.submit7);
        b7.setEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        //return true;
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
           // return true;
       // }

        //return super.onOptionsItemSelected(item);


        int res_id= item.getItemId();
        if(res_id==R.id.action_settings)
        {
            EditText BDT = (EditText) findViewById(R.id.BDT);
            EditText INR =  (EditText) findViewById(R.id.INR);
            EditText US = (EditText) findViewById(R.id.US);
            EditText malaysian = (EditText) findViewById(R.id.malaysian);
            EditText russian = (EditText) findViewById(R.id.russian);
            EditText hungarian = (EditText) findViewById(R.id.hungarian);
            EditText japan = (EditText) findViewById(R.id.japan);
            EditText france = (EditText) findViewById(R.id.france);
            BDT.setText("");
            INR.setText("");
            US.setText("");
            malaysian.setText("");
            russian.setText("");
            hungarian.setText("");
            japan.setText("");
            france.setText("");

           // Toast.makeText(getApplicationContext(),"You select delete option", Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
