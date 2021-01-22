package com.example.contacts2020;

import android.annotation.SuppressLint;
import android.content.Context;
//import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class ContactsAdapter  extends ArrayAdapter<Contact> {

    private Context context;// the class that be using here
    private List<Contact> contacts;

    public ContactsAdapter(Context context, List<Contact> list) {
        super(context, R.layout.row_layout,list);
        this.context=context;
        this.contacts=list;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //assert inflater != null;

            assert inflater != null;
            convertView = inflater.inflate(R.layout.row_layout, parent, false);




        //convertView=inflater.inflate(R.layout.row_layout,parent,false);

        TextView tvChar=convertView.findViewById(R.id.tvChar);
        TextView tvName=convertView.findViewById(R.id.tvName);
        TextView tvMail=convertView.findViewById(R.id.tvMail);

        tvChar.setText(String.format("%s", contacts.get(position).getName().toUpperCase().charAt(0)+""));
        tvName.setText(contacts.get(position).getName());
        tvMail.setText(contacts.get(position).getEmail());


        return convertView;
    }
}
