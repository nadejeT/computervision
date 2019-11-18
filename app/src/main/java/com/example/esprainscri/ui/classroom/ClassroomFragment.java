package com.example.esprainscri.ui.classroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esprainscri.R;
import com.example.esprainscri.ui.Adapters.MyAdapter;
import com.example.esprainscri.ui.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassroomFragment extends Fragment {


    List<Student> myDataset = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;



    public ClassroomFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myDataset.add(new Student("Anas Fersi",0));
        myDataset.add(new Student("Slim Maali",0));
        myDataset.add(new Student("Nadeej Tabib",1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_classroom, container, false);



        recyclerView = (RecyclerView) root.findViewById(R.id.listClassroom);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);


        return root;
    }

}


