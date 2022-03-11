package com.barney.kpltpmod3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Soal1 extends AppCompatActivity {

    public static ArrayList<KodePos> list = new ArrayList<KodePos>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        setupData();
        listView = findViewById(R.id.ListView);

        ListAdapter adapter = new ListAdapter(getApplicationContext(), 0, list);
        listView.setAdapter(adapter);
//        setUpList();
    }

    private void setupData()
    {
        KodePos q1 = new KodePos("Batununggal", "40266");
        list.add(q1);

        KodePos q2 = new KodePos("Kujangsari", "40287");
        list.add(q2);

        KodePos q3 = new KodePos("Mengger", "40267");
        list.add(q3);

        KodePos q4 = new KodePos("Wates", "40256");
        list.add(q4);

        KodePos q5 = new KodePos("Cijaura", "40287");
        list.add(q5);

        KodePos q6 = new KodePos("Jatisari", "40286");
        list.add(q6);

        KodePos q7 = new KodePos("Margasari", "40286");
        list.add(q7);

        KodePos q8 = new KodePos("Sekejati", "40286");
        list.add(q8);

        KodePos q9 = new KodePos("Kebonwaru", "40272");
        list.add(q9);

        KodePos q10 = new KodePos("Maleer", "40274");
        list.add(q10);

        KodePos q11 = new KodePos("Samoja", "40273");
        list.add(q11);

    }

    private void setUpList()
    {

    }
}