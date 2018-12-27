package com.github.motassemja.ufo.ui.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.motassemja.ufo.R;
import com.github.motassemja.ufo.databinding.FragmentGroupsBinding;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class GroupsFragment extends Fragment {


    public GroupsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final FragmentGroupsBinding binding = FragmentGroupsBinding.inflate(inflater, container, false);
        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_menu_groups_to_newGroupFragment);
            }
        });

        return binding.getRoot();
    }

}
