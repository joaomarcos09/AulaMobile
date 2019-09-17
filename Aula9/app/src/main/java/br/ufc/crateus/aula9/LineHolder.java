package br.ufc.crateus.aula9;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class LineHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView email;

    public LineHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.textView2);
        email = (TextView) itemView.findViewById(R.id.tvEmail);
    }
}
