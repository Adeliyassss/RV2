package com.example.rv2.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.rv2.R;
import com.example.rv2.databinding.ItemCarBinding;
import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarsViewHolder> {

	ArrayList<Car> arrayListForAdapter;
	CarClick onCarClick;

	public CarsAdapter(ArrayList<Car> arrayList , CarClick carClick) {
		arrayListForAdapter = arrayList;
		onCarClick = carClick;
	}

	@NonNull
	@Override
	public CarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new CarsViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false));
	}

	@Override
	public void onBindViewHolder(@NonNull CarsViewHolder holder, int position) {
		holder.onBind(arrayListForAdapter.get(position));
		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				onCarClick.onClick(arrayListForAdapter.get(holder.getAdapterPosition()));
			}
		});
	}

	@Override
	public int getItemCount() {
		return arrayListForAdapter.size();
	}

	public static class CarsViewHolder extends RecyclerView.ViewHolder {

		ItemCarBinding binding;
		ImageView imageView;
		TextView textView;

		public CarsViewHolder(@NonNull ItemCarBinding itemCarBinding) {
			super(itemCarBinding.getRoot());
			this.binding=itemCarBinding;
		}

		public void onBind(Car car) {
			binding.imageViewMain.setImageResource(car.getImage());
			binding.textViewName.setText(car.getName());
		}
	}
}
