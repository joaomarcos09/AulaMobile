package br.ufc.crateus.aula8;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class LineHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView age;
    public TextView city;
    public ImageButton deleteButton;

    public LineHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.recycler_text);
        age = (TextView) itemView.findViewById(R.id.recycler_age);
        city = (TextView) itemView.findViewById(R.id.recycler_city);
        deleteButton = (ImageButton) itemView.findViewById(R.id.recycler_delete);
    }
}