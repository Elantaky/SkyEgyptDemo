package com.zecode.z.skyegyptdemo.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.zecode.z.skyegyptdemo.R;

public class FragmentForInternalTours extends Fragment {

   /* ListView innertours_pics;
    ImageView imageView;
    int[] photos={R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.fourth};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         return inflater.inflate(R.layout.fragment_innertours,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        innertours_pics = getActivity().findViewById(R.id.innertours_pics);
        imageView = getActivity().findViewById(R.id.imageView);

        customListView();
    }

    public void customListView (){

        innertours_pics.setAdapter(new CustomList(getActivity(),photos));

        innertours_pics.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    public class CustomList extends BaseAdapter {
        Context con;
        int [] images;

        public CustomList (Context con,int [] images){
            this.con = con;
            this.images = images;
        }

        @Override
        public int getCount() {
            return photos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View myView;

            LayoutInflater layoutInflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            myView = layoutInflater.inflate(R.layout.innertours_picsanddata,null);

            imageView.setImageResource(images[position]);
            return myView;
        }
    }*/

}
