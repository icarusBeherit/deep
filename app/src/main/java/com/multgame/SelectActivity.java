package com.multgame;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;


public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    AlertDialog alertDialog1;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;
    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    public String TAG = "sistema";
    String Myprefs = "escolhas";
    SharedPreferences.Editor editor;
    String item_selecionado;
    SharedPreferences prefs;
    Button submit;
    Button clear;
    String instituicao;
    String valor_atual;
    EditText valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        editor = getSharedPreferences(Myprefs, MODE_PRIVATE).edit();
        prefs = getSharedPreferences(Myprefs, MODE_PRIVATE);

        instituicao = prefs.getString("instituicao", "");
        valor_atual = prefs.getString("item", "");
        valor= findViewById(R.id.valor);

        getSupportActionBar().setTitle("Doação");
        getSupportActionBar().setSubtitle(instituicao);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit = findViewById(R.id.submit);
        clear = findViewById(R.id.clear);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitData();

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearAllSharedPreferences();
            }
        });

        //Imageviews
        imageView1= findViewById(R.id.a1);
       imageView2= findViewById(R.id.a2);
       imageView3= findViewById(R.id.a3);
       imageView4= findViewById(R.id.a4);
       imageView5= findViewById(R.id.a5);
       imageView6= findViewById(R.id.b1);
       imageView7= findViewById(R.id.b2);
       imageView8= findViewById(R.id.b3);
       imageView9= findViewById(R.id.b4);
       imageView10= findViewById(R.id.c1);
       imageView11= findViewById(R.id.c2);
       imageView12= findViewById(R.id.c3);
       imageView13= findViewById(R.id.c4);
       imageView14= findViewById(R.id.d1);
       imageView15= findViewById(R.id.d2);
       imageView16= findViewById(R.id.d3);
       imageView17= findViewById(R.id.d4);
       imageView18= findViewById(R.id.e1);
       imageView19= findViewById(R.id.e2);
       imageView20= findViewById(R.id.e3);
       imageView21= findViewById(R.id.e4);
       //

       //Listeners
       imageView1.setOnClickListener(this);
       imageView2.setOnClickListener(this);
       imageView3.setOnClickListener(this);
       imageView4.setOnClickListener(this);
       imageView5.setOnClickListener(this);
       imageView6.setOnClickListener(this);
       imageView7.setOnClickListener(this);
       imageView8.setOnClickListener(this);
       imageView9.setOnClickListener(this);
       imageView10.setOnClickListener(this);
       imageView11.setOnClickListener(this);
       imageView12.setOnClickListener(this);
       imageView13.setOnClickListener(this);
       imageView14.setOnClickListener(this);
       imageView15.setOnClickListener(this);
       imageView16.setOnClickListener(this);
       imageView17.setOnClickListener(this);
       imageView18.setOnClickListener(this);
       imageView19.setOnClickListener(this);
       imageView20.setOnClickListener(this);
       imageView21.setOnClickListener(this);
       //

        checkSharedPreferences();
        checkRow1();
        checkRow2();


    }

    private void clearAllSharedPreferences() {
        SharedPreferences settings = getSharedPreferences(Myprefs, Context.MODE_PRIVATE);
        settings.edit().clear().apply();
        checkSharedPreferences();

        Intent i = new Intent(getBaseContext(), SelectActivity.class);
        finish();
        startActivity(i);
    }

    public void submitData(){
        SharedPreferences settings = getSharedPreferences(Myprefs, Context.MODE_PRIVATE);
        settings.edit().clear().apply();
        checkSharedPreferences();

        Intent i = new Intent(getBaseContext(), PrintActivity.class);
        finish();
        startActivity(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.change:
                exibirInstituicoes();
            return true;

            default:

            return super.onOptionsItemSelected(item);
        }
    }

    private void checkSharedPreferences() {

//        final String imagem_escolhida = getResources().getResourceEntryName(image_id);

        String a1 = prefs.getString("a1", "");
        String a2 = prefs.getString("a2", "");
        String a3 = prefs.getString("a3", "");
        String a4 = prefs.getString("a4", "");
        String a5 = prefs.getString("a5", "");

        String b1 = prefs.getString("b1", "");
        String b2 = prefs.getString("b2", "");
        String b3 = prefs.getString("b3", "");
        String b4 = prefs.getString("b4", "");

        String c1 = prefs.getString("c1", "");
        String c2 = prefs.getString("c2", "");
        String c3 = prefs.getString("c3", "");
        String c4 = prefs.getString("c4", "");

        String d1 = prefs.getString("d1", "");
        String d2 = prefs.getString("d2", "");
        String d3 = prefs.getString("d3", "");
        String d4 = prefs.getString("d4", "");

        String e1 = prefs.getString("e1", "");
        String e2 = prefs.getString("e2", "");
        String e3 = prefs.getString("e3", "");
        String e4 = prefs.getString("e4", "");

        if (!a1.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.a1);
            setaDrawable(mv,a1);
        }

        if (!a2.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.a2);
            setaDrawable(mv,a2);
        }

        if (!a3.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.a3);
            setaDrawable(mv,a3);
        }

        if (!a4.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.a4);
            setaDrawable(mv,a4);
        }

        if (!a5.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.a5);
            setaDrawable(mv,a5);
        }

        if (!b1.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.b1);
            setaDrawable(mv,b1);
        }

        if (!b2.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.b2);
            setaDrawable(mv,b2);
        }

        if (!b3.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.b3);
            setaDrawable(mv,b3);
        }

        if (!b4.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.b4);
            setaDrawable(mv,b4);
        }

        if (!c1.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.c1);
            setaDrawable(mv,c1);
        }

        if (!c2.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.c2);
            setaDrawable(mv,c2);
        }

        if (!c3.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.c3);
            setaDrawable(mv,c3);
        }

        if (!c4.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.c4);
            setaDrawable(mv,c4);
        }

        if (!d1.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.d1);
            setaDrawable(mv,d1);
        }

        if (!d2.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.d2);
            setaDrawable(mv,d2);
        }

        if (!d3.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.d3);
            setaDrawable(mv,d3);
        }

        if (!d4.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.d4);
            setaDrawable(mv,d4);
        }

        if (!e1.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.e1);
            setaDrawable(mv,e1);
        }

        if (!e2.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.e2);
            setaDrawable(mv,e2);
        }

        if (!e3.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.e3);
            setaDrawable(mv,e3);
        }

        if (!e4.equals("")){
            ImageView mv = (ImageView) findViewById(R.id.e4);
            setaDrawable(mv,e4);
        }


    }

    private int setaDrawable(ImageView imageView,String check) {

        switch (check){
            case "0":
                imageView.setImageResource(R.drawable.argentina0);
            break;

            case "1":
                imageView.setImageResource(R.drawable.brasil1);
            break;

            case "2":
                imageView.setImageResource(R.drawable.chile2);
            break;

            case "3":
                imageView.setImageResource(R.drawable.uruguai3);
            break;

            case "4":
                imageView.setImageResource(R.drawable.colombia4);
            break;

            case "5":
                imageView.setImageResource(R.drawable.italia5);
            break;

            case "6":
                imageView.setImageResource(R.drawable.inglaterra6);
            break;

            case "7":
                imageView.setImageResource(R.drawable.alemanha7);
            break;

            case "8":
                imageView.setImageResource(R.drawable.espanha8);
            break;

            case "9":
                imageView.setImageResource(R.drawable.franca9);
            break;
        }
        return 0;
    }

    public void exibirDetalhes(final int image_id){

        final String imagem_escolhida = getResources().getResourceEntryName(image_id);

        String item_salvo = prefs.getString(imagem_escolhida, "");

        final String [] items = new String[] {" Argentina "," Brasil "," Chile "," Uruguai "," Colombia "," Itália "," Inglaterra "," Alemanha "," Espanha "," França "};
        final Integer[] icons = new Integer[] {R.drawable.argentina0, R.drawable.brasil1,R.drawable.chile2,R.drawable.uruguai3,R.drawable.colombia4,R.drawable.italia5,R.drawable.inglaterra6,R.drawable.alemanha7,R.drawable.espanha8,R.drawable.franca9};
        ListAdapter adapter = new ArrayAdapterWithIcon(this, items, icons);

        AlertDialog.Builder builder = new AlertDialog.Builder(SelectActivity.this);
        builder.setTitle("Selecione uma opção");
        builder.setSingleChoiceItems(adapter, -1, new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        ImageView mv = (ImageView) findViewById(image_id);
                        mv.setImageResource(R.drawable.argentina0);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 1:
                        ImageView mv1 = (ImageView) findViewById(image_id);
                        mv1.setImageResource(R.drawable.brasil1);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 2:
                        ImageView mv2 = (ImageView) findViewById(image_id);
                        mv2.setImageResource(R.drawable.chile2);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 3:
                        ImageView mv3 = (ImageView) findViewById(image_id);
                        mv3.setImageResource(R.drawable.uruguai3);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 4:
                        ImageView mv4 = (ImageView) findViewById(image_id);
                        mv4.setImageResource(R.drawable.colombia4);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 5:
                        ImageView mv5 = (ImageView) findViewById(image_id);
                        mv5.setImageResource(R.drawable.italia5);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 6:
                        ImageView mv6 = (ImageView) findViewById(image_id);
                        mv6.setImageResource(R.drawable.inglaterra6);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 7:
                        ImageView mv7 = (ImageView) findViewById(image_id);
                        mv7.setImageResource(R.drawable.alemanha7);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 8:
                        ImageView mv8 = (ImageView) findViewById(image_id);
                        mv8.setImageResource(R.drawable.espanha8);
                        item_selecionado = String.valueOf(item);
                        break;
                    case 9:
                        ImageView mv9 = (ImageView) findViewById(image_id);
                        mv9.setImageResource(R.drawable.franca9);
                        item_selecionado = String.valueOf(item);
                        break;
                }
                alertDialog1.dismiss();
                editor.putString(imagem_escolhida, item_selecionado);
                editor.apply();
                checkRow1();
                checkRow2();

            }
        });
        alertDialog1 = builder.create();
        alertDialog1.show();
    }

    @Override
    public void onClick(View v) {
        exibirDetalhes(v.getId());
    }


    public void exibirInstituicoes(){
        final String [] items = new String[] {"APAE","Instituto São Vicente de Paulo"," Casa do Menino em Santo Antônio"};

        AlertDialog.Builder builder = new AlertDialog.Builder(SelectActivity.this);
        builder.setTitle("Selecione uma opção");
        builder.setSingleChoiceItems(items, Integer.parseInt(valor_atual), new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int item) {
                String instituicao = items[item];
                editor.putString("instituicao", instituicao);
                editor.putString("item", String.valueOf(item));
                valor_atual = String.valueOf(item);
                getSupportActionBar().setSubtitle(instituicao);
                editor.apply();
                alertDialog1.dismiss();

            }
        });
        alertDialog1 = builder.create();
        alertDialog1.show();
    }

    public void checkRow1(){

        //first row
            if(null==imageView1.getDrawable()
            || null==imageView2.getDrawable()
            || null==imageView3.getDrawable()
            || null==imageView4.getDrawable()
            || null==imageView5.getDrawable()){

            }
            else{
                int valor_total = prefs.getInt("valor_total", 0);

                if (valor_total>0){

                }
                else{
                    valor_total= valor_total+1;
                }

                editor.putInt("valor_total", valor_total);
                editor.apply();
                valor.setText(Double.toString(valor_total));
            }
        //
    }


    public void checkRow2(){

        if(null==imageView6.getDrawable()
                || null==imageView7.getDrawable()
                || null==imageView8.getDrawable()
                || null==imageView9.getDrawable()){
        }
        else{
            int valor_total = prefs.getInt("valor_total", 0);

            if (valor_total>0){

            }
            else{
                valor_total= valor_total+1;
            }

            editor.putInt("valor_total", valor_total);
            editor.apply();
            valor.setText(Double.toString(valor_total));
        }
    }
}
