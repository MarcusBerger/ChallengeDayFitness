package com.marcusberger.appmotivation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    String array[] = new String[40];
    int posicao = 0;

    public void treinosPadroes(){

        array[0] = "20 Push ups";
        array[1] = "100 Squats";
        array[2] = "25 Push ups";
        array[3] = "200 Squats";
        array[4] = "30 Push ups";
        array[5] = "220 Squats";
        array[6] = "35 Push ups";
        array[7] = "250 Squats";
        array[8] = "40 Push ups";
        array[9] = "270 Squats";
        array[10] = "45 Push ups";
        array[11] = "290 Squats";
        array[12] = "50 Push ups";
        array[13] = "300 Squats";
        array[14] = "55 Push ups";
        array[15] = "325 Squats";
        array[16] = "60 Push ups";
        array[17] = "350 Squats";
        array[18] = "65 Push ups";
        array[19] = "375 Squats";
        array[20] = "70 Push ups";
        array[21] = "400 Squats";
        array[22] = "75 Push ups";
        array[23] = "425 Squats";
        array[24] = "80 Push ups";
        array[25] = "385 Squats";
        array[26] = "85 Push ups";
        array[27] = "410 Squats";
        array[28] = "90 Push ups";
        array[29] = "435 Squats";
        array[30] = "95 Push ups";
        array[31] = "460 Squats";
        array[32] = "100 Push ups";
        array[33] = "485 Squats";
        array[34] = "105 Push ups";
        array[35] = "510 Squats";
        array[36] = "110 Push ups";
        array[37] = "535 Squats";
        array[38] = "115 Push ups";
        array[39] = "585 Squats";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        treinosPadroes();
        addClickLinester();

    }

     public void addClickLinester(){

         Button botaoGerar = (Button) findViewById(R.id.gerar);
         botaoGerar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView frase = (TextView)findViewById(R.id.treinoDisplay);
                 frase.setText(array[posicao]);

                 posicao++;
                 if (posicao == array.length) {
                     posicao = 0;
                 }
             }
         });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
