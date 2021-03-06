package com.seggsmen.finalapp

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.seggsmen.finalapp.databinding.ActivityNewMealAddPhotoBinding
import com.seggsmen.finalapp.logic.Const
import com.seggsmen.finalapp.logic.NewMeal

class NewMealAddPhotoActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewMealAddPhotoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewMealAddPhotoBinding.inflate (layoutInflater);
        binding.skipButton.setOnClickListener {onSkipClick()}

        setSupportActionBar(binding.toolbar)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbar.setNavigationOnClickListener {onBackPressed()}
        binding.galleryButton.setOnClickListener {onGalleryClick()}
        binding.cameraButton.setOnClickListener {onCameraClick()}
        binding.indicator.createIndicators(3, 1)

    }

    var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK && result.data != null) {
            val data: Intent? = result.data
            
            if (bitmapSmallEnough(data!!)) {
                val newIntent = Intent(this, NewMealPhotoTakenActivity::class.java)
                newIntent.putExtra(Const.EXTRA_CODE_IMAGE_TAKEN, data)
                newIntent.putExtra(Const.EXTRA_CODE_NEW_MEAL,intent.getParcelableExtra<NewMeal>(Const.EXTRA_CODE_NEW_MEAL))
                startActivity(newIntent)
            } else {
                Toast.makeText(
                    this,
                    "Your image is too large, it cannot be uploaded.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
    
    private fun bitmapSmallEnough(data: Intent): Boolean {
        lateinit var imageBitmap: Bitmap
        
        if (data.data != null) {
            imageBitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, data.data)
        } else {
            imageBitmap = data?.extras?.get("data") as Bitmap
        }
        
        return (imageBitmap.byteCount < Const.MAX_BITMAP_SIZE)
    }

    private fun onGalleryClick() {
        val openGalleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        resultLauncher.launch(openGalleryIntent)
    }

    private fun onCameraClick() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        resultLauncher.launch(takePictureIntent)
    }

    private fun onSkipClick() {
        val newIntent = Intent(this, NewMealServingActivity::class.java)
        newIntent.putExtra(Const.EXTRA_CODE_NEW_MEAL, intent.getParcelableExtra<NewMeal>(Const.EXTRA_CODE_NEW_MEAL))
        startActivity(newIntent)
    }
}