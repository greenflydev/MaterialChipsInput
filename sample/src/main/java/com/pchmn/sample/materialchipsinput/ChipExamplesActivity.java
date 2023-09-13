package com.pchmn.sample.materialchipsinput;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.pchmn.materialchips.ChipView;
import com.pchmn.sample.materialchipsinput.databinding.ActivityChipExamplesBinding;

public class ChipExamplesActivity extends AppCompatActivity {

    private static final String TAG = ChipExamplesActivity.class.toString();
    
    private ActivityChipExamplesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = ActivityChipExamplesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // chip 1
        binding.chip1.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip1.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        binding.chip1.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip1.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 2
        binding.chip2.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip2.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 3
        binding.chip3.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip3.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        binding.chip3.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip3.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 4
        binding.chip4.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip4.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        binding.chip4.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip4.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 5
        binding.chip5.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip5.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 6
        binding.chip6.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip6.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        binding.chip6.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip6.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 7
        binding.chip7.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip7.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        binding.chip7.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, binding.chip7.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });


        // programmatically
        Uri uri = null;
        ChipView chipView1 = new ChipView(this);
        chipView1.setLabel("Pritesh");
        chipView1.setPadding(2,2,2,2);
        chipView1.setHasAvatarIcon(true);

        ChipView chipView2 = new ChipView(this);
        chipView2.setLabel("Test 1");
        chipView2.setChipBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        chipView2.setLabelColor(ContextCompat.getColor(this, R.color.colorPrimary));
        chipView2.setAvatarIcon(uri);
        chipView2.setDeleteIconColor(ContextCompat.getColor(this, R.color.colorPrimary));

        binding.layout.addView(chipView1);
        binding.layout.addView(chipView2);
    }
}
