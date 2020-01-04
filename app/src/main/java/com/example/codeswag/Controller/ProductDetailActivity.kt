package com.example.codeswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.codeswag.Model.Product
import com.example.codeswag.R
import com.example.codeswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.prodduct_list_item.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetalle = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        detailName.text = productDetalle.title
        detailPrice.text = productDetalle.price
        val resourceId = this.resources.getIdentifier(productDetalle.image, "drawable",this.packageName)
        detailImage.setImageResource(resourceId)

    }
}
