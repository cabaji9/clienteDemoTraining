package com.androidatc.clientes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ClientActivity extends ActionBarActivity {

    private ListView dynamicListView;

    private List<Client> clientList;

    private ArrayAdapter<Client> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        dynamicListView = (ListView)findViewById(R.id.clientList);

        clientList = new ArrayList<Client>();



//String id, String nombre,String tipo, String edad, String ingreso, List<String> activosList,List<String> pasivosList){


                clientList.add(new Client("12171723","Pedro","Cedula","29","2000",null,null));
        clientList.add(new Client("12171723","Juan","Cedula","30","2000",null,null));
        clientList.add(new Client("12171723","Marco","Cedula","32","2000",null,null));
        clientList.add(new Client("12171723","Saul","Cedula","43","2000",null,null));



        adapter = new ArrayAdapter<Client>(ClientActivity.this,android.R.layout.simple_selectable_list_item,clientList);
        dynamicListView.setAdapter(adapter);

        dynamicListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_client, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
