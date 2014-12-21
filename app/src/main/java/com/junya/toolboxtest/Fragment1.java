package com.junya.toolboxtest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, null);

        // リソースに準備した画像ファイルからBitmapを作成しておく
        Bitmap image;
        image = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);

        // データの作成
        List<CustomData> objects = new ArrayList<CustomData>();
        CustomData item1 = new CustomData();
        item1.setImagaData(image);
        item1.setTextData("１つ目〜");

        CustomData item2 = new CustomData();
        item2.setImagaData(image);
        item2.setTextData("The second");

        CustomData item3 = new CustomData();
        item3.setImagaData(image);
        item3.setTextData("Il terzo");

        objects.add(item1);
        objects.add(item2);
        objects.add(item3);

        CustomAdapter customAdapater = new CustomAdapter(getActivity(), 0, objects);

        ListView listView = (ListView)v.findViewById(R.id.list);
        listView.setAdapter(customAdapater);

        return v;
    }
}

