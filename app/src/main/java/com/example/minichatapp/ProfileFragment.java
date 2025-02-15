package com.example.minichatapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.minichatapp.adapter.RecentChatRecyclerAdapter;
import com.example.minichatapp.adapter.SearchUserRecyclerAdapter;
import com.example.minichatapp.model.ChatroomModel;
import com.example.minichatapp.model.UserModel;
import com.example.minichatapp.utils.FirebaseUtil;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.Query;

public class ProfileFragment extends Fragment {


    public ProfileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);


    }
}


