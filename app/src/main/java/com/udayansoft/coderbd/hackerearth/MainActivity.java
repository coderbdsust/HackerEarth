package com.udayansoft.coderbd.hackerearth;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.paging.listview.PagingListView;
import com.udayansoft.coderbd.hackerearth.adapter.ContestAdapter;
import com.udayansoft.coderbd.hackerearth.parser.Parser;
import com.udayansoft.coderbd.hackerearth.pojo.Contest;
import com.udayansoft.coderbd.hackerearth.pojo.Website;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PagingListView pagingListView;
    private ContestAdapter contestAdapter;
    private ArrayList<Contest> contests=new ArrayList<>();
    private ProgressDialog pDialog;
    private final String URL = "https://hackerearth.0x10.info/api/toppr_events?type=json&query=list_events";
    private static final String TAG = MainActivity.class.getSimpleName();
    private int pager = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagingListView = (PagingListView) findViewById(R.id.paging_list_view);
        contestAdapter = new ContestAdapter(this, contests);
        pagingListView.setAdapter(contestAdapter);
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JsonObjectRequest rootReq = new JsonObjectRequest(URL, new Response.Listener<JSONObject>() {
            public void onResponse(JSONObject response) {
                Website website = new Parser().parseEarthquakes(response);
                contests.addAll(website.getContests());
                contestAdapter.notifyDataSetChanged();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
            }
        });

        AppController.getInstance().addToRequestQueue(rootReq);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        hidePDialog();
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }
}



