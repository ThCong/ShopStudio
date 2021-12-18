package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.model.Product;
import com.example.mytest.R;

import java.util.List;


public class Product_List_Adapter extends BaseAdapter {
    Context context;
    int layout;
    List<Product> products;

    public Product_List_Adapter(Context context, int layout, List<Product> products) {
        this.context = context;
        this.layout = layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if ( convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(layout, null);
            viewHolder.imvThumb=(ImageView) convertView.findViewById(R.id.imvThumb);
            viewHolder.txtName=(TextView) convertView.findViewById(R.id.txtName);
            viewHolder.txtPrice=(TextView) convertView.findViewById(R.id.txtPrice);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Product p= products.get(i);
        viewHolder.txtName.setText(p.getName());
        viewHolder.imvThumb.setImageResource(p.getThumb());
        viewHolder.txtPrice.setText(String.valueOf(p.getPrice()));
        return convertView;
    }

    private class ViewHolder{
        TextView txtName,txtPrice;
        ImageView imvThumb;
    }
}

