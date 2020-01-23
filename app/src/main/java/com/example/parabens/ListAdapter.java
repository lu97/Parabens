package com.example.parabens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import static com.example.parabens.Utils.date;

public class ListAdapter extends BaseAdapter{

        Context ctx;
        LayoutInflater lInflater;
        List<Element> objects;

        ListAdapter(Context context, List<Element> elements) {
            ctx = context;
            objects = elements;
            lInflater = (LayoutInflater) ctx
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        // кол-во элементов
        @Override
        public int getCount() {
            return objects.size();
        }

        // элемент по позиции
        @Override
        public Object getItem(int element) {
            return objects.get(element);
        }

        // id по позиции
        @Override
        public long getItemId(int position) {
            return position;
        }

        // пункт списка
        @SuppressLint("ResourceType")
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // используем созданные, но не используемые view
            View view = convertView;
            if (view == null) {
                view = lInflater.inflate(R.layout.element, parent, false);
            }

            Element p = getElement(position);

            // заполняем View в пункте списка данными из товаров: наименование, цена
            // и картинка
            ((TextView) view.findViewById(R.id.index)).setText( (position+1) + ". ");
            ((TextView) view.findViewById(R.id.name)).setText(p.getName());
            ((TextView) view.findViewById(R.id.date)).setText(date(p.getLastSeen()));
            if(p.isFavourite()){
                ((ImageView) view.findViewById(R.id.isFavourite)).setImageResource(R.drawable.favourite_true1);
            } else{
                ((ImageView) view.findViewById(R.id.isFavourite)).setImageResource(R.drawable.favourite_false1);
            }
            return view;
        }

        // товар по позиции
        Element getElement(int position) {
            return ((Element) getItem(position));
        }
    }
