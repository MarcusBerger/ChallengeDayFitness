package com.marcusberger.appmotivation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String array[] = new String[35];
    int posicao = 0;

    public void treinosPadroes(){

        array[0] = "20 Push ups\n100 Squats";
        array[1] = "25 Push Ups\n200 Squats" ;
        array[2] = "30 Push ups\n220 Squats";

        array[3] = "Congratulations\nRest Day";

        array[4] = "40 Push ups\n250 Squats";
        array[5] = "45 Push ups\n270 Squats";
        array[6] = "50 Push ups\n290 Squats";

        array[7] = "Congratulations\nRest Day";

        array[8] = "60 Push ups\n300 Squats";
        array[9] = "65 Push ups\n325 Squats";
        array[10] = "70 Push ups\n350 Squats";

        array[11] = "Congratulations\nRest Day";

        array[12] = "70 Push ups\n350 Squats";
        array[13] = "70 Push ups\n350 Squats";
        array[14] = "70 Push ups\n350 Squats";

        array[15] = "Congratulations\nRest Day";

        array[16] = "80 Push ups\n375 Squats";
        array[17] = "90 Push ups\n400 Squats";
        array[18] = "100 Push ups\n425 Squats";

        array[19] = "Congratulations\nRest Day";

        array[20] = "110 Push ups\n385 Squats";
        array[21] = "115 Push ups\n410 Squats";
        array[22] = "125 Push ups\n435 Squats";

        array[23] = "Congratulations\nRest Day";

        array[24] = "130 Push ups\n460 Squats";
        array[25] = "135 Push ups\n485 Squats";
        array[26] = "140 Push ups\n510 Squats";

        array[27] = "Congratulations\nRest Day";

        array[28] = "155 Push ups\n535 Squats";
        array[29] = "165 Push ups\n585 Squats";
        array[30] = "180 Push ups\n635 Squats";

        array[31] = "Congratulations\nRest Day ";

        array[32] = "180 Push ups\n635 Squats";
        array[33] = "190 Push ups\n685 Squats";
        array[34] = "200 Push ups\n735 Squats";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        treinosPadroes();
        addClickLinester();
    }

     public void addClickLinester(){

         Button botaoGerarTreino = (Button) findViewById(R.id.gerar);
         botaoGerarTreino.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 TextView frase = (TextView) findViewById(R.id.treinoDisplay);
                 frase.setText(array[posicao]);

                 posicao++;
                 if (posicao == array.length) {
                     posicao = 0;
                 }
                 mudaDia();
             }
         });
    }

    public void mudaDia(){
        TextView cDia = (TextView) findViewById(R.id.contarDias);
        int nDia = Integer.parseInt(cDia.getText().toString()) ;
        nDia++;
        cDia.setText(Integer.toString(nDia));
        
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
