package io.ckmk.memegen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import io.ckmk.memegen.databinding.ActivityMainBinding
import io.ckmk.memegen.adapter.home.HomeRecyclerViewAdapter
import io.ckmk.memegen.viewmodel.home.HomeViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    private var homeRecyclerViewAdapter: HomeRecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        homeViewModel.gifs.observe(this) { gifs ->
            homeRecyclerViewAdapter = HomeRecyclerViewAdapter(this, gifs)
            binding.recyclerView.adapter = homeRecyclerViewAdapter
        }

        homeViewModel.getTrendGifs()
    }
}