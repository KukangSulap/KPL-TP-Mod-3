package com.barney.kpltpmod3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends ArrayAdapter<KodePos> {
   public ListAdapter(Context context, int resource, List<KodePos> list)
   {
      super(context,resource,list);
   }


   @Override
   public View getView(int position, View convertView, ViewGroup parent)
   {
      KodePos kodePos = getItem(position);

      if(convertView == null)
      {
         convertView = LayoutInflater.from(getContext()).inflate(R.layout.cell, parent, false);
      }
      TextView txtKelurahan = (TextView) convertView.findViewById(R.id.kelurahan);
      TextView txtKodePos = (TextView) convertView.findViewById(R.id.kode_pos);

      txtKelurahan.setText(kodePos.getKelurahan());
      txtKodePos.setText(kodePos.getKodePos());

      return convertView;
   }
}
