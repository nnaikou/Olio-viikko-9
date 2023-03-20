package com.example.viikko9tehtava;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userIconImage;
    TextView userFullName, userEmail, userDegreeProgram;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userIconImage = itemView.findViewById(R.id.ivUserIconImage);
        userFullName = itemView.findViewById(R.id.txtFullName);
        userEmail = itemView.findViewById(R.id.txtEmail);
        userDegreeProgram = itemView.findViewById(R.id.txtDergreeProgram);
    }
}
