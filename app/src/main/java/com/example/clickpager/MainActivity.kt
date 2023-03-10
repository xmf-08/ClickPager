package com.example.clickpager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clickpager.adapters.MyFragmentViewPagerAdapter
import com.example.clickpager.databinding.ActivityMainBinding
import com.example.clickpager.models.MyShablon

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var list: ArrayList<MyShablon>
    private lateinit var myFragmentViewPagerAdapter: MyFragmentViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.keyingi.setOnClickListener {
            binding.myViewPager.setCurrentItem(binding.myViewPager.currentItem +1, true)
        }

        list = ArrayList()

        list.add(MyShablon("https://www.uzgps.uz/storage/app/uploads/public/5eb/958/6ce/5eb9586cea4ad812131145.png", "Click va Payme"))
        list.add(MyShablon("https://play-lh.googleusercontent.com/SREaVATD32vV4IU-dnK4CqbXpQQu1cowTiZ3iQC-8YxtRyX6VnFixXK74HwRl9UgB8g=w240-h480-rw", "Barcha Operatorlar"))
        list.add(MyShablon("https://www.thewindowsclub.com/wp-content/uploads/2020/09/edit-string-value.png?ezimgfmt=ngcb192/notWebP", "Tariflarni Filtirlash"))

        myFragmentViewPagerAdapter = MyFragmentViewPagerAdapter(supportFragmentManager, list)
        binding.myViewPager.adapter = myFragmentViewPagerAdapter

        binding.myTabLayout.setupWithViewPager(binding.myViewPager)
    }
}