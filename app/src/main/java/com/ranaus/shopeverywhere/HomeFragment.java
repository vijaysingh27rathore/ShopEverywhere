package com.ranaus.shopeverywhere;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    ListView listView;
    String mTitle[] = {"Black Big-Bag","Black Medium-Bag","Black Sport-Bag","Black Hand-Bag",
            "Shoe-Black","Shoe-Blue","Shoe-Purple","Shoe-Red"};
    String mPrice[] = {"Rs 250","Rs 300","Rs 200","Rs 150","Rs 300","Rs 350","Rs 260","Rs 330"};
    int images[] = {R.drawable.nike_bag1,R.drawable.nike_bag2,R.drawable.nike_bag3,R.drawable.nike_bag4,
            R.drawable.nike_shoes1,R.drawable.nike_shoes2,R.drawable.nike_shoes3,R.drawable.nike_shoes4};


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listView = view.findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(getContext(),mTitle,mPrice,images);
        listView.setAdapter(adapter);

        return view;
    }

    class MyAdapter extends ArrayAdapter<String >
    {
        Context context;
        String rTitle[];
        String rPrice[];
        int rImages[];

        MyAdapter(Context context,String title[], String price[], int images[])
        {
            super(context,R.layout.row,R.id.main_text,title);

            this.context = context;
            this.rTitle = title;
            this.rPrice = price;
            this.rImages = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView imageView = view.findViewById(R.id.old_img);
            TextView textViewMain = view.findViewById(R.id.main_text);
            TextView textViewSub = view.findViewById(R.id.sub_text);

            imageView.setImageResource(rImages[position]);
            textViewMain.setText(rTitle[position]);
            textViewSub.setText(rPrice[position]);
           // return super.getView(position, convertView, parent);
            return view;
        }
    }

}
