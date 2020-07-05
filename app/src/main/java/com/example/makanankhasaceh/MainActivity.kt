package com.example.makanankhasaceh

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()


    private fun startShimmerAnnimation() {
        shimmerLayout.startShimmer()
        shimmerLayout.setVisibility(View.VISIBLE)
        rvMakanan.setVisibility(View.GONE)
    }

    private fun stopShimmerAnnimation() {
        shimmerLayout.stopShimmer()
        shimmerLayout.setVisibility(View.GONE)
        rvMakanan.setVisibility(View.VISIBLE)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvMakanan = findViewById(R.id.rv_makanan)
        rvMakanan.setHasFixedSize(true)

        list.addAll(dataMakanan.listData)

        startShimmerAnnimation()
        Handler().postDelayed({
            stopShimmerAnnimation()
        },3500)
        showRecyclerList()
    }

    private fun showSelectedMakanan(makanan: Makanan) {
        Toast.makeText(this, "Menampilkan Tentang " + makanan.nama, Toast.LENGTH_SHORT).show()
        val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_NAME, makanan.nama)
        moveIntent.putExtra(DetailActivity.EXTRA_DETAIL, makanan.detail)
        moveIntent.putExtra(DetailActivity.EXTRA_IMG, makanan.photo)
        startActivity(moveIntent)

    }

    private fun showRecyclerList(){
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = ListMakananAdapter(list)
        rvMakanan.adapter = listMakananAdapter
        listMakananAdapter.setOnItemClickCallback(object : ListMakananAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Makanan) {
                showSelectedMakanan(data)
            }
        })
    }
}
