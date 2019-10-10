package com.example.viewpagertabviewapplication.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.viewpagertabviewapplication.model.Album;

import java.util.List;

public class FotoAdapter extends FragmentStatePagerAdapter {

    private List<Album> albumList;

    public FotoAdapter(FragmentManager fm, List<Album> albumList){
        super(fm);
        this.albumList = albumList;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return albumList.get(position).getNome();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return albumList.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return albumList.size();
    }
}
