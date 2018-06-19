package com.drausiotronolone.xsena;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends Activity {


    protected ArrayList coluna1ordem;
    protected ArrayList coluna2ordem;
    protected ArrayList coluna3ordem;
    protected ArrayList coluna4ordem;
    protected ArrayList coluna5ordem;
    protected ArrayList coluna6ordem;
    protected ArrayList coluna1desordem;
    protected ArrayList coluna2desordem;
    protected ArrayList coluna3desordem;
    protected ArrayList coluna4desordem;
    protected ArrayList coluna5desordem;
    protected ArrayList coluna6desordem;
    protected TextView resultText;
    protected String resultString;
    protected ArrayList<String> resultsArray;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ordemButton = (Button)findViewById(R.id.emordem_button);
        Button foraDeOrdemButton = (Button)findViewById(R.id.foraordem_button);
        Button estouComSorteButton = (Button)findViewById(R.id.sorte_button);
        resultText = (TextView)findViewById(R.id.resultText);

        coluna1ordem = new ArrayList();
        coluna2ordem = new ArrayList();
        coluna3ordem = new ArrayList();
        coluna4ordem = new ArrayList();
        coluna5ordem = new ArrayList();
        coluna6ordem = new ArrayList();
        resultsArray = new ArrayList();

        for (int i = 1; i <= 159; i++)
        {
            coluna1ordem.add("1");
        }
        for (int i = 1; i <= 155; i++)
        {
            coluna1ordem.add("2");
        }
        for (int i = 1; i <= 131; i++)
        {
            coluna1ordem.add("3");
        }
        for (int i = 1; i <= 145; i++)
        {
            coluna1ordem.add("4");
        }
        for (int i = 1; i <= 131; i++)
        {
            coluna1ordem.add("5");
        }
        for (int i = 1; i <= 99; i++)
        {
            coluna1ordem.add("6");
        }
        for (int i = 1; i <= 110; i++)
        {
            coluna1ordem.add("7");
        }
        for (int i = 1; i <= 87; i++)
        {
            coluna1ordem.add("8");
        }
        for (int i = 1; i <= 66; i++)
        {
            coluna1ordem.add("9");
        }
        for (int i = 1; i <= 80; i++)
        {
            coluna1ordem.add("10");
        }
        for (int i = 1; i <= 50; i++)
        {
            coluna1ordem.add("11");
        }
        for (int i = 1; i <= 55; i++)
        {
            coluna1ordem.add("12");
        }
        for (int i = 1; i <= 49; i++)
        {
            coluna1ordem.add("13");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna1ordem.add("14");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna1ordem.add("15");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1ordem.add("16");
        }
        for (int i = 1; i <= 41; i++)
        {
            coluna1ordem.add("17");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1ordem.add("18");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1ordem.add("19");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna1ordem.add("20");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna1ordem.add("21");
        }
        for (int i = 1; i <= 14; i++)
        {
            coluna1ordem.add("22");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna1ordem.add("23");
        }
        for (int i = 1; i <= 14; i++)
        {
            coluna1ordem.add("24");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna1ordem.add("25");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna1ordem.add("26");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna1ordem.add("27");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna1ordem.add("28");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna1ordem.add("29");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna1ordem.add("30");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna1ordem.add("31");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna1ordem.add("32");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna1ordem.add("33");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna1ordem.add("34");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna1ordem.add("35");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna1ordem.add("36");
            coluna1ordem.add("38");
            coluna1ordem.add("39");
            coluna1ordem.add("43");
            coluna1ordem.add("46");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna2ordem.add("2");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2ordem.add("3");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna2ordem.add("4");
        }
        for (int i = 1; i <= 54; i++)
        {
            coluna2ordem.add("5");
        }
        for (int i = 1; i <= 56; i++)
        {
            coluna2ordem.add("6");
        }
        for (int i = 1; i <= 43; i++)
        {
            coluna2ordem.add("7");
        }
        for (int i = 1; i <= 68; i++)
        {
            coluna2ordem.add("8");
        }
        for (int i = 1; i <= 63; i++)
        {
            coluna2ordem.add("9");
        }
        for (int i = 1; i <= 71; i++)
        {
            coluna2ordem.add("10");
        }
        for (int i = 1; i <= 66; i++)
        {
            coluna2ordem.add("11");
        }
        for (int i = 1; i <= 74; i++)
        {
            coluna2ordem.add("12");
        }
        for (int i = 1; i <= 85; i++)
        {
            coluna2ordem.add("13");
        }
        for (int i = 1; i <= 61; i++)
        {
            coluna2ordem.add("14");
        }
        for (int i = 1; i <= 67; i++)
        {
            coluna2ordem.add("15");
        }
        for (int i = 1; i <= 86; i++)
        {
            coluna2ordem.add("16");
        }
        for (int i = 1; i <= 62; i++)
        {
            coluna2ordem.add("17");
        }
        for (int i = 1; i <= 66; i++)
        {
            coluna2ordem.add("18");
        }
        for (int i = 1; i <= 54; i++)
        {
            coluna2ordem.add("19");
        }
        for (int i = 1; i <= 53; i++)
        {
            coluna2ordem.add("20");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna2ordem.add("21");
        }
        for (int i = 1; i <= 43; i++)
        {
            coluna2ordem.add("22");
        }
        for (int i = 1; i <= 56; i++)
        {
            coluna2ordem.add("23");
        }
        for (int i = 1; i <= 48; i++)
        {
            coluna2ordem.add("24");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna2ordem.add("25");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna2ordem.add("26");
        }
        for (int i = 1; i <= 55; i++)
        {
            coluna2ordem.add("27");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2ordem.add("28");
        }
        for (int i = 1; i <= 40; i++)
        {
            coluna2ordem.add("29");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna2ordem.add("30");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna2ordem.add("31");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2ordem.add("32");
        }
        for (int i = 1; i <= 13; i++)
        {
            coluna2ordem.add("33");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna2ordem.add("35");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna2ordem.add("36");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna2ordem.add("37");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna2ordem.add("38");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna2ordem.add("39");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna2ordem.add("41");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna2ordem.add("42");
        }
        for (int i = 1; i <= 5; i++)
        {
            coluna2ordem.add("43");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna2ordem.add("44");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna2ordem.add("4");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna2ordem.add("46");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna2ordem.add("47");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna2ordem.add("48");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna3ordem.add("3");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna3ordem.add("4");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna3ordem.add("5");
        }
        for (int i = 1; i <= 8; i++)
        {
            coluna3ordem.add("6");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna3ordem.add("7");
        }
        for (int i = 1; i <= 13; i++)
        {
            coluna3ordem.add("8");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna3ordem.add("9");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna3ordem.add("10");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna3ordem.add("11");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna3ordem.add("12");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna3ordem.add("13");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna3ordem.add("14");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna3ordem.add("15");
        }
        for (int i = 1; i <= 45; i++)
        {
            coluna3ordem.add("16");
        }
        for (int i = 1; i <= 59; i++)
        {
            coluna3ordem.add("17");
        }
        for (int i = 1; i <= 43; i++)
        {
            coluna3ordem.add("18");
        }
        for (int i = 1; i <= 55; i++)
        {
            coluna3ordem.add("19");
        }
        for (int i = 1; i <= 54; i++)
        {
            coluna3ordem.add("20");
        }
        for (int i = 1; i <= 58; i++)
        {
            coluna3ordem.add("21");
        }
        for (int i = 1; i <= 45; i++)
        {
            coluna3ordem.add("22");
        }
        for (int i = 1; i <= 68; i++)
        {
            coluna3ordem.add("23");
        }
        for (int i = 1; i <= 73; i++)
        {
            coluna3ordem.add("24");
        }
        for (int i = 1; i <= 49; i++)
        {
            coluna3ordem.add("25");
        }
        for (int i = 1; i <= 53; i++)
        {
            coluna3ordem.add("26");
        }
        for (int i = 1; i <= 45; i++)
        {
            coluna3ordem.add("27");
        }
        for (int i = 1; i <= 74; i++)
        {
            coluna3ordem.add("28");
        }
        for (int i = 1; i <= 55; i++)
        {
            coluna3ordem.add("29");
        }
        for (int i = 1; i <= 63; i++)
        {
            coluna3ordem.add("30");
        }
        for (int i = 1; i <= 58; i++)
        {
            coluna3ordem.add("31");
        }
        for (int i = 1; i <= 49; i++)
        {
            coluna3ordem.add("32");
        }
        for (int i = 1; i <= 50; i++)
        {
            coluna3ordem.add("33");
        }
        for (int i = 1; i <= 52; i++)
        {
            coluna3ordem.add("34");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna3ordem.add("35");
        }
        for (int i = 1; i <= 43; i++)
        {
            coluna3ordem.add("36");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna3ordem.add("37");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna3ordem.add("38");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna3ordem.add("39");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna3ordem.add("40");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna3ordem.add("41");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3ordem.add("42");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna3ordem.add("43");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna3ordem.add("44");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna3ordem.add("45");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna3ordem.add("46");
        }
        for (int i = 1; i <= 10; i++)
        {
            coluna3ordem.add("47");
        }
        for (int i = 1; i <= 8; i++)
        {
            coluna3ordem.add("48");
        }
        for (int i = 1; i <= 5; i++)
        {
            coluna3ordem.add("49");
        }
        for (int i = 1; i <= 10; i++)
        {
            coluna3ordem.add("50");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna3ordem.add("51");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna3ordem.add("52");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna3ordem.add("54");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna4ordem.add("8");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna4ordem.add("9");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna4ordem.add("10");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna4ordem.add("11");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna4ordem.add("12");
        }
        for (int i = 1; i <= 10; i++)
        {
            coluna4ordem.add("13");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna4ordem.add("14");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna4ordem.add("15");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna4ordem.add("16");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna4ordem.add("17");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna4ordem.add("18");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna4ordem.add("19");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4ordem.add("20");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4ordem.add("21");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4ordem.add("22");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4ordem.add("23");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna4ordem.add("24");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna4ordem.add("25");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna4ordem.add("26");
        }
        for (int i = 1; i <= 45; i++)
        {
            coluna4ordem.add("27");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna4ordem.add("28");
        }
        for (int i = 1; i <= 53; i++)
        {
            coluna4ordem.add("29");
        }
        for (int i = 1; i <= 53; i++)
        {
            coluna4ordem.add("30");
        }
        for (int i = 1; i <= 48; i++)
        {
            coluna4ordem.add("31");
        }
        for (int i = 1; i <= 59; i++)
        {
            coluna4ordem.add("32");
        }
        for (int i = 1; i <= 77; i++)
        {
            coluna4ordem.add("33");
        }
        for (int i = 1; i <= 66; i++)
        {
            coluna4ordem.add("34");
        }
        for (int i = 1; i <= 57; i++)
        {
            coluna4ordem.add("35");
        }
        for (int i = 1; i <= 58; i++)
        {
            coluna4ordem.add("36");
        }
        for (int i = 1; i <= 61; i++)
        {
            coluna4ordem.add("37");
        }
        for (int i = 1; i <= 60; i++)
        {
            coluna4ordem.add("38");
        }
        for (int i = 1; i <= 52; i++)
        {
            coluna4ordem.add("39");
        }
        for (int i = 1; i <= 57; i++)
        {
            coluna4ordem.add("40");
        }
        for (int i = 1; i <= 67; i++)
        {
            coluna4ordem.add("41");
        }
        for (int i = 1; i <= 56; i++)
        {
            coluna4ordem.add("42");
        }
        for (int i = 1; i <= 54; i++)
        {
            coluna4ordem.add("43");
        }
        for (int i = 1; i <= 58; i++)
        {
            coluna4ordem.add("44");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna4ordem.add("45");
        }
        for (int i = 1; i <= 50; i++)
        {
            coluna4ordem.add("46");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna4ordem.add("47");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4ordem.add("48");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4ordem.add("49");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna4ordem.add("50");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna4ordem.add("51");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna4ordem.add("52");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna4ordem.add("53");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna4ordem.add("54");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna4ordem.add("55");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna4ordem.add("56");
        }
        for (int i = 1; i <= 5; i++)
        {
            coluna4ordem.add("57");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna4ordem.add("58");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna5ordem.add("11");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna5ordem.add("12");
            coluna5ordem.add("14");
            coluna5ordem.add("15");
            coluna5ordem.add("16");
            coluna5ordem.add("17");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna5ordem.add("18");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna5ordem.add("19");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna5ordem.add("20");
        }
        for (int i = 1; i <= 5; i++)
        {
            coluna5ordem.add("21");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna5ordem.add("22");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna5ordem.add("23");
        }
        for (int i = 1; i <= 7; i++)
        {
            coluna5ordem.add("24");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna5ordem.add("25");
        }
        for (int i = 1; i <= 8; i++)
        {
            coluna5ordem.add("26");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna5ordem.add("27");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna5ordem.add("28");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna5ordem.add("29");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna5ordem.add("30");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5ordem.add("31");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5ordem.add("32");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna5ordem.add("33");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5ordem.add("34");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna5ordem.add("35");
        }
        for (int i = 1; i <= 48; i++)
        {
            coluna5ordem.add("36");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna5ordem.add("37");
        }
        for (int i = 1; i <= 49; i++)
        {
            coluna5ordem.add("38");
        }
        for (int i = 1; i <= 47; i++)
        {
            coluna5ordem.add("39");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna5ordem.add("40");
        }
        for (int i = 1; i <= 65; i++)
        {
            coluna5ordem.add("41");
        }
        for (int i = 1; i <= 76; i++)
        {
            coluna5ordem.add("42");
        }
        for (int i = 1; i <= 72; i++)
        {
            coluna5ordem.add("43");
        }
        for (int i = 1; i <= 55; i++)
        {
            coluna5ordem.add("44");
        }
        for (int i = 1; i <= 73; i++)
        {
            coluna5ordem.add("45");
        }
        for (int i = 1; i <= 72; i++)
        {
            coluna5ordem.add("46");
        }
        for (int i = 1; i <= 71; i++)
        {
            coluna5ordem.add("47");
        }
        for (int i = 1; i <= 56; i++)
        {
            coluna5ordem.add("48");
        }
        for (int i = 1; i <= 69; i++)
        {
            coluna5ordem.add("49");
        }
        for (int i = 1; i <= 70; i++)
        {
            coluna5ordem.add("50");
        }
        for (int i = 1; i <= 85; i++)
        {
            coluna5ordem.add("51");
        }
        for (int i = 1; i <= 65; i++)
        {
            coluna5ordem.add("52");
        }
        for (int i = 1; i <= 70; i++)
        {
            coluna5ordem.add("53");
        }
        for (int i = 1; i <= 61; i++)
        {
            coluna5ordem.add("54");
        }
        for (int i = 1; i <= 44; i++)
        {
            coluna5ordem.add("55");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna5ordem.add("56");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna5ordem.add("57");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna5ordem.add("58");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna5ordem.add("59");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna6ordem.add("22");
            coluna6ordem.add("24");
            coluna6ordem.add("27");
        }
        for (int i = 1; i <= 3; i++)
        {
            coluna6ordem.add("28");
        }
        for (int i = 1; i <= 1; i++)
        {
            coluna6ordem.add("29");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna6ordem.add("30");
        }
        for (int i = 1; i <= 2; i++)
        {
            coluna6ordem.add("31");
        }
        for (int i = 1; i <= 9; i++)
        {
            coluna6ordem.add("32");
        }
        for (int i = 1; i <= 4; i++)
        {
            coluna6ordem.add("33");
        }
        for (int i = 1; i <= 6; i++)
        {
            coluna6ordem.add("34");
        }
        for (int i = 1; i <= 12; i++)
        {
            coluna6ordem.add("35");
        }
        for (int i = 1; i <= 11; i++)
        {
            coluna6ordem.add("36");
        }
        for (int i = 1; i <= 14; i++)
        {
            coluna6ordem.add("37");
        }
        for (int i = 1; i <= 16; i++)
        {
            coluna6ordem.add("38");
        }
        for (int i = 1; i <= 14; i++)
        {
            coluna6ordem.add("39");
        }
        for (int i = 1; i <= 15; i++)
        {
            coluna6ordem.add("40");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna6ordem.add("41");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna6ordem.add("42");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna6ordem.add("43");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna6ordem.add("44");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna6ordem.add("45");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna6ordem.add("46");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna6ordem.add("47");
        }
        for (int i = 1; i <= 57; i++)
        {
            coluna6ordem.add("48");
        }
        for (int i = 1; i <= 77; i++)
        {
            coluna6ordem.add("49");
        }
        for (int i = 1; i <= 64; i++)
        {
            coluna6ordem.add("50");
        }
        for (int i = 1; i <= 77; i++)
        {
            coluna6ordem.add("51");
        }
        for (int i = 1; i <= 88; i++)
        {
            coluna6ordem.add("52");
        }
        for (int i = 1; i <= 101; i++)
        {
            coluna6ordem.add("53");
        }
        for (int i = 1; i <= 113; i++)
        {
            coluna6ordem.add("54");
        }
        for (int i = 1; i <= 93; i++)
        {
            coluna6ordem.add("55");
        }
        for (int i = 1; i <= 122; i++)
        {
            coluna6ordem.add("56");
        }
        for (int i = 1; i <= 111; i++)
        {
            coluna6ordem.add("57");
        }
        for (int i = 1; i <= 138; i++)
        {
            coluna6ordem.add("58");
        }
        for (int i = 1; i <= 146; i++)
        {
            coluna6ordem.add("59");
        }
        for (int i = 1; i <= 160; i++)
        {
            coluna6ordem.add("60");
        }

        coluna1desordem = new ArrayList();
        coluna2desordem = new ArrayList();
        coluna3desordem = new ArrayList();
        coluna4desordem = new ArrayList();
        coluna5desordem = new ArrayList();
        coluna6desordem = new ArrayList();

        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("1");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna1desordem.add("2");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna1desordem.add("3");
        }
        for (int i = 1; i <= 40; i++)
        {
            coluna1desordem.add("4");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("5");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("6");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna1desordem.add("7");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna1desordem.add("8");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("9");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("10");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1desordem.add("11");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1desordem.add("12");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna1desordem.add("13");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna1desordem.add("14");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna1desordem.add("15");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1desordem.add("16");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("17");
        }
        for (int i = 1; i <= 16; i++)
        {
            coluna1desordem.add("18");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna1desordem.add("19");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna1desordem.add("20");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna1desordem.add("21");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna1desordem.add("22");
        }
        for (int i = 1; i <= 18; i++)
        {
            coluna1desordem.add("23");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1desordem.add("24");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("25");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("26");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1desordem.add("27");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna1desordem.add("28");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("29");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna1desordem.add("30");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("31");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna1desordem.add("32");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("33");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna1desordem.add("34");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna1desordem.add("35");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("36");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna1desordem.add("37");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna1desordem.add("38");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("39");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna1desordem.add("40");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1desordem.add("41");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1desordem.add("42");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1desordem.add("43");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna1desordem.add("44");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("45");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna1desordem.add("46");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna1desordem.add("47");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna1desordem.add("48");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna1desordem.add("49");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna1desordem.add("50");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("51");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna1desordem.add("52");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna1desordem.add("53");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna1desordem.add("54");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("55");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna1desordem.add("56");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna1desordem.add("57");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna1desordem.add("58");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna1desordem.add("59");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna1desordem.add("60");
        }

        //coluna2

        for (int i = 1; i <= 27; i++)
        {
            coluna2desordem.add("1");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("2");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("3");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna2desordem.add("4");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna2desordem.add("5");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna2desordem.add("6");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("7");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna2desordem.add("8");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna2desordem.add("9");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna2desordem.add("10");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("11");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna2desordem.add("12");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna2desordem.add("13");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna2desordem.add("14");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("15");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna2desordem.add("16");
        }
        for (int i = 1; i <= 41; i++)
        {
            coluna2desordem.add("17");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("18");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("19");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna2desordem.add("20");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna2desordem.add("21");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("22");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna2desordem.add("23");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna2desordem.add("24");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("25");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna2desordem.add("26");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna2desordem.add("27");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("28");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("29");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna2desordem.add("30");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("31");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("32");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna2desordem.add("33");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna2desordem.add("34");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna2desordem.add("35");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna2desordem.add("36");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna2desordem.add("37");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna2desordem.add("38");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna2desordem.add("39");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna2desordem.add("40");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna2desordem.add("41");
        }
        for (int i = 1; i <= 37; i++)
        {
            coluna2desordem.add("42");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna2desordem.add("43");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2desordem.add("44");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("45");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("46");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna2desordem.add("47");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("48");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2desordem.add("49");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna2desordem.add("50");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2desordem.add("51");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2desordem.add("52");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna2desordem.add("53");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna2desordem.add("54");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna2desordem.add("55");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna2desordem.add("56");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("57");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna2desordem.add("58");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna2desordem.add("59");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna2desordem.add("60");
        }

        //coluna 3

        for (int i = 1; i <= 31; i++)
        {
            coluna3desordem.add("1");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("2");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna3desordem.add("3");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna3desordem.add("4");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("5");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna3desordem.add("6");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("7");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("8");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna3desordem.add("9");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna3desordem.add("10");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("11");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna3desordem.add("12");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("13");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("14");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("15");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna3desordem.add("16");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("17");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna3desordem.add("18");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna3desordem.add("19");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("20");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna3desordem.add("21");
        }
        for (int i = 1; i <= 17; i++)
        {
            coluna3desordem.add("22");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna3desordem.add("23");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna3desordem.add("24");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna3desordem.add("25");
        }
        for (int i = 1; i <= 18; i++)
        {
            coluna3desordem.add("26");
        }
        for (int i = 1; i <= 42; i++)
        {
            coluna3desordem.add("27");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna3desordem.add("28");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna3desordem.add("29");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna3desordem.add("30");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna3desordem.add("31");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna3desordem.add("32");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna3desordem.add("33");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna3desordem.add("34");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna3desordem.add("35");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna3desordem.add("36");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna3desordem.add("37");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna3desordem.add("38");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna3desordem.add("39");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("40");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna3desordem.add("41");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna3desordem.add("42");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna3desordem.add("43");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna3desordem.add("44");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna3desordem.add("45");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna3desordem.add("46");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna3desordem.add("47");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna3desordem.add("48");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna3desordem.add("49");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("50");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna3desordem.add("51");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna3desordem.add("52");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna3desordem.add("53");
        }
        for (int i = 1; i <= 37; i++)
        {
            coluna3desordem.add("54");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna3desordem.add("55");
        }
        for (int i = 1; i <= 37; i++)
        {
            coluna3desordem.add("56");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna3desordem.add("57");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna3desordem.add("58");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna3desordem.add("59");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna3desordem.add("60");
        }

        //coluna 4

        for (int i = 1; i <= 30; i++)
        {
            coluna4desordem.add("1");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna4desordem.add("2");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna4desordem.add("3");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("4");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna4desordem.add("5");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("6");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna4desordem.add("7");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna4desordem.add("8");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4desordem.add("9");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna4desordem.add("10");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("11");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna4desordem.add("12");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna4desordem.add("13");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4desordem.add("14");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4desordem.add("15");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4desordem.add("16");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna4desordem.add("17");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna4desordem.add("18");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna4desordem.add("19");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("20");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna4desordem.add("21");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4desordem.add("22");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna4desordem.add("23");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna4desordem.add("24");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("25");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna4desordem.add("26");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("27");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna4desordem.add("28");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna4desordem.add("29");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("30");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna4desordem.add("31");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("32");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna4desordem.add("33");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna4desordem.add("34");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4desordem.add("35");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna4desordem.add("36");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna4desordem.add("37");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("38");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna4desordem.add("39");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("40");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna4desordem.add("41");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna4desordem.add("42");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna4desordem.add("43");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4desordem.add("44");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("45");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna4desordem.add("46");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4desordem.add("47");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna4desordem.add("48");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("49");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna4desordem.add("50");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna4desordem.add("51");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna4desordem.add("52");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna4desordem.add("53");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna4desordem.add("54");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna4desordem.add("55");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna4desordem.add("56");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna4desordem.add("57");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna4desordem.add("58");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna4desordem.add("59");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna4desordem.add("60");
        }

        //coluna 5

        for (int i = 1; i <= 23; i++)
        {
            coluna5desordem.add("1");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna5desordem.add("2");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna5desordem.add("3");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("4");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna5desordem.add("5");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna5desordem.add("6");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna5desordem.add("7");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("8");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("9");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna5desordem.add("10");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("11");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna5desordem.add("12");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna5desordem.add("13");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("14");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna5desordem.add("15");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna5desordem.add("16");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna5desordem.add("17");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("18");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna5desordem.add("19");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna5desordem.add("20");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna5desordem.add("21");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna5desordem.add("22");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna5desordem.add("23");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("24");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna5desordem.add("25");
        }
        for (int i = 1; i <= 18; i++)
        {
            coluna5desordem.add("26");
        }
        for (int i = 1; i <= 16; i++)
        {
            coluna5desordem.add("27");
        }
        for (int i = 1; i <= 37; i++)
        {
            coluna5desordem.add("28");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5desordem.add("29");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna5desordem.add("30");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("31");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna5desordem.add("32");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna5desordem.add("33");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("34");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("35");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5desordem.add("36");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna5desordem.add("37");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna5desordem.add("38");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna5desordem.add("39");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna5desordem.add("40");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna5desordem.add("41");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna5desordem.add("42");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna5desordem.add("43");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna5desordem.add("44");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("45");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna5desordem.add("46");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna5desordem.add("47");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna5desordem.add("48");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5desordem.add("49");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna5desordem.add("50");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna5desordem.add("51");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("52");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna5desordem.add("53");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5desordem.add("54");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna5desordem.add("55");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna5desordem.add("56");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna5desordem.add("57");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("58");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna5desordem.add("59");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna5desordem.add("60");
        }

        //coluna 6

        for (int i = 1; i <= 24; i++)
        {
            coluna6desordem.add("1");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("2");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("3");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna6desordem.add("4");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna6desordem.add("5");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna6desordem.add("6");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna6desordem.add("7");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("8");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna6desordem.add("9");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("10");
        }
        for (int i = 1; i <= 18; i++)
        {
            coluna6desordem.add("11");
        }
        for (int i = 1; i <= 24; i++)
        {
            coluna6desordem.add("12");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna6desordem.add("13");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna6desordem.add("14");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna6desordem.add("15");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna6desordem.add("16");
        }
        for (int i = 1; i <= 33; i++)
        {
            coluna6desordem.add("17");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna6desordem.add("18");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna6desordem.add("19");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna6desordem.add("20");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna6desordem.add("21");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna6desordem.add("22");
        }
        for (int i = 1; i <= 39; i++)
        {
            coluna6desordem.add("23");
        }
        for (int i = 1; i <= 35; i++)
        {
            coluna6desordem.add("24");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna6desordem.add("25");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("26");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna6desordem.add("27");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna6desordem.add("28");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna6desordem.add("29");
        }
        for (int i = 1; i <= 38; i++)
        {
            coluna6desordem.add("30");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna6desordem.add("31");
        }
        for (int i = 1; i <= 25; i++)
        {
            coluna6desordem.add("32");
        }
        for (int i = 1; i <= 36; i++)
        {
            coluna6desordem.add("33");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("34");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna6desordem.add("35");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna6desordem.add("36");
        }
        for (int i = 1; i <= 21; i++)
        {
            coluna6desordem.add("37");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna6desordem.add("38");
        }
        for (int i = 1; i <= 30; i++)
        {
            coluna6desordem.add("39");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna6desordem.add("40");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("41");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna6desordem.add("42");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna6desordem.add("43");
        }
        for (int i = 1; i <= 20; i++)
        {
            coluna6desordem.add("44");
        }
        for (int i = 1; i <= 19; i++)
        {
            coluna6desordem.add("45");
        }
        for (int i = 1; i <= 28; i++)
        {
            coluna6desordem.add("46");
        }
        for (int i = 1; i <= 26; i++)
        {
            coluna6desordem.add("47");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("48");
        }
        for (int i = 1; i <= 31; i++)
        {
            coluna6desordem.add("49");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna6desordem.add("50");
        }
        for (int i = 1; i <= 34; i++)
        {
            coluna6desordem.add("51");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna6desordem.add("52");
        }
        for (int i = 1; i <= 32; i++)
        {
            coluna6desordem.add("53");
        }
        for (int i = 1; i <= 27; i++)
        {
            coluna6desordem.add("54");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna6desordem.add("55");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna6desordem.add("56");
        }
        for (int i = 1; i <= 29; i++)
        {
            coluna6desordem.add("57");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna6desordem.add("58");
        }
        for (int i = 1; i <= 23; i++)
        {
            coluna6desordem.add("59");
        }
        for (int i = 1; i <= 22; i++)
        {
            coluna6desordem.add("60");
        }




    }

    public void emOrdemButton(View view)
    {


        String resCol1 = (String) coluna1ordem.get(new Random().nextInt(coluna1ordem.size() - 1));

        String resCol2 = (String) coluna2ordem.get(new Random().nextInt(coluna2ordem.size() - 1));

        while (Integer.parseInt(resCol2) <= Integer.parseInt(resCol1))
        {
            resCol2 = (String) coluna2ordem.get(new Random().nextInt(coluna2ordem.size() - 1));

        }

        String resCol3 = (String) coluna3ordem.get(new Random().nextInt(coluna3ordem.size() - 1));

        while (Integer.parseInt(resCol3) <= Integer.parseInt(resCol2))
        {
            resCol3 = (String) coluna3ordem.get(new Random().nextInt(coluna3ordem.size() - 1));

        }

        String resCol4 = (String) coluna4ordem.get(new Random().nextInt(coluna4ordem.size() - 1));

        while (Integer.parseInt(resCol4) <= Integer.parseInt(resCol3))
        {
            resCol4 = (String) coluna4ordem.get(new Random().nextInt(coluna4ordem.size() - 1));

        }

        String resCol5 = (String) coluna5ordem.get(new Random().nextInt(coluna5ordem.size() - 1));

        while (Integer.parseInt(resCol5) <= Integer.parseInt(resCol4))
        {
            resCol5 = (String) coluna5ordem.get(new Random().nextInt(coluna5ordem.size() - 1));

        }

        String resCol6 = (String) coluna6ordem.get(new Random().nextInt(coluna6ordem.size() - 1));

        while (Integer.parseInt(resCol6) <= Integer.parseInt(resCol5))
        {
            resCol6 = (String) coluna6ordem.get(new Random().nextInt(coluna6ordem.size() - 1));

        }

        String resultString = resCol1 + " - " + resCol2 + " - " + resCol3 + " - " + resCol4 + " - "
                + resCol5 + " - " + resCol6;

        resultText.setText(resultString);


    }

    public void foraDeOrdemButton(View view)
    {
        String resCol1 = (String) coluna1desordem.get(new Random().nextInt(coluna1desordem.size() - 1));

        String resCol2 = (String) coluna2desordem.get(new Random().nextInt(coluna2desordem.size() - 1));

        while (Integer.parseInt(resCol2) == Integer.parseInt(resCol1))
        {
            resCol2 = (String) coluna2desordem.get(new Random().nextInt(coluna2desordem.size() - 1));

        }

        String resCol3 = (String) coluna3desordem.get(new Random().nextInt(coluna3desordem.size() - 1));

        while ((Integer.parseInt(resCol3) == Integer.parseInt(resCol2)) || (Integer.parseInt(resCol3) ==
        Integer.parseInt(resCol1)))
        {
            resCol3 = (String) coluna3desordem.get(new Random().nextInt(coluna3desordem.size() - 1));

        }

        String resCol4 = (String) coluna4desordem.get(new Random().nextInt(coluna4desordem.size() - 1));

        while ((Integer.parseInt(resCol4) == Integer.parseInt(resCol3)) || (Integer.parseInt(resCol4) ==
                Integer.parseInt(resCol2)) || (Integer.parseInt(resCol4) == Integer.parseInt(resCol1)))
        {
            resCol4 = (String) coluna4desordem.get(new Random().nextInt(coluna4desordem.size() - 1));

        }

        String resCol5 = (String) coluna5desordem.get(new Random().nextInt(coluna5desordem.size() - 1));

        while ((Integer.parseInt(resCol5) == Integer.parseInt(resCol4)) || (Integer.parseInt(resCol5) ==
                Integer.parseInt(resCol3)) || (Integer.parseInt(resCol5) == Integer.parseInt(resCol2))
                || (Integer.parseInt(resCol5) == Integer.parseInt(resCol1)))
        {
            resCol5 = (String) coluna5desordem.get(new Random().nextInt(coluna5desordem.size() - 1));

        }

        String resCol6 = (String) coluna6desordem.get(new Random().nextInt(coluna6desordem.size() - 1));

        while ((Integer.parseInt(resCol6) == Integer.parseInt(resCol5)) || (Integer.parseInt(resCol6) ==
                Integer.parseInt(resCol4)) || (Integer.parseInt(resCol6) == Integer.parseInt(resCol3))
                || (Integer.parseInt(resCol6) == Integer.parseInt(resCol2))|| (Integer.parseInt(resCol6)
                == Integer.parseInt(resCol1)))
        {
            resCol6 = (String) coluna6desordem.get(new Random().nextInt(coluna6desordem.size() - 1));

        }

        String resultString = resCol1 + " - " + resCol2 + " - " + resCol3 + " - " + resCol4 + " - "
                + resCol5 + " - " + resCol6;

        resultText.setText(resultString);
    }

    public void surpreendaMeButton(View view)
    {


        String resCol1 = (String) coluna1ordem.get(new Random().nextInt(coluna1ordem.size() - 1));

        String resCol2 = (String) coluna2ordem.get(new Random().nextInt(coluna2ordem.size() - 1));

        while (Integer.parseInt(resCol2) == Integer.parseInt(resCol1))
        {
            resCol2 = (String) coluna2ordem.get(new Random().nextInt(coluna2ordem.size() - 1));

        }

        String resCol3 = (String) coluna3ordem.get(new Random().nextInt(coluna3ordem.size() - 1));

        while ((Integer.parseInt(resCol3) == Integer.parseInt(resCol2)) || (Integer.parseInt(resCol3) ==
                Integer.parseInt(resCol1)))
        {
            resCol3 = (String) coluna3ordem.get(new Random().nextInt(coluna3ordem.size() - 1));

        }

        String resCol4 = (String) coluna4ordem.get(new Random().nextInt(coluna4ordem.size() - 1));

        while ((Integer.parseInt(resCol4) == Integer.parseInt(resCol3)) || (Integer.parseInt(resCol4) ==
                Integer.parseInt(resCol2)) || (Integer.parseInt(resCol4) == Integer.parseInt(resCol1)))
        {
            resCol4 = (String) coluna4ordem.get(new Random().nextInt(coluna4ordem.size() - 1));

        }

        String resCol5 = (String) coluna5ordem.get(new Random().nextInt(coluna5ordem.size() - 1));

        while ((Integer.parseInt(resCol5) == Integer.parseInt(resCol4)) || (Integer.parseInt(resCol5) ==
                Integer.parseInt(resCol3)) || (Integer.parseInt(resCol5) == Integer.parseInt(resCol2))
                || (Integer.parseInt(resCol5) == Integer.parseInt(resCol1)))
        {
            resCol5 = (String) coluna5ordem.get(new Random().nextInt(coluna5ordem.size() - 1));

        }

        String resCol6 = (String) coluna6ordem.get(new Random().nextInt(coluna6ordem.size() - 1));

        while ((Integer.parseInt(resCol6) == Integer.parseInt(resCol5)) || (Integer.parseInt(resCol6) ==
                Integer.parseInt(resCol4)) || (Integer.parseInt(resCol6) == Integer.parseInt(resCol3))
                || (Integer.parseInt(resCol6) == Integer.parseInt(resCol2))|| (Integer.parseInt(resCol6)
                == Integer.parseInt(resCol1)))
        {
            resCol6 = (String) coluna6ordem.get(new Random().nextInt(coluna6ordem.size() - 1));

        }

        resultString = resCol1 + " - " + resCol2 + " - " + resCol3 + " - " + resCol4 + " - "
                + resCol5 + " - " + resCol6;

        resultText.setText(resultString);


    }

    public void salvarButton(View view)
    {
        if (!resultText.getText().equals(""))
        {
            MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);

            Jogo jogo = new Jogo(resultText.getText().toString());

            dbHandler.addJogo(jogo);

            Toast.makeText(this,"Parabéns, seu jogo foi salvo!", Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Você ainda não tem nenhum jogo!", Toast.LENGTH_LONG).show();

        }

    }

    public void meusJogosButton(View view)
    {
        Intent i = new Intent(this, MeusJogosActivity.class);


        startActivity(i);
    }


}
