package com.drausiotronolone.xsena;

import java.util.ArrayList;

import android.app.ListActivity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MeusJogosActivity extends ListActivity {

    /** Items entered by the user is stored in this ArrayList variable */
    ArrayList list = new ArrayList();

    /** Declaring an ArrayAdapter to set items to ListView */
    ArrayAdapter adapter;

    MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        list = dbHandler.getStrings();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_multiple_choice,
                list);

        /** Setting a custom layout for the list activity */
        setContentView(R.layout.activity_meus_jogos);


        /** Reference to the delete button of the layout main.xml */
        Button btnDel = (Button) findViewById(R.id.btnDel);

        Button btnSel = (Button) findViewById(R.id.btnSel);

        /** Defining the ArrayAdapter to set items to ListView */
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, list);

        /** Defining a click event listener for the button "Sel" */
        OnClickListener listenerSel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView lv = getListView();
                int size = getListAdapter().getCount();
                int a = 0;

                for (int i = 0; i < size; i++)
                {

                    if (lv.isItemChecked(i))
                    {
                        a++;
                    }
                }

                if (a == size)
                {
                    for (int i = 0; i < size; i++)
                    {
                        lv.setItemChecked(i, false);
                    }
                }
                else {
                    for (int i = 0; i < size; i++) {
                        lv.setItemChecked(i, true);
                    }
                }

            }
        };

        /** Defining a click event listener for the button "Delete" */
        OnClickListener listenerDel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Getting the checked items from the listview */
                SparseBooleanArray checkedItemPositions = getListView().getCheckedItemPositions();
                int itemCount = getListView().getCount();


                for(int i=itemCount; i >= 0; i--){

                    if(checkedItemPositions.get(i)){
                        String jogo;
                        jogo = String.valueOf(adapter.getItem(i));
                        dbHandler.deleteJogo(jogo);
                        adapter.remove(list.get(i));

                    }
                }
                checkedItemPositions.clear();
                adapter.notifyDataSetChanged();
            }
        };


        /** Setting the event listener for the delete button */
        btnDel.setOnClickListener(listenerDel);

        btnSel.setOnClickListener(listenerSel);

        /** Setting the adapter to the ListView */
        setListAdapter(adapter);
    }
}