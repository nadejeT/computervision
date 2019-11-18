package com.example.esprainscri.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esprainscri.R;
import com.example.esprainscri.ui.Adapters.MyAdapter;
import com.example.esprainscri.ui.Student;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    List<Student> myDataset = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        myDataset.add(new Student("Anas Fersi",0));
        myDataset.add(new Student("Slim Maali",0));
        myDataset.add(new Student("Nadeej Tabib",1));
        recyclerView = (RecyclerView) root.findViewById(R.id.listStudent);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);


        return root;
    }
}