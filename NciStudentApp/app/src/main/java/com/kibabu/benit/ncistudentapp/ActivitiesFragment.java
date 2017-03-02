package com.kibabu.benit.ncistudentapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesFragment extends Fragment {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    List<String> sList;

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    public static ActivitiesFragment newInstance() {
        ActivitiesFragment fragment = new ActivitiesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sList = new ArrayList<>();
        sList.add("Hello");
        sList.add("Benny");
        sList.add("Drinks");
        sList.add("Home");
        sList.add("Green");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_activities, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        adapter = new CustomAdapter(getContext(), R.layout.item_layout);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.setOnItemClickListener(new CustomAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Snackbar.make(v, "Item " + position + " was clicked",Snackbar.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
