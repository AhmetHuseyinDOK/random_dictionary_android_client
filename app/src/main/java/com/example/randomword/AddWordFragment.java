package com.example.randomword;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AddWordFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AddWordFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddWordFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.add_word, container, false);
    }

}
