package com.example.waittimes;
// WaitTimeAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class WaitTimeAdapter extends RecyclerView.Adapter<WaitTimeAdapter.WaitTimeViewHolder> {
    private List<WaitTimeItem> waitTimeItemList;

    public WaitTimeAdapter(List<WaitTimeItem> waitTimeItemList) {
        this.waitTimeItemList = waitTimeItemList;
    }

    @NonNull
    @Override
    public WaitTimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new WaitTimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WaitTimeViewHolder holder, int position) {
        WaitTimeItem currentItem = waitTimeItemList.get(position);
        holder.nameTextView.setText(currentItem.getName());
        holder.waitTimeTextView.setText("Wait Time: " + currentItem.getWaitTime());
    }

    @Override
    public int getItemCount() {
        return waitTimeItemList.size();
    }

    public static class WaitTimeViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView waitTimeTextView;

        public WaitTimeViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            waitTimeTextView = itemView.findViewById(R.id.waitTimeTextView);
        }
    }
}
