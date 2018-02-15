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

    void convertBDTtoINR() {
        EditText BDT = (EditText) findViewById(R.id.BDT);
        BDT.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText res = (EditText) findViewById(R.id.res);
        EditText res1 = (EditText) findViewById(R.id.res1);
        EditText res2 = (EditText) findViewById(R.id.res2);
        EditText res3 = (EditText) findViewById(R.id.res3);
        EditText res4 = (EditText) findViewById(R.id.res4);
        EditText res5 = (EditText) findViewById(R.id.res5);
        EditText res6 = (EditText) findViewById(R.id.res6);

        res.setInputType(InputType.TYPE_CLASS_NUMBER);
        res1.setInputType(InputType.TYPE_CLASS_NUMBER);
        res2.setInputType(InputType.TYPE_CLASS_NUMBER);
        res3.setInputType(InputType.TYPE_CLASS_NUMBER);
        res4.setInputType(InputType.TYPE_CLASS_NUMBER);
        res5.setInputType(InputType.TYPE_CLASS_NUMBER);
        res6.setInputType(InputType.TYPE_CLASS_NUMBER);
        double a = Integer.parseInt(BDT.getText().toString());
        double result = a * 170.895;
        double result1= a* 2.6595;
        double result2= a* 10.4095;
        double result3= a* 152.6186;
        double result4= a* 666.9613;
        double result5= a* 289.5963;
        double result6= a* 2.4839;

        res.setText(String.valueOf(result));
        res1.setText(String.valueOf(result1));
        res2.setText(String.valueOf(result2));
        res3.setText(String.valueOf(result3));
        res4.setText(String.valueOf(result4));
        res5.setText(String.valueOf(result5));
        res6.setText(String.valueOf(result6));

    }

    public void click(View view)
    {
        convertBDTtoINR();
        ImageButton b1 = (ImageButton) findViewById(R.id.submit);
        b1.setEnabled(true);
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
            EditText res = (EditText) findViewById(R.id.res);
            EditText res1 = (EditText) findViewById(R.id.res1);
            EditText res2 = (EditText) findViewById(R.id.res2);
            EditText res3 = (EditText) findViewById(R.id.res3);
            EditText res4 = (EditText) findViewById(R.id.res4);
            EditText res5 = (EditText) findViewById(R.id.res5);
            EditText res6 = (EditText) findViewById(R.id.res6);
            BDT.setText("");
            res.setText("");
            res1.setText("");
            res2.setText("");
            res3.setText("");
            res4.setText("");
            res5.setText("");
            res6.setText("");

           // Toast.makeText(getApplicationContext(),"You select delete option", Toast.LENGTH_LONG).show();
        }
        return true;
    }
}
