package com.eijs.tabledemoapp;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.CardView;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout;
import com.cleveroad.adaptivetablelayout.LinkedAdaptiveTableAdapter;
import com.cleveroad.adaptivetablelayout.OnItemClickListener;
import com.cleveroad.adaptivetablelayout.OnItemLongClickListener;
import com.eijs.tabledemoapp.adapter.SampleLinkedTableAdapter;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public String[][] arr = {
            {"DR/ST NAME", "CODE", "VST TIME","TOWN", "WORK WITH NAME", "POB","PRODUCT/QTY", "GIFT/QTY", "PRODUCT/RX/RXQTY"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"},
            {"10", "20", "M/S BIJOY MEDICAL","SCH-17 JORHAT", "20", "0","NVLBAR125/0\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/0\n" +
                    "HYSY/5\n" +
                    "NVL LOTN60/1", "NLCN/1", "NVLBAR125/4\n" +
                    "AF-TER L20/3\n" +
                    "AF-TER TAB/6\n" +
                    "HYSY/6\n" +
                    "NVL LOTN60/2"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptiveTableLayout mTableLayout = findViewById(R.id.tableLayout);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        View vHandler = findViewById(R.id.vHandler);
        //String jsonString = "[{\"title\": \"5th title\",\"content\": \"5th content\",\"date\": \"1363197493\"},{\"title\": \"4th title\",\"content\": \"4th content\",\"date\": \"1363197454\"}]";
        try {
            /*Log.d("here",jsonString);
            JSONArray jsonArray = new JSONArray(jsonString);
            Log.d("here 22",jsonString);
            int arrayLength = jsonArray.length();
            Log.d("here 33",jsonString);
            for (int counter = 0; counter < arrayLength; counter++) {
                JSONObject thisJson = jsonArray.getJSONObject(counter);

                arr[counter][0] = thisJson.getString("title");
                arr[counter][1] = thisJson.getString("content");
                arr[counter][2] = thisJson.getString("date");

            }
            Log.d("here 44",jsonString);*/
            LinkedAdaptiveTableAdapter mTableAdapter = new SampleLinkedTableAdapter(MainActivity.this, arr);
            mTableAdapter.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int row, int column) {
                    dialogCloseType(MainActivity.this, arr[row][column]);
                }

                @Override
                public void onRowHeaderClick(int row) {
                    dialogCloseType(MainActivity.this, arr[row][0]);
                }

                @Override
                public void onColumnHeaderClick(int column) {
                    dialogCloseType(MainActivity.this, arr[0][column]);
                }

                @Override
                public void onLeftTopHeaderClick() {
                    dialogCloseType(MainActivity.this, arr[0][0]);
                }
            });
            mTableAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
                @Override
                public void onItemLongClick(int row, int column) {

                }

                @Override
                public void onLeftTopHeaderLongClick() {

                }
            });
            mTableLayout.setAdapter(mTableAdapter);
            mTableAdapter.notifyDataSetChanged();
        }catch (Exception e){

        }

    }

    public void dialogCloseType(final Context context, String stringmsg){
        final Dialog dialog = new Dialog(context);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_edit_item);
        TextView textView = dialog.findViewById(R.id.tvTitle);
        AppCompatButton bPositive = dialog.findViewById(R.id.bPositive);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(stringmsg);
        bPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }


}
